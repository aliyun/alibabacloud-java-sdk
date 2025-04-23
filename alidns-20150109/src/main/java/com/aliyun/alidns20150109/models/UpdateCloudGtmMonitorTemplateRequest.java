// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US (default): English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of retries. The system will only judge the application service as abnormal after consecutive monitoring failures to prevent inaccurate monitoring results due to momentary network fluctuations or other reasons. Available retry options are:</p>
     * <ul>
     * <li>1 </li>
     * <li>2 </li>
     * <li>3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The extended information. The value of this parameter is a JSON string. The required parameters vary based on the health check protocol.</p>
     * <ul>
     * <li><p>HTTP or HTTPS:</p>
     * <p>host: the Host field of an HTTP or HTTPS request header during an HTTP or HTTPS health check. The parameter value indicates the HTTP website that you want to visit. By default, the value is the primary domain name. You can change the value based on your business requirements.</p>
     * <p>path: the URL for HTTP or HTTPS health checks. Default value: /.</p>
     * <p>code: the alert threshold. During an HTTP or HTTPS health check, the system checks whether a web server functions as expected based on the status code that is returned from the web server. If the returned status code is greater than the specified threshold, the corresponding application service address is deemed abnormal. Valid values:</p>
     * <ul>
     * <li>400: specifies an invalid request. If an HTTP or HTTPS request contains invalid request parameters, a web server returns a status code that is greater than 400. You must set path to an exact URL if you set code to 400.</li>
     * <li>500: specifies a server error. If some exceptions occur on a web server, the web server returns a status code that is greater than 500. This value is used by default.</li>
     * </ul>
     * <p>sni: specifies whether to enable Server Name Indication (SNI). This parameter is used only when the health check protocol is HTTPS. SNI is an extension to the Transport Layer Security (TLS) protocol, which allows a client to specify the host to be connected when the client sends a TLS handshake request. TLS handshakes occur before any data of HTTP requests is sent. Therefore, SNI enables servers to identify the services that clients are attempting to access before certificates are sent. This allows the servers to present correct certificates to the clients. Valid values:</p>
     * <ul>
     * <li>true: enables SNI.</li>
     * <li>false: disables SNI.</li>
     * </ul>
     * <p>followRedirect: specifies whether to follow 3XX redirects. Valid values:</p>
     * <ul>
     * <li>true: follows 3XX redirects. You are redirected to the destination address if a 3XX status code such as 301, 302, 303, 307, or 308 is returned.</li>
     * <li>false: does not follow 3XX redirects.</li>
     * </ul>
     * </li>
     * <li><p>ping:</p>
     * <p>packetNum: the total number of Internet Control Message Protocol (ICMP) packets that are sent to the address for each ping-based health check. Valid values: 20, 50, and 100.</p>
     * <p>packetLossRate: the ICMP packet loss rate for each ping-based health check. The packet loss rate in a health check can be calculated by using the following formula: Packet loss rate in a health check = (Number of lost packets/Total number of sent ICMP packets) × 100%. If the packet loss rate reaches the threshold, an alert is triggered. Valid values: 10, 30, 40, 80, 90, and 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>Percentage of selected node probe failures (%), that is, the percentage of abnormal detection points among the total detection points. When the failure ratio exceeds the set threshold, the service address is judged as abnormal. The available failure ratio thresholds are:</p>
     * <ul>
     * <li>20</li>
     * <li>50</li>
     * <li>80</li>
     * <li>100</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("FailureRate")
    public Integer failureRate;

    /**
     * <p>The time interval (in seconds) for each health check probe. By default, it probes every 60 seconds. The minimum supported interval for health checks is 15 seconds, available for flagship edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The health check nodes. You can call the <a href="https://help.aliyun.com/document_detail/2797327.html">ListCloudGtmMonitorNodes</a> operation to obtain the health check nodes.</p>
     */
    @NameInMap("IspCityNodes")
    public java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes;

    /**
     * <p>The name of the health check probe template, which is generally recommended to be distinguishable and memorable for configuration personnel, ideally indicating the health check protocol for easier identification.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the health check template that you want to modify. This ID uniquely identifies the health check template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100**80</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Probe timeout (in milliseconds), data packets not returned within the timeout period are considered as health check timeouts:</p>
     * <ul>
     * <li>2000</li>
     * <li>3000</li>
     * <li>5000</li>
     * <li>10000</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateCloudGtmMonitorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateRequest self = new UpdateCloudGtmMonitorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmMonitorTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmMonitorTemplateRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateCloudGtmMonitorTemplateRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public UpdateCloudGtmMonitorTemplateRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public UpdateCloudGtmMonitorTemplateRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateCloudGtmMonitorTemplateRequest setIspCityNodes(java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public java.util.List<UpdateCloudGtmMonitorTemplateRequestIspCityNodes> getIspCityNodes() {
        return this.ispCityNodes;
    }

    public UpdateCloudGtmMonitorTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCloudGtmMonitorTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCloudGtmMonitorTemplateRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateCloudGtmMonitorTemplateRequestIspCityNodes extends TeaModel {
        /**
         * <p>The city code of the health check node.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The Internet service provider (ISP) code of the health check node.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateCloudGtmMonitorTemplateRequestIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudGtmMonitorTemplateRequestIspCityNodes self = new UpdateCloudGtmMonitorTemplateRequestIspCityNodes();
            return TeaModel.build(map, self);
        }

        public UpdateCloudGtmMonitorTemplateRequestIspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateCloudGtmMonitorTemplateRequestIspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
