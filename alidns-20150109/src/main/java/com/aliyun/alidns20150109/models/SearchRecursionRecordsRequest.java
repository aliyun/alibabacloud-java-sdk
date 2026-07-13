// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchRecursionRecordsRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values: asc for ascending and dsc for descending.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The status of the DNS record. Valid values: enable and <strong>disable</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The maximum number of records to return for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sorting method. Valid values: rr, type, value, requestSource, weight, ttl, and enableStatus.</p>
     * 
     * <strong>example:</strong>
     * <p>rr</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The current page number. The value starts from 1. The default value is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. The maximum value is 100. The default value is 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The DNS resolution line. The default value is <strong>default</strong>. For more information, see <a href="https://www.alibabacloud.com/help/en/doc-detail/29807.htm">DNS resolution lines</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p><a href="https://help.aliyun.com/document_detail/29807.html">DNS Line Enumeration</a></p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">Resolution Line Enumeration</a></p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <p>The host record.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The time to live (TTL) in the local cache, in seconds. Valid values are 5, 30, 60, 3600 (1 hour), 43200 (12 hours), and 86400 (1 day). The default value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. The following types are supported:A: Maps a domain name to an IPv4 address.AAAA: Maps a domain name to an IPv6 address.CNAME: An alias record that points a domain name to another domain name.MX: A mail exchanger record that points a domain name to a mail server.TXT: A text record that contains arbitrary human-readable text.SRV: A service record that identifies a server for a specific service. This is common in directory management for Microsoft systems.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The record value.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight of the DNS record. The value ranges from 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>The zone ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169438909000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static SearchRecursionRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRecursionRecordsRequest self = new SearchRecursionRecordsRequest();
        return TeaModel.build(map, self);
    }

    public SearchRecursionRecordsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public SearchRecursionRecordsRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public SearchRecursionRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchRecursionRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchRecursionRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchRecursionRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRecursionRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRecursionRecordsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SearchRecursionRecordsRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public SearchRecursionRecordsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public SearchRecursionRecordsRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public SearchRecursionRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SearchRecursionRecordsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SearchRecursionRecordsRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public SearchRecursionRecordsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
