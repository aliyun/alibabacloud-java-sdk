// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListIncidentsResponseBody extends TeaModel {
    /**
     * <p>The list of incidents.</p>
     */
    @NameInMap("Incidents")
    public java.util.List<ListIncidentsResponseBodyIncidents> incidents;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIncidentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsResponseBody self = new ListIncidentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentsResponseBody setIncidents(java.util.List<ListIncidentsResponseBodyIncidents> incidents) {
        this.incidents = incidents;
        return this;
    }
    public java.util.List<ListIncidentsResponseBodyIncidents> getIncidents() {
        return this.incidents;
    }

    public ListIncidentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIncidentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIncidentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIncidentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIncidentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIncidentsResponseBodyIncidents extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1603248483000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-qo5ww6ux0uc28*****</p>
         */
        @NameInMap("DetectionRuleId")
        public String detectionRuleId;

        /**
         * <p>The name of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS unusual log in</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The remarks of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("IncidentRemark")
        public String incidentRemark;

        /**
         * <p>The status of the incident. Valid values:</p>
         * <ul>
         * <li>0: unhandled.</li>
         * <li>1: handling.</li>
         * <li>5: handling failed.</li>
         * <li>10: handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IncidentStatus")
        public Integer incidentStatus;

        /**
         * <p>The tags of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sys:data_source:siem&quot;,&quot;sys:trigger_type:auto&quot;]</p>
         */
        @NameInMap("IncidentTags")
        public String incidentTags;

        /**
         * <p>The UUID of the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>dbb1d7211c9285c862aa89385098****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The UID of the account that owns the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890xxxxxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The number of alerts associated with the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RelateAlertCount")
        public Integer relateAlertCount;

        /**
         * <p>The number of assets associated with the incident.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RelateAssetCount")
        public Integer relateAssetCount;

        /**
         * <p>The response time, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1603248483000</p>
         */
        @NameInMap("ResponseTime")
        public Long responseTime;

        /**
         * <p>The threat level. Valid values:</p>
         * <ul>
         * <li>5: critical.</li>
         * <li>4: high.</li>
         * <li>3: medium.</li>
         * <li>2: low.</li>
         * <li>1: informational.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1603248483000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListIncidentsResponseBodyIncidents build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentsResponseBodyIncidents self = new ListIncidentsResponseBodyIncidents();
            return TeaModel.build(map, self);
        }

        public ListIncidentsResponseBodyIncidents setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIncidentsResponseBodyIncidents setDetectionRuleId(String detectionRuleId) {
            this.detectionRuleId = detectionRuleId;
            return this;
        }
        public String getDetectionRuleId() {
            return this.detectionRuleId;
        }

        public ListIncidentsResponseBodyIncidents setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public ListIncidentsResponseBodyIncidents setIncidentRemark(String incidentRemark) {
            this.incidentRemark = incidentRemark;
            return this;
        }
        public String getIncidentRemark() {
            return this.incidentRemark;
        }

        public ListIncidentsResponseBodyIncidents setIncidentStatus(Integer incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public Integer getIncidentStatus() {
            return this.incidentStatus;
        }

        public ListIncidentsResponseBodyIncidents setIncidentTags(String incidentTags) {
            this.incidentTags = incidentTags;
            return this;
        }
        public String getIncidentTags() {
            return this.incidentTags;
        }

        public ListIncidentsResponseBodyIncidents setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public ListIncidentsResponseBodyIncidents setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListIncidentsResponseBodyIncidents setRelateAlertCount(Integer relateAlertCount) {
            this.relateAlertCount = relateAlertCount;
            return this;
        }
        public Integer getRelateAlertCount() {
            return this.relateAlertCount;
        }

        public ListIncidentsResponseBodyIncidents setRelateAssetCount(Integer relateAssetCount) {
            this.relateAssetCount = relateAssetCount;
            return this;
        }
        public Integer getRelateAssetCount() {
            return this.relateAssetCount;
        }

        public ListIncidentsResponseBodyIncidents setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

        public ListIncidentsResponseBodyIncidents setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public ListIncidentsResponseBodyIncidents setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
