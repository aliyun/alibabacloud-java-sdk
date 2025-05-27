// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeCloudSiemEventDetailResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudSiemEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventDetailResponseBody self = new DescribeCloudSiemEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemEventDetailResponseBody setData(DescribeCloudSiemEventDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudSiemEventDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudSiemEventDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemEventDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemEventDetailResponseBodyDataAttckStages extends TeaModel {
        @NameInMap("AlertNum")
        public Integer alertNum;

        @NameInMap("TacticId")
        public String tacticId;

        @NameInMap("TacticName")
        public String tacticName;

        public static DescribeCloudSiemEventDetailResponseBodyDataAttckStages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventDetailResponseBodyDataAttckStages self = new DescribeCloudSiemEventDetailResponseBodyDataAttckStages();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventDetailResponseBodyDataAttckStages setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventDetailResponseBodyDataAttckStages setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

        public DescribeCloudSiemEventDetailResponseBodyDataAttckStages setTacticName(String tacticName) {
            this.tacticName = tacticName;
            return this;
        }
        public String getTacticName() {
            return this.tacticName;
        }

    }

    public static class DescribeCloudSiemEventDetailResponseBodyData extends TeaModel {
        /**
         * <p>The number of alerts that are associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AlertNum")
        public Integer alertNum;

        /**
         * <p>The ID of the Alibaba Cloud account to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The number of assets that are associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AssetNum")
        public Integer assetNum;

        /**
         * <p>The tags of the ATT\&amp;CK attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;T1595.002 Vulnerability Scanning&quot;]</p>
         */
        @NameInMap("AttCkLabels")
        public java.util.List<String> attCkLabels;

        @NameInMap("AttckStages")
        public java.util.List<DescribeCloudSiemEventDetailResponseBodyDataAttckStages> attckStages;

        /**
         * <p>The source of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>[sas,waf]</p>
         */
        @NameInMap("DataSources")
        public java.util.List<String> dataSources;

        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>The threat event contains 13 Miner Network,1 Execute suspicious encoded commands on Linux, etc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the event in English.</p>
         * 
         * <strong>example:</strong>
         * <p>The threat event contains 13 Miner Network,1 Execute suspicious encoded commands on Linux, etc</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <p>The extended information of the event in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;event_transfer_type&quot;:&quot;customize_rule&quot;}</p>
         */
        @NameInMap("ExtContent")
        public String extContent;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the event was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
         */
        @NameInMap("IncidentName")
        public String incidentName;

        /**
         * <p>The name of the event in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
         */
        @NameInMap("IncidentNameEn")
        public String incidentNameEn;

        @NameInMap("IncidentType")
        public String incidentType;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>Users associated with the event.</p>
         */
        @NameInMap("ReferAccount")
        public String referAccount;

        /**
         * <p>The remarks of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>dealed</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>0: not handled</li>
         * <li>1: handing</li>
         * <li>5: handling failed</li>
         * <li>10: handled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li>serious: high</li>
         * <li>suspicious: medium</li>
         * <li>remind: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <p>The risk score of the event. The score ranges from 0 to 100. A higher score indicates a higher risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>90.2</p>
         */
        @NameInMap("ThreatScore")
        public Float threatScore;

        public static DescribeCloudSiemEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventDetailResponseBodyData self = new DescribeCloudSiemEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAssetNum(Integer assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Integer getAssetNum() {
            return this.assetNum;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAttCkLabels(java.util.List<String> attCkLabels) {
            this.attCkLabels = attCkLabels;
            return this;
        }
        public java.util.List<String> getAttCkLabels() {
            return this.attCkLabels;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setAttckStages(java.util.List<DescribeCloudSiemEventDetailResponseBodyDataAttckStages> attckStages) {
            this.attckStages = attckStages;
            return this;
        }
        public java.util.List<DescribeCloudSiemEventDetailResponseBodyDataAttckStages> getAttckStages() {
            return this.attckStages;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setExtContent(String extContent) {
            this.extContent = extContent;
            return this;
        }
        public String getExtContent() {
            return this.extContent;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentNameEn(String incidentNameEn) {
            this.incidentNameEn = incidentNameEn;
            return this;
        }
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentType(String incidentType) {
            this.incidentType = incidentType;
            return this;
        }
        public String getIncidentType() {
            return this.incidentType;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setReferAccount(String referAccount) {
            this.referAccount = referAccount;
            return this;
        }
        public String getReferAccount() {
            return this.referAccount;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribeCloudSiemEventDetailResponseBodyData setThreatScore(Float threatScore) {
            this.threatScore = threatScore;
            return this;
        }
        public Float getThreatScore() {
            return this.threatScore;
        }

    }

}
