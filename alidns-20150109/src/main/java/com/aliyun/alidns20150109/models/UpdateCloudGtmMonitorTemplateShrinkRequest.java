// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. Make sure that the token is unique for each request. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of consecutive health check failures that must occur before an application service is considered abnormal. This helps prevent false alarms caused by transient issues such as network jitter. Valid values:</p>
     * <ul>
     * <li><p>1</p>
     * </li>
     * <li><p>2</p>
     * </li>
     * <li><p>3</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The extended information in a JSON string. The parameters vary based on the health check protocol.</p>
     * <ul>
     * <li><p>HTTP and HTTPS:</p>
     * <p>host: When you perform an HTTP or HTTPS health check, this parameter specifies the Host field in the HTTP request header. It identifies the target website. The default value is the primary domain name. If the target website has specific requirements for the Host field, modify this parameter as needed.</p>
     * <p>path: The path for the HTTP or HTTPS health check. The default value is /.</p>
     * <p>code: When you perform an HTTP or HTTPS health check, the system uses the return code from the web server to determine its status. If the return code exceeds the specified threshold, the application service is considered abnormal.</p>
     * <ul>
     * <li><p>400: Bad Request. If an HTTP or HTTPS request contains invalid parameters, the web server returns a code greater than 400. If you set the threshold to 400, make sure that you specify the exact URL path.</p>
     * </li>
     * <li><p>500: Server Error. If the web server encounters an error, it returns a code greater than 500. The default threshold is 500.</p>
     * </li>
     * </ul>
     * <p>sni: Specifies whether to enable Server Name Indication (SNI). This parameter is used only for HTTPS health checks. SNI is an extension to the Transport Layer Security (TLS) protocol. It allows a client to specify the hostname it is trying to connect to at the start of the TLS handshake. Because the TLS handshake occurs before any HTTP data is sent, SNI allows the server to know which service the client is trying to access before sending the certificate. This enables the server to present the correct certificate to the client.</p>
     * <ul>
     * <li><p>true: Enable SNI.</p>
     * </li>
     * <li><p>false: Disable SNI.</p>
     * </li>
     * </ul>
     * <p>followRedirect: Specifies whether to follow 3xx redirections.</p>
     * <ul>
     * <li><p>true: Follow the redirection if the detection point receives a 3xx status code (301, 302, 303, 307, or 308).</p>
     * </li>
     * <li><p>false: Do not follow the redirection.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Ping:</p>
     * <p>packetNum: The number of ICMP packets to send for each ping health check. Valid values: 20, 50, and 100.</p>
     * <p>packetLossRate: The packet loss rate that triggers an alarm. For each ping health check, the system calculates the packet loss rate. Packet loss rate = (Number of lost packets / Total number of sent ICMP packets) × 100%. An alarm is triggered if the packet loss rate reaches this threshold. Valid values: 10, 30, 40, 80, 90, and 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The percentage of failed detection points. An endpoint is considered abnormal if the percentage of detection points that fail the health check exceeds this threshold. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("FailureRate")
    public Integer failureRate;

    /**
     * <p>The interval between health checks in seconds. The default value is 60. The minimum interval is 15 seconds. This feature is available only for Ultimate Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The list of detection points. Call <a href="https://help.aliyun.com/document_detail/2797327.html">ListCloudGtmMonitorNodes</a> to obtain the information.</p>
     */
    @NameInMap("IspCityNodes")
    public String ispCityNodesShrink;

    /**
     * <p>The name of the health check template. For easy identification, name the template based on its health check protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique ID of the health check template that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The timeout period for a health check in milliseconds. If a packet is not returned within the specified timeout period, the health check fails. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateCloudGtmMonitorTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateShrinkRequest self = new UpdateCloudGtmMonitorTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setIspCityNodesShrink(String ispCityNodesShrink) {
        this.ispCityNodesShrink = ispCityNodesShrink;
        return this;
    }
    public String getIspCityNodesShrink() {
        return this.ispCityNodesShrink;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCloudGtmMonitorTemplateShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
