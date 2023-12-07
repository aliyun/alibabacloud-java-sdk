// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseRegionServersRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The query date.</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field that you use to sort the query results. Valid value:</p>
     * <br>
     * <p>*   regionCount: the number of regions.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid value:</p>
     * <br>
     * <p>*   ASC: in ascending order</p>
     * <p>*   DESC: in descending order</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The RegionServer hosts.</p>
     */
    @NameInMap("RegionServerHosts")
    public java.util.List<String> regionServerHosts;

    public static ListDoctorHBaseRegionServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHBaseRegionServersRequest self = new ListDoctorHBaseRegionServersRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorHBaseRegionServersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorHBaseRegionServersRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorHBaseRegionServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHBaseRegionServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHBaseRegionServersRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorHBaseRegionServersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorHBaseRegionServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorHBaseRegionServersRequest setRegionServerHosts(java.util.List<String> regionServerHosts) {
        this.regionServerHosts = regionServerHosts;
        return this;
    }
    public java.util.List<String> getRegionServerHosts() {
        return this.regionServerHosts;
    }

}
