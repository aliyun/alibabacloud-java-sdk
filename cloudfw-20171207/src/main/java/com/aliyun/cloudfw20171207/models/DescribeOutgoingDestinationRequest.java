// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationRequest extends TeaModel {
    /**
     * <p>The policy coverage status.</p>
     * 
     * <strong>example:</strong>
     * <p>FullCoverage</p>
     */
    @NameInMap("AclCoverage")
    public String aclCoverage;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AliYun</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.111XXX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749089441</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to collect statistics only on traffic that accesses AI services. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language type of the received message.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.111.53XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.96.74.XXX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The security policy for Outbound Domain of outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("SecuritySuggest")
    public String securitySuggest;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>InBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The IP address of the access source. (This field is deprecated.)</p>
     * 
     * <strong>example:</strong>
     * <p>106.3.198.XXX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1749657600</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tag ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FirstFlow</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static DescribeOutgoingDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationRequest self = new DescribeOutgoingDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationRequest setAclCoverage(String aclCoverage) {
        this.aclCoverage = aclCoverage;
        return this;
    }
    public String getAclCoverage() {
        return this.aclCoverage;
    }

    public DescribeOutgoingDestinationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public DescribeOutgoingDestinationRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDestinationRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDestinationRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeOutgoingDestinationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDestinationRequest setIsAITraffic(String isAITraffic) {
        this.isAITraffic = isAITraffic;
        return this;
    }
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    public DescribeOutgoingDestinationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDestinationRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDestinationRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDestinationRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeOutgoingDestinationRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingDestinationRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDestinationRequest setSecuritySuggest(String securitySuggest) {
        this.securitySuggest = securitySuggest;
        return this;
    }
    public String getSecuritySuggest() {
        return this.securitySuggest;
    }

    public DescribeOutgoingDestinationRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    @Deprecated
    public DescribeOutgoingDestinationRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingDestinationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDestinationRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
