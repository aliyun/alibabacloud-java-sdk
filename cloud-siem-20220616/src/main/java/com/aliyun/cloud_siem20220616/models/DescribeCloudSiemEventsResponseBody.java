// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCloudSiemEventsResponseBody extends TeaModel {
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
    public DescribeCloudSiemEventsResponseBodyData data;

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

    public static DescribeCloudSiemEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudSiemEventsResponseBody self = new DescribeCloudSiemEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudSiemEventsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCloudSiemEventsResponseBody setData(DescribeCloudSiemEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudSiemEventsResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudSiemEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudSiemEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudSiemEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudSiemEventsResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCloudSiemEventsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyDataPageInfo self = new DescribeCloudSiemEventsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudSiemEventsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages extends TeaModel {
        @NameInMap("AlertNum")
        public Integer alertNum;

        @NameInMap("TacticId")
        public String tacticId;

        @NameInMap("TacticName")
        public String tacticName;

        public static DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages self = new DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages setTacticName(String tacticName) {
            this.tacticName = tacticName;
            return this;
        }
        public String getTacticName() {
            return this.tacticName;
        }

    }

    public static class DescribeCloudSiemEventsResponseBodyDataResponseData extends TeaModel {
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
         * <p>The tags of the ATT\&amp;CK techniques.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;T1595.002 Vulnerability Scanning&quot;]</p>
         */
        @NameInMap("AttCkLabels")
        public java.util.List<String> attCkLabels;

        @NameInMap("AttckStages")
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages> attckStages;

        /**
         * <p>The sources of the alert.</p>
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
         * <p>The event description in English.</p>
         * 
         * <strong>example:</strong>
         * <p>The threat event contains 13 Miner Network,1 Execute suspicious encoded commands on Linux, etc</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <p>The extended event information in the JSON format.</p>
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
         * <p>The event name in English.</p>
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
         * <p>the refer account info.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
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
         * <li>0: unhandled.</li>
         * <li>1: handling.</li>
         * <li>5: handling failed.</li>
         * <li>10: handled.</li>
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
         * <li>serious: high.</li>
         * <li>suspicious: medium.</li>
         * <li>remind: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("ThreatLevel")
        public String threatLevel;

        /**
         * <p>The risk score of the event. Valid values: 0 to 100. A higher value indicates a higher risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>90.2</p>
         */
        @NameInMap("ThreatScore")
        public Float threatScore;

        public static DescribeCloudSiemEventsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyDataResponseData self = new DescribeCloudSiemEventsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAlertNum(Integer alertNum) {
            this.alertNum = alertNum;
            return this;
        }
        public Integer getAlertNum() {
            return this.alertNum;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAssetNum(Integer assetNum) {
            this.assetNum = assetNum;
            return this;
        }
        public Integer getAssetNum() {
            return this.assetNum;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAttCkLabels(java.util.List<String> attCkLabels) {
            this.attCkLabels = attCkLabels;
            return this;
        }
        public java.util.List<String> getAttCkLabels() {
            return this.attCkLabels;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setAttckStages(java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages> attckStages) {
            this.attckStages = attckStages;
            return this;
        }
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseDataAttckStages> getAttckStages() {
            return this.attckStages;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDataSources(java.util.List<String> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setExtContent(String extContent) {
            this.extContent = extContent;
            return this;
        }
        public String getExtContent() {
            return this.extContent;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentName(String incidentName) {
            this.incidentName = incidentName;
            return this;
        }
        public String getIncidentName() {
            return this.incidentName;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentNameEn(String incidentNameEn) {
            this.incidentNameEn = incidentNameEn;
            return this;
        }
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentType(String incidentType) {
            this.incidentType = incidentType;
            return this;
        }
        public String getIncidentType() {
            return this.incidentType;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setReferAccount(String referAccount) {
            this.referAccount = referAccount;
            return this;
        }
        public String getReferAccount() {
            return this.referAccount;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setThreatLevel(String threatLevel) {
            this.threatLevel = threatLevel;
            return this;
        }
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public DescribeCloudSiemEventsResponseBodyDataResponseData setThreatScore(Float threatScore) {
            this.threatScore = threatScore;
            return this;
        }
        public Float getThreatScore() {
            return this.threatScore;
        }

    }

    public static class DescribeCloudSiemEventsResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeCloudSiemEventsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> responseData;

        public static DescribeCloudSiemEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudSiemEventsResponseBodyData self = new DescribeCloudSiemEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudSiemEventsResponseBodyData setPageInfo(DescribeCloudSiemEventsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeCloudSiemEventsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeCloudSiemEventsResponseBodyData setResponseData(java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeCloudSiemEventsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
