// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListDoctorComputeSummaryRequest extends TeaModel {
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
     * <p>The resource types, which are used to filter query results. Valid values:</p>
     * <ul>
     * <li>engine: filters results by engine.</li>
     * <li>queue: filters results by queue.</li>
     * <li>cluster: displays the results at the cluster level.</li>
     * </ul>
     * <p>If you do not specify this parameter, the information at the cluster level is displayed by default. Currently, only one resource type is supported. If you specify multiple resource types, the first resource type is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ComponentTypes")
    public java.util.List<String> componentTypes;

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
     * <p>The basis on which you want to sort the query results. Valid values:</p>
     * <ol>
     * <li>vcoreSeconds: the total CPU consumption over time in seconds.</li>
     * <li>memSeconds: the total memory consumption over time in seconds.</li>
     * <li>vcoreUtilization: the average CPU utilization. The meaning is the same as the %CPU parameter in the output of the top command in Linux.</li>
     * <li>memUtilization: the average memory usage.</li>
     * <li>vcoreSecondsDayGrowthRatio: the day-to-day growth rate of the total CPU consumption over time in seconds.</li>
     * <li>memSecondsDayGrowthRatio: the day-to-day growth rate of the total memory consumption over time in seconds.</li>
     * <li>readSize: the total amount of data read from the file system.</li>
     * <li>writeSize: the total amount of data written to the file system.</li>
     * <li>healthyJobCount: the total number of healthy jobs.</li>
     * <li>subHealthyJobCount: the total number of sub-healthy jobs.</li>
     * <li>unhealthyJobCount: the total number of unhealthy jobs.</li>
     * <li>needAttentionJobCount: the total number of jobs that require attention.</li>
     * <li>score: the score for jobs.</li>
     * <li>scoreDayGrowthRatio: the day-to-day growth rate of the score for jobs.</li>
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
     * <li>ASC: in ascending order.</li>
     * <li>DESC: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
