// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    /**
     * <p>The threat level of the alert. Valid values:</p>
     * <ul>
     * <li>5: critical.</li>
     * <li>4: high-risk.</li>
     * <li>3: medium-risk.</li>
     * <li>2: low-risk.</li>
     * <li>1: informational.</li>
     * </ul>
     */
    @NameInMap("AlertLevel")
    public java.util.List<String> alertLevel;

    /**
     * <p>The alert ID associated with the event.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The end time of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>1766801904000</p>
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
     * <p>The pagination token. You do not need to specify this parameter for the first request or if no more results exist. If more results exist, set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong> (default): ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li>GmtCreate: creation time.</li>
     * <li>GmtModified: update time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

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
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;, &quot;Value&quot;:&quot;100&quot;}</code>: the top 100 queries with the longest execution duration.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: completed queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;running&quot;}</code>: running queries.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;30&quot;,&quot;Max&quot;:&quot;50&quot;}</code>: queries with a custom execution duration range. You can specify the minimum and maximum execution duration. <strong>Min</strong> specifies the minimum execution duration. <strong>Max</strong> specifies the maximum execution duration. Unit: milliseconds (ms).<ul>
     * <li>If only <strong>Min</strong> is specified, queries with an execution duration greater than this value are returned.</li>
     * <li>If only <strong>Max</strong> is specified, queries with an execution duration less than this value are returned.</li>
     * <li>If both <strong>Min</strong> and <strong>Max</strong> are specified, queries with an execution duration greater than or equal to <strong>Min</strong> and less than or equal to <strong>Max</strong> are returned.</li>
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
     * <li>cn-hangzhou: Your assets are located in the Chinese mainland or Hong Kong (China).</li>
     * <li>ap-southeast-1: Your assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member accounts in the resource folder.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
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
     * <p>2025-09-30T02:23:00Z</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsRequest self = new ListAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertsRequest setAlertLevel(java.util.List<String> alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public java.util.List<String> getAlertLevel() {
        return this.alertLevel;
    }

    public ListAlertsRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public ListAlertsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAlertsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAlertsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListAlertsRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListAlertsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public ListAlertsRequest setQueryViewId(String queryViewId) {
        this.queryViewId = queryViewId;
        return this;
    }
    public String getQueryViewId() {
        return this.queryViewId;
    }

    public ListAlertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAlertsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListAlertsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListAlertsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
