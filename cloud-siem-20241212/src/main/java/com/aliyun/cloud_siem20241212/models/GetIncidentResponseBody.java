// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetIncidentResponseBody extends TeaModel {
    @NameInMap("Incident")
    public GetIncidentResponseBodyIncident incident;

    /**
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
         * <strong>example:</strong>
         * <p>1757386075000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>dr-fy2zvgiykjifbiim****</p>
         */
        @NameInMap("DetectionRuleId")
        public String detectionRuleId;

        /**
         * <strong>example:</strong>
         * <p>window</p>
         */
        @NameInMap("IncidentAggregationType")
        public String incidentAggregationType;

        /**
         * <strong>example:</strong>
         * <p>Forti incident desc</p>
         */
        @NameInMap("IncidentDescription")
        public String incidentDescription;

        /**
         * <strong>example:</strong>
         * <p>Forti</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <strong>example:</strong>
         * <p>Remark</p>
         */
        @NameInMap("IncidentRemark")
        public String incidentRemark;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IncidentStatus")
        public Integer incidentStatus;

        /**
         * <strong>example:</strong>
         * <p>[&quot;sys:data_source:waf&quot;]</p>
         */
        @NameInMap("IncidentTags")
        public String incidentTags;

        /**
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <strong>example:</strong>
         * <p>1234567890xxxxxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RelateAlertCount")
        public Integer relateAlertCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RelateAssetCount")
        public Integer relateAssetCount;

        /**
         * <strong>example:</strong>
         * <p>[&quot;siem&quot;]</p>
         */
        @NameInMap("RelateDataSourceIds")
        public Object relateDataSourceIds;

        /**
         * <strong>example:</strong>
         * <p>[&quot;176618589410****&quot;,&quot;1130916744888****&quot;]</p>
         */
        @NameInMap("RelateUserIds")
        public Object relateUserIds;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("ThreatScore")
        public String threatScore;

        /**
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
