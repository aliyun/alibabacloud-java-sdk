// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorApplicationsRequest extends TeaModel {
    /**
     * <p>The IDs of jobs that are submitted to YARN.</p>
     */
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The field that you use to sort the query results. Valid values:</p>
     * <br>
     * <p>1.  startTime: the time when the job starts</p>
     * <p>2.  endTime: the time when the job ends</p>
     * <p>3.  vcoreUtilization: the vCPU utilization of the job</p>
     * <p>4.  memUtilization: the memory usage of the job</p>
     * <p>5.  vcoreSeconds: the aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running</p>
     * <p>6.  memSeconds: the aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running</p>
     * <p>7.  score: the score of the job</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   ASC: the ascending order</p>
     * <p>*   DESC: the descending order</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The YARN queues to which the jobs are submitted.</p>
     */
    @NameInMap("Queues")
    public java.util.List<String> queues;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The YARN engines to which the jobs are submitted.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The users who submit the jobs.</p>
     */
    @NameInMap("Users")
    public java.util.List<String> users;

    public static ListDoctorApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoctorApplicationsRequest self = new ListDoctorApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDoctorApplicationsRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public ListDoctorApplicationsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListDoctorApplicationsRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public ListDoctorApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDoctorApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDoctorApplicationsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDoctorApplicationsRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListDoctorApplicationsRequest setQueues(java.util.List<String> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<String> getQueues() {
        return this.queues;
    }

    public ListDoctorApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDoctorApplicationsRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListDoctorApplicationsRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
