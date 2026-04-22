// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>1741526400000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <strong>example:</strong>
     * <p>up
     * down</p>
     */
    @NameInMap("GrowType")
    public String growType;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <strong>example:</strong>
     * <p>ap-southeast-3</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
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
