// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmMonitorTemplateRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese.</p>
     * </li>
     * <li><p>en-US: English. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Make sure that the client token is unique for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of consecutive failures that must occur before the system considers the application service unhealthy. This setting helps prevent false alarms caused by transient issues such as network jitter. Valid values:</p>
     * <ul>
     * <li><p>1</p>
     * </li>
     * <li><p>2</p>
     * </li>
     * <li><p>3</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The extended information in a JSON string. The parameters vary based on the protocol.</p>
     * <ul>
     * <li><p>http(s):</p>
     * <p><strong>host</strong>: The Host field in the header of the HTTP or HTTPS request. This field identifies the website that you want to access. The default value is the primary domain name. If the destination website uses a specific host, change this value as needed.</p>
     * <p><strong>path</strong>: The URL path for the HTTP or HTTPS health check. The default value is &quot;/&quot;.</p>
     * <p><strong>code</strong>: For an HTTP or HTTPS health check, the system determines whether the web server is working correctly based on the return code. If the return code is greater than this threshold, the system considers the application service unhealthy.</p>
     * <ul>
     * <li><p>400: Bad Request. If an HTTP or HTTPS request contains incorrect parameters, the web server returns a code greater than 400. If you set the threshold to 400, make sure that you specify the exact URL path.</p>
     * </li>
     * <li><p>500: Server Error. If an exception occurs on the web server, it returns a code greater than 500. The default threshold is 500.</p>
     * </li>
     * </ul>
     * <p><strong>sni</strong>: Specifies whether to enable Server Name Indication (SNI). This parameter applies only to the HTTPS protocol. SNI is a Transport Layer Security (TLS) extension that allows a client to specify the hostname to connect to at the start of the TLS handshake. This allows the server to present the correct certificate for the requested service.</p>
     * <ul>
     * <li><p>true: Enable SNI.</p>
     * </li>
     * <li><p>false: Disable SNI.</p>
     * </li>
     * </ul>
     * <p><strong>followRedirect</strong>: Specifies whether to follow 3xx redirects.</p>
     * <ul>
     * <li><p>true: Follows the redirect if the detection point receives a 3xx status code, such as 301, 302, 303, 307, or 308.</p>
     * </li>
     * <li><p>false: Does not follow the redirect.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>ping:</p>
     * <p><strong>packetNum</strong>: The number of ICMP packets to send for each ping health check. Valid values: 20, 50, and 100.</p>
     * <p><strong>packetLossRate</strong>: The packet loss rate that triggers an alarm. For each ping health check, the system calculates the packet loss rate based on the sent ICMP packets. Packet loss rate = (Number of lost packets / Total number of sent ICMP packets) × 100%. An alarm is triggered if the packet loss rate reaches this threshold. Valid values: 10, 30, 40, 80, 90, and 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The failure rate threshold. An endpoint is considered unhealthy if the percentage of unhealthy detection points exceeds this value. Valid values:</p>
     * <ul>
     * <li><p>20</p>
     * </li>
     * <li><p>50</p>
     * </li>
     * <li><p>80</p>
     * </li>
     * <li><p>100</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("FailureRate")
    public Integer failureRate;

    /**
     * <p>The health check interval in seconds. The default value is 60. The minimum interval is 15 seconds, which is available only for Ultimate Edition instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The IP address type for health checks.</p>
     * <ul>
     * <li><p>IPv4: The destination address is an IPv4 address.</p>
     * </li>
     * <li><p>IPv6: The destination address is an IPv6 address.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>A list of detection points. For more information, see <a href="https://help.aliyun.com/document_detail/2797349.html">ListCloudGtmMonitorNodes</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNodes")
    public java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes;

    /**
     * <p>The name of the health check template. Name the template to easily identify the health check protocol.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol for health checks on the destination IP address.</p>
     * <ul>
     * <li><p>ping</p>
     * </li>
     * <li><p>tcp</p>
     * </li>
     * <li><p>http</p>
     * </li>
     * <li><p>https</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ping</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The health check timeout in milliseconds. If a packet is not returned within the timeout period, the health check is considered to have timed out. Valid values:</p>
     * <ul>
     * <li><p>2000</p>
     * </li>
     * <li><p>3000</p>
     * </li>
     * <li><p>5000</p>
     * </li>
     * <li><p>10000</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateCloudGtmMonitorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmMonitorTemplateRequest self = new CreateCloudGtmMonitorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmMonitorTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCloudGtmMonitorTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCloudGtmMonitorTemplateRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public CreateCloudGtmMonitorTemplateRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public CreateCloudGtmMonitorTemplateRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public CreateCloudGtmMonitorTemplateRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateCloudGtmMonitorTemplateRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public CreateCloudGtmMonitorTemplateRequest setIspCityNodes(java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public java.util.List<CreateCloudGtmMonitorTemplateRequestIspCityNodes> getIspCityNodes() {
        return this.ispCityNodes;
    }

    public CreateCloudGtmMonitorTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCloudGtmMonitorTemplateRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCloudGtmMonitorTemplateRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class CreateCloudGtmMonitorTemplateRequestIspCityNodes extends TeaModel {
        /**
         * <p>The city code for the detection point.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The ISP code for the detection point.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static CreateCloudGtmMonitorTemplateRequestIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudGtmMonitorTemplateRequestIspCityNodes self = new CreateCloudGtmMonitorTemplateRequestIspCityNodes();
            return TeaModel.build(map, self);
        }

        public CreateCloudGtmMonitorTemplateRequestIspCityNodes setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CreateCloudGtmMonitorTemplateRequestIspCityNodes setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
