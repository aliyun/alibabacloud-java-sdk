// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorApplicationsRequest extends TeaModel {
    /**
     * <p>The IDs of jobs that are submitted to YARN.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The field that you use to sort the query results. Valid values:</p>
     * <ol>
     * <li>startTime: the time when the job starts</li>
     * <li>endTime: the time when the job ends</li>
     * <li>vcoreUtilization: the vCPU utilization of the job</li>
     * <li>memUtilization: the memory usage of the job</li>
     * <li>vcoreSeconds: the aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running</li>
     * <li>memSeconds: the aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running</li>
     * <li>score: the score of the job</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>score</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li>ASC: the ascending order</li>
     * <li>DESC: the descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The YARN queues to which the jobs are submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Queues")
    public java.util.List<String> queues;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The YARN engines to which the jobs are submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The users who submit the jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
