// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetIncidentResponseBody extends TeaModel {
    /**
     * <p>The event information.</p>
     */
    @NameInMap("Incident")
    public GetIncidentResponseBodyIncident incident;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentResponseBody self = new GetIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentResponseBody setIncident(GetIncidentResponseBodyIncident incident) {
        this.incident = incident;
        return this;
    }
    public GetIncidentResponseBodyIncident getIncident() {
        return this.incident;
    }

    public GetIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIncidentResponseBodyIncident extends TeaModel {
        /**
         * <p>The count of attack stages associated with the event alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;AttckTactics&quot;: [
         *         {
         *             &quot;tacticName&quot;: &quot;Reconnaissance&quot;,
         *             &quot;alertNum&quot;: 0,
         *             &quot;tacticId&quot;: &quot;TA0040&quot;
         *         }
         *     ]
         * }</p>
         */
        @NameInMap("AttckTactics")
        public Object attckTactics;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1757386075000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-fy2zvgiykjifbiim****</p>
         */
        @NameInMap("DetectionRuleId")
        public String detectionRuleId;

        /**
         * <p>The event summaries type. Valid values:</p>
         * <ul>
         * <li>none: no event is generated.</li>
         * <li>graph_compute: graph computing (supported by predefined rules).</li>
         * <li>expert: expert rule.</li>
         * <li>passthrough: alerting pass-through (one-to-one).</li>
         * <li>window: same-type aggregation (window).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>window</p>
         */
        @NameInMap("IncidentAggregationType")
        public String incidentAggregationType;

        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Forti incident desc</p>
         */
        @NameInMap("IncidentDescription")
        public String incidentDescription;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Forti</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The remarks of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Remark</p>
         */
        @NameInMap("IncidentRemark")
        public String incidentRemark;

        /**
         * <p>The status of the event. Valid values:</p>
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
         * <p>The tags of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sys:data_source:waf&quot;]</p>
         */
        @NameInMap("IncidentTags")
        public String incidentTags;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The owner of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890xxxxxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The number of alerts associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RelateAlertCount")
        public Integer relateAlertCount;

        /**
         * <p>The number of assets associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RelateAssetCount")
        public Integer relateAssetCount;

        /**
         * <p>The list of associated data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;siem&quot;]</p>
         */
        @NameInMap("RelateDataSourceIds")
        public Object relateDataSourceIds;

        /**
         * <p>The list of user IDs associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;176618589410****&quot;,&quot;1130916744888****&quot;]</p>
         */
        @NameInMap("RelateUserIds")
        public Object relateUserIds;

        /**
         * <p>The response time. Unit: milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>1757386075000</p>
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
         * <p>The threat score of the event. Valid values: 0 to 100. A higher score indicates a higher risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ThreatScore")
        public String threatScore;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1757386075000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetIncidentResponseBodyIncident build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentResponseBodyIncident self = new GetIncidentResponseBodyIncident();
            return TeaModel.build(map, self);
        }

        public GetIncidentResponseBodyIncident setAttckTactics(Object attckTactics) {
            this.attckTactics = attckTactics;
            return this;
        }
        public Object getAttckTactics() {
            return this.attckTactics;
        }

        public GetIncidentResponseBodyIncident setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetIncidentResponseBodyIncident setDetectionRuleId(String detectionRuleId) {
            this.detectionRuleId = detectionRuleId;
            return this;
        }
        public String getDetectionRuleId() {
            return this.detectionRuleId;
        }

        public GetIncidentResponseBodyIncident setIncidentAggregationType(String incidentAggregationType) {
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }
        public String getIncidentAggregationType() {
            return this.incidentAggregationType;
        }

        public GetIncidentResponseBodyIncident setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public GetIncidentResponseBodyIncident setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public GetIncidentResponseBodyIncident setIncidentRemark(String incidentRemark) {
            this.incidentRemark = incidentRemark;
            return this;
        }
        public String getIncidentRemark() {
            return this.incidentRemark;
        }

        public GetIncidentResponseBodyIncident setIncidentStatus(Integer incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public Integer getIncidentStatus() {
            return this.incidentStatus;
        }

        public GetIncidentResponseBodyIncident setIncidentTags(String incidentTags) {
            this.incidentTags = incidentTags;
            return this;
        }
        public String getIncidentTags() {
            return this.incidentTags;
        }

        public GetIncidentResponseBodyIncident setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public GetIncidentResponseBodyIncident setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetIncidentResponseBodyIncident setRelateAlertCount(Integer relateAlertCount) {
            this.relateAlertCount = relateAlertCount;
            return this;
        }
        public Integer getRelateAlertCount() {
            return this.relateAlertCount;
        }

        public GetIncidentResponseBodyIncident setRelateAssetCount(Integer relateAssetCount) {
            this.relateAssetCount = relateAssetCount;
            return this;
        }
        public Integer getRelateAssetCount() {
            return this.relateAssetCount;
        }

        public GetIncidentResponseBodyIncident setRelateDataSourceIds(Object relateDataSourceIds) {
            this.relateDataSourceIds = relateDataSourceIds;
            return this;
        }
        public Object getRelateDataSourceIds() {
            return this.relateDataSourceIds;
        }

        public GetIncidentResponseBodyIncident setRelateUserIds(Object relateUserIds) {
            this.relateUserIds = relateUserIds;
            return this;
        }
        public Object getRelateUserIds() {
            return this.relateUserIds;
        }

        public GetIncidentResponseBodyIncident setResponseTime(Long responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public Long getResponseTime() {
            return this.responseTime;
        }

        public GetIncidentResponseBodyIncident setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public GetIncidentResponseBodyIncident setThreatScore(String threatScore) {
            this.threatScore = threatScore;
            return this;
        }
        public String getThreatScore() {
            return this.threatScore;
        }

        public GetIncidentResponseBodyIncident setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
