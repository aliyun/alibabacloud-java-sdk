// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmMonitorTemplatesResponseBody extends TeaModel {
    /**
     * <p>Current page number, starting from 1, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health check templates.</p>
     */
    @NameInMap("Templates")
    public ListCloudGtmMonitorTemplatesResponseBodyTemplates templates;

    /**
     * <p>Total number of health check template entries retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>Total number of pages after data pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListCloudGtmMonitorTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmMonitorTemplatesResponseBody self = new ListCloudGtmMonitorTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmMonitorTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmMonitorTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmMonitorTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudGtmMonitorTemplatesResponseBody setTemplates(ListCloudGtmMonitorTemplatesResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public ListCloudGtmMonitorTemplatesResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public ListCloudGtmMonitorTemplatesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListCloudGtmMonitorTemplatesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode extends TeaModel {
        /**
         * <p>City code.</p>
         * 
         * <strong>example:</strong>
         * <p>738</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>City name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>Country code.</p>
         * 
         * <strong>example:</strong>
         * <p>629</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>Country name.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>Probe node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP Nodes</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Probe node group types:</p>
         * <ul>
         * <li>BGP: BGP nodes</li>
         * <li>OVERSEAS: International nodes</li>
         * <li>ISP: Carrier nodes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>Operator code.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>Operator name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode self = new ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> ispCityNode;

        public static ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes self = new ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes setIspCityNode(java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

    public static class ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate extends TeaModel {
        /**
         * <p>Health check template creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-23T13:09Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Health check template creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The number of retries. The system will only judge the application service as abnormal after consecutive monitoring failures to prevent inaccurate monitoring results due to momentary network fluctuations or other reasons. Available retry options are:</p>
         * <ul>
         * <li>1 - 2 - 3</li>
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
         * <p><strong>host</strong>: the Host field of an HTTP or HTTPS request header during an HTTP or HTTPS health check. The parameter value indicates the HTTP website that you want to visit. By default, the value is the primary domain name. You can change the value based on your business requirements.</p>
         * <p><strong>path</strong>: the URL for HTTP or HTTPS health checks. Default value: /.</p>
         * <p><strong>code</strong>: the alert threshold. During an HTTP or HTTPS health check, the system checks whether a web server functions as expected based on the status code that is returned from the web server. If the returned status code is greater than the specified threshold, the corresponding application service address is deemed abnormal. Valid values:</p>
         * <ul>
         * <li>400: indicates an invalid request. If an HTTP or HTTPS request contains invalid request parameters, a web server returns a status code that is greater than 400. You must specify an exact URL for path if you set code to 400.</li>
         * <li>500: indicates a server error. If some exceptions occur on a web server, the web server returns a status code that is greater than 500. This value is used by default.</li>
         * </ul>
         * <p><strong>sni</strong>: indicates whether Server Name Indication (SNI) is enabled. This parameter is used only when the health check protocol is HTTPS. SNI is an extension to the Transport Layer Security (TLS) protocol, which allows a client to specify the host to be connected when the client sends a TLS handshake request. TLS handshakes occur before any data of HTTP requests is sent. Therefore, SNI enables servers to identify the services that clients are attempting to access before certificates are sent. This allows the servers to present correct certificates to the clients. Valid values:</p>
         * <ul>
         * <li>true: SNI is enabled.</li>
         * <li>false: SNI is disabled.</li>
         * </ul>
         * <p><strong>followRedirect</strong>: indicates whether 3XX redirects are followed. Valid values:</p>
         * <ul>
         * <li>true: 3XX redirects are followed. You are redirected to the destination address if a 3XX status code such as 301, 302, 303, 307, or 308 is returned.</li>
         * <li>false: 3XX redirects are not followed.</li>
         * </ul>
         * </li>
         * <li><p>ping:</p>
         * <p><strong>packetNum</strong>: the total number of Internet Control Message Protocol (ICMP) packets that are sent to the address for each ping-based health check. Valid values: 20, 50, and 100.</p>
         * <p><strong>packetLossRate</strong>: the ICMP packet loss rate for each ping-based health check. The packet loss rate in a health check can be calculated by using the following formula: Packet loss rate in a health check = (Number of lost packets/Total number of sent ICMP packets) × 100%. If the packet loss rate reaches the threshold, an alert is triggered. Valid values: 10, 30, 40, 80, 90, and 100.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <p>Percentage of selected node probe failures (%), that is, the percentage of unhealthy check points among total probe points. When the failure ratio exceeds the set threshold, the service address is judged as abnormal. The available failure ratio thresholds are:</p>
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
         * <p>The time interval between each check (in seconds), with a default of probing once every minute. The minimum supported health check interval is 15 seconds, available for flagship edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The IP address type of health check nodes. Valid values:</p>
         * <ul>
         * <li>IPv4: applicable when health checks are performed on IPv4 addresses.</li>
         * <li>IPv6: applicable when health checks are performed on IPv6 addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The health check nodes. You can call the <a href="~~ListCloudGtmMonitorNodes~~">ListCloudGtmMonitorNodes</a> operation to obtain the health check nodes.</p>
         */
        @NameInMap("IspCityNodes")
        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes ispCityNodes;

        /**
         * <p>The name of the health check probe template, generally for the convenience of configuration personnel to distinguish and remember.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4-Ping</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Protocol types for initiating probes to the target IP address:</p>
         * <ul>
         * <li>ping</li>
         * <li>tcp</li>
         * <li>http</li>
         * <li>https</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ping</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Remarks for the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the health check template. This ID uniquely identifies the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>Probe timeout (in milliseconds), data packets not returned within the timeout period are deemed as health check timeouts:</p>
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

        /**
         * <p>Last modification time of the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-29T13:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Health check template configuration modification time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate self = new ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setFailureRate(Integer failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public Integer getFailureRate() {
            return this.failureRate;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setIspCityNodes(ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }
        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes getIspCityNodes() {
            return this.ispCityNodes;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListCloudGtmMonitorTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> template;

        public static ListCloudGtmMonitorTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmMonitorTemplatesResponseBodyTemplates self = new ListCloudGtmMonitorTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmMonitorTemplatesResponseBodyTemplates setTemplate(java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<ListCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
