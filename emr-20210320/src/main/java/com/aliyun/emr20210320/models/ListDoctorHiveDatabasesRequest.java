// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorHiveDatabasesRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DatabaseNames")
    public java.util.List<String> databaseNames;

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

    public static ListDoctorHiveDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorHiveDatabasesRequest self = new ListDoctorHiveDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorHiveDatabasesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorHiveDatabasesRequest setDatabaseNames(java.util.List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public java.util.List<String> getDatabaseNames() {
        return this.databaseNames;
    }

    public ListDoctorHiveDatabasesRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorHiveDatabasesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorHiveDatabasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorHiveDatabasesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorHiveDatabasesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorHiveDatabasesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
