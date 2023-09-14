// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorComputeSummaryRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComponentTypes")
    public java.util.List<String> componentTypes;

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

    public static ListDoctorComputeSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorComputeSummaryRequest self = new ListDoctorComputeSummaryRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorComputeSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorComputeSummaryRequest setComponentTypes(java.util.List<String> componentTypes) {
        this.componentTypes = componentTypes;
        return this;
    }
    public java.util.List<String> getComponentTypes() {
        return this.componentTypes;
    }

    public ListDoctorComputeSummaryRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorComputeSummaryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorComputeSummaryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorComputeSummaryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorComputeSummaryRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorComputeSummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
