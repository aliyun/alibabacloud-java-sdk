// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmMonitorTemplateResponseBody extends TeaModel {
    /**
     * <p>The time when the health check template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-23T13:09Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The UNIX timestamp that indicates when the health check template was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The number of consecutive times that a health check must fail before the application service is declared abnormal. This prevents false alarms caused by transient issues such as network jitter. Valid values:</p>
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
     * <p>The extended information in a JSON string. The parameters vary based on the protocol.</p>
     * <ul>
     * <li><p>For HTTP and HTTPS:</p>
     * <p><strong>host</strong>: The Host field in the HTTP or HTTPS request header. This field identifies the website that you want to access. The default value is the primary domain name. If the target website has specific host requirements, modify this parameter.</p>
     * <p><strong>path</strong>: The URL path for HTTP or HTTPS health checks. The default value is /.</p>
     * <p><strong>code</strong>: The system determines whether the web server is working as expected based on the return code. If the return code is greater than the specified threshold, the application service is considered abnormal.</p>
     * <ul>
     * <li><p>400: Bad Request. If an HTTP or HTTPS request contains incorrect parameters, the web server returns a code greater than 400. If you set the threshold to 400, specify the exact URL path.</p>
     * </li>
     * <li><p>500: Server Error. If an exception occurs on the web server, it returns a code greater than 500. The default threshold is 500.</p>
     * </li>
     * </ul>
     * <p><strong>sni</strong>: Specifies whether to enable Server Name Indication (SNI). This parameter is used only for the HTTPS protocol. SNI is a Transport Layer Security (TLS) extension that allows a client to specify the hostname it wants to connect to at the start of the TLS handshake. This allows the server to present the correct certificate for that hostname.</p>
     * <ul>
     * <li><p>true: Enable SNI.</p>
     * </li>
     * <li><p>false: Disable SNI.</p>
     * </li>
     * </ul>
     * <p><strong>followRedirect</strong>: Specifies whether to follow 3xx redirections.</p>
     * <ul>
     * <li><p>true: If the status code returned by the detection point is 3xx (301, 302, 303, 307, or 308), the system follows the redirection.</p>
     * </li>
     * <li><p>false: The system does not follow the redirection.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For ping:</p>
     * <p><strong>packetNum</strong>: The number of ICMP packets to send for each ping health check. Valid values: 20, 50, and 100.</p>
     * <p><strong>packetLossRate</strong>: The packet loss rate threshold. For each ping health check, the system calculates the packet loss rate. If the packet loss rate reaches the threshold, an alert is triggered. Packet loss rate = (Number of lost packets / Total number of sent ICMP packets) × 100%. Valid values for the packet loss rate are 10, 30, 40, 80, 90, and 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <p>The percentage of failed detection points. If the percentage of failed detection points exceeds this value, the endpoint is declared abnormal. Valid values:</p>
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
     * <p>The IP address type of the detection points:</p>
     * <ul>
     * <li><p>IPv4: The target address is an IPv4 address.</p>
     * </li>
     * <li><p>IPv6: The target address is an IPv6 address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IspCityNodes")
    public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes ispCityNodes;

    /**
     * <p>The name of the health check template. To easily identify the template, specify a name that indicates the health check protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The protocol used to probe the target IP address:</p>
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
     * 
     * <strong>example:</strong>
     * <p>ping</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The remarks on the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6AEC7A64-3CB1-4C49-8B35-0B901F1E26BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>mtp-89518052425100****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The health check timeout period in milliseconds. If a packet is not returned within the specified timeout period, the health check fails. Valid values:</p>
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

    /**
     * <p>The time when the health check template was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-29T13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The UNIX timestamp that indicates when the health check template was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeCloudGtmMonitorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmMonitorTemplateResponseBody self = new DescribeCloudGtmMonitorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setIspCityNodes(DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode self = new DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes self = new DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
