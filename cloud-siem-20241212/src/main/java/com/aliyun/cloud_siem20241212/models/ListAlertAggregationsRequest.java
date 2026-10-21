// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAlertAggregationsRequest extends TeaModel {
    /**
     * <p>The aggregation method.</p>
     * 
     * <strong>example:</strong>
     * <p>avg</p>
     */
    @NameInMap("AggregationType")
    public String aggregationType;

    /**
     * <p>The end time of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>1773936020000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If a next page exists, set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query filter condition in JSON format. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: The 100 queries with the longest execution duration.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: Completed queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: Running queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: Custom execution duration queries. You can set the minimum and maximum execution duration. <strong>Min</strong> specifies the minimum execution duration. <strong>Max</strong> specifies the maximum execution duration. Unit: milliseconds (ms).<ul>
     * <li>If only <strong>Min</strong> is set, queries with an execution duration greater than this value are returned.</li>
     * <li>If only <strong>Max</strong> is set, queries with an execution duration less than this value are returned.</li>
     * <li>If both <strong>Min</strong> and <strong>Max</strong> are set, queries with an execution duration greater than or equal to <strong>Min</strong> and less than or equal to <strong>Max</strong> are returned.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;cost\&quot;,\&quot;Max\&quot;:\&quot;200\&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The unique identifier of the query view.</p>
     * 
     * <strong>example:</strong>
     * <p>qv-a1b2c3d4e5f6g7****</p>
     */
    @NameInMap("QueryViewId")
    public String queryViewId;

    /**
     * <p>The region where the threat analysis data management center is located. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: The view of the current Alibaba Cloud account.</li>
     * <li>1: The view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The time when the alert first occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-02-04T08:36:26Z</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlertAggregationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertAggregationsRequest self = new ListAlertAggregationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertAggregationsRequest setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }
    public String getAggregationType() {
        return this.aggregationType;
    }

    public ListAlertAggregationsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlertAggregationsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAlertAggregationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertAggregationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertAggregationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertAggregationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertAggregationsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public ListAlertAggregationsRequest setQueryViewId(String queryViewId) {
        this.queryViewId = queryViewId;
        return this;
    }
    public String getQueryViewId() {
        return this.queryViewId;
    }

    public ListAlertAggregationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAlertAggregationsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListAlertAggregationsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListAlertAggregationsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
