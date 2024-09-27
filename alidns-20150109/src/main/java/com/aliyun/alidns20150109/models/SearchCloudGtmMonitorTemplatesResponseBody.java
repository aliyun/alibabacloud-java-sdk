// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmMonitorTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health check templates.</p>
     */
    @NameInMap("Templates")
    public SearchCloudGtmMonitorTemplatesResponseBodyTemplates templates;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static SearchCloudGtmMonitorTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmMonitorTemplatesResponseBody self = new SearchCloudGtmMonitorTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setTemplates(SearchCloudGtmMonitorTemplatesResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public SearchCloudGtmMonitorTemplatesResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public SearchCloudGtmMonitorTemplatesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        /**
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The group type of health check nodes. Valid values:</p>
         * <ul>
         * <li>BGP: BGP node</li>
         * <li>OVERSEAS: node outside the Chinese mainland</li>
         * <li>ISP: Internet service provider (ISP) node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        public static SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode self = new SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> ispCityNode;

        public static SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes self = new SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes setIspCityNode(java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

    public static class SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-03-23T13:09Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        /**
         * <p>The extended information. The value of this parameter is a JSON string. The required parameters vary based on the health check protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>http(s)</strong>:</p>
         * <p><strong>host</strong>: indicates the Host field of an HTTP or HTTPS request header during an HTTP or HTTPS health check. The parameter value indicates the HTTP website that you want to visit. By default, the value is the primary domain name. You can change the value based on your business requirements.</p>
         * <p><strong>path</strong>: the URL for HTTP or HTTPS health checks. Default value: /.</p>
         * <p><strong>code</strong>: indicates the alert threshold. During an HTTP or HTTPS health check, the system checks whether a web server functions as expected based on the status code that is returned from the web server. If the returned status code is greater than the specified threshold, the corresponding application service address is deemed abnormal. Valid values:</p>
         * <ul>
         * <li>400: indicates an invalid request. If an HTTP or HTTPS request contains invalid request parameters, a web server returns a status code that is greater than 400. If Verification Content is set to &quot;The error code is greater than 400&quot;, you must specify an exact URL for the path parameter.</li>
         * <li>500: indicates a server error. If some exceptions occur on a web server, the web server returns a status code that is greater than 500. The error code that is greater than 500 is used as the alert threshold by default.</li>
         * </ul>
         * <p><strong>sni</strong>: indicates whether Server Name Indication (SNI) is enabled for HTTPS. SNI is an extension to the Transport Layer Security (TLS) protocol, which allows a client to specify the host to be connected when the client sends a TLS handshake request. TLS handshakes occur before any data of HTTP requests is sent. Therefore, SNI enables servers to identify the services that clients are attempting to access before certificates are sent. This allows the servers to present correct certificates to the clients. Valid values:</p>
         * <ul>
         * <li>true: SNI is enabled.</li>
         * <li>false: SNI is disabled.</li>
         * </ul>
         * <p><strong>followRedirect</strong>: indicates whether 3XX redirection is followed. Valid values:</p>
         * <ul>
         * <li>true: You are redirected to the destination address if a status code 3XX, such as 301, 302, 303, 307, or 308, is returned.</li>
         * <li>false: You are not redirected to the destination address.</li>
         * </ul>
         * </li>
         * <li><p><strong>ping</strong>:</p>
         * <p><strong>packetNum</strong>: The total number of Internet Control Message Protocol (ICMP) packets that are sent to the address for each ping-based health check. Valid values: 20, 50, and 100.</p>
         * <p><strong>packetLossRate</strong>: The packet loss rate for each ping-based health check. The packet loss rate in a check can be calculated by using the following formula: Packet loss rate = (Number of lost packets/Total number of sent ICMP packets) × 100%. If the packet loss rate reaches the threshold, an alert is triggered. Valid values: 10, 30, 40, 80, 90, and 100.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
         */
        @NameInMap("ExtendInfo")
        public String extendInfo;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("FailureRate")
        public Integer failureRate;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The IP address type of health check nodes. Valid values:</p>
         * <ul>
         * <li>IPv4: applicable when the destination address of health checks is an IPv4 address</li>
         * <li>IPv6: applicable when the destination address of health checks is an IPv6 address</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The health check nodes.</p>
         */
        @NameInMap("IspCityNodes")
        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes ispCityNodes;

        /**
         * <strong>example:</strong>
         * <p>IPv4-Ping</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ping</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>mtp-89518052425100**80</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>2024-03-29T13:20Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate self = new SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setFailureRate(Integer failureRate) {
            this.failureRate = failureRate;
            return this;
        }
        public Integer getFailureRate() {
            return this.failureRate;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setIspCityNodes(SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }
        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplateIspCityNodes getIspCityNodes() {
            return this.ispCityNodes;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class SearchCloudGtmMonitorTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> template;

        public static SearchCloudGtmMonitorTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            SearchCloudGtmMonitorTemplatesResponseBodyTemplates self = new SearchCloudGtmMonitorTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public SearchCloudGtmMonitorTemplatesResponseBodyTemplates setTemplate(java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<SearchCloudGtmMonitorTemplatesResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
