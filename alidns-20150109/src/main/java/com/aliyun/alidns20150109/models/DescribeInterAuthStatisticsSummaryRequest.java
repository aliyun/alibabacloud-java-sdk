// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The sort direction. Valid values:</p>
     * <ul>
     * <li><p>DESC (default): descending order</p>
     * </li>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>Warning: If the query time range is large and the domain name has an excessive volume of resolution logs, the query may time out or return inaccurate results..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1741526400000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Used for the report of subdomain names with sudden increases or decreases in request volume.</p>
     * 
     * <strong>example:</strong>
     * <p>up
     * down</p>
     */
    @NameInMap("GrowType")
    public String growType;

    /**
     * <p>The sort parameter. Valid values:</p>
     * <ul>
     * <li>createDate: sorts by creation time (default if left empty)</li>
     * <li>expireDate: sorts by expiration time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sampling period. Valid values:</p>
     * <ul>
     * <li><p>DAY: day</p>
     * </li>
     * <li><p>WEEK: week</p>
     * </li>
     * <li><p>MONTH: month.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The DNS response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <p>The region of the resolution cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-3</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <p>The route type. Valid values: cloud: cloud route. local: on-premises route.</p>
     * 
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The type of statistical metric.</p>
     * 
     * <strong>example:</strong>
     * <p>QTYPE_RATIO
     * 枚举值：
     * QTYPE_RATIO：DNS请求记录类型占比
     * RCODE_DOMAIN：否定应答域名TOP排行
     * RCODE_SOURCE_IP：某否定应答域名的请求源地址TOP排行
     * REQUEST_ZONE：域名请求量排行（zone级别）
     * REQUEST_DOMAIN：子域名请求量排行（domain name级别）
     * SOURCE_REGION：请求来源地域分布
     * SOURCE_ISP：请求来源运营商（ISP）分布
     * SOURCE_IP：请求源IP详情（含地域、运营商、占比）
     * LINE_HIT：解析线路命中详情
     * LINE_RATIO：解析线路流量占比</p>
     */
    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
     * <p>The zone name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeInterAuthStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsSummaryRequest self = new DescribeInterAuthStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsSummaryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeInterAuthStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeInterAuthStatisticsSummaryRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeInterAuthStatisticsSummaryRequest setGrowType(String growType) {
        this.growType = growType;
        return this;
    }
    public String getGrowType() {
        return this.growType;
    }

    public DescribeInterAuthStatisticsSummaryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeInterAuthStatisticsSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInterAuthStatisticsSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInterAuthStatisticsSummaryRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeInterAuthStatisticsSummaryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribeInterAuthStatisticsSummaryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribeInterAuthStatisticsSummaryRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeInterAuthStatisticsSummaryRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeInterAuthStatisticsSummaryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribeInterAuthStatisticsSummaryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
