// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHBaseRegionServersRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
