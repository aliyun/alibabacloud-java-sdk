// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainRequest extends TeaModel {
    /**
     * <p>The product category. Default value: empty. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The page number to return in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The source of the traffic statistics. Default value: Internet firewall. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>nat</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The domain name of the outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to collect statistics only on traffic that accesses AI services. Default value: no. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language type of the request message. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort method. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The public IP address of the ECS instance that initiates the outbound connection.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The sort order based on the specified field. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The intelligence tag ID. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>AliYun</p>
     */
    @NameInMap("TagIdNew")
    public String tagIdNew;

    public static DescribeOutgoingDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainRequest self = new DescribeOutgoingDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeOutgoingDomainRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDomainRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeOutgoingDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeOutgoingDomainRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDomainRequest setIsAITraffic(String isAITraffic) {
        this.isAITraffic = isAITraffic;
        return this;
    }
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    public DescribeOutgoingDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDomainRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDomainRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDomainRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDomainRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDomainRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDomainRequest setTagIdNew(String tagIdNew) {
        this.tagIdNew = tagIdNew;
        return this;
    }
    public String getTagIdNew() {
        return this.tagIdNew;
    }

}
