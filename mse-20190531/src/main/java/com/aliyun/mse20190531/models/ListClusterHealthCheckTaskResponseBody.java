// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterHealthCheckTaskResponseBody extends TeaModel {
    /**
     * <p>Code is only used to synchronize with success</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListClusterHealthCheckTaskResponseBodyData data;

    /**
     * <p>The dynamic part in the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message used to replace \<em>\</em>%s\<em>\</em> in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong>, and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code. Take note of the following items:</p>
     * <ul>
     * <li><p>Successful request: The <strong>ErrorCode</strong> field is not returned.</p>
     * </li>
     * <li><p>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListClusterHealthCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHealthCheckTaskResponseBody self = new ListClusterHealthCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterHealthCheckTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClusterHealthCheckTaskResponseBody setData(ListClusterHealthCheckTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListClusterHealthCheckTaskResponseBodyData getData() {
        return this.data;
    }

    public ListClusterHealthCheckTaskResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListClusterHealthCheckTaskResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListClusterHealthCheckTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClusterHealthCheckTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListClusterHealthCheckTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClusterHealthCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterHealthCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClusterHealthCheckTaskResponseBodyDataResultRiskList extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;:&quot;The engine version is outdated and many features are missing. Upgrade to the latest version at the earliest opportunity.&quot;}</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The English description of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade to the latest version to ensure that all features are available!</p>
         */
        @NameInMap("DescriptionEn")
        public String descriptionEn;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3426</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Module")
        public String module;

        /**
         * <p>Specifies whether to disable the notification feature if the risk item occurs.</p>
         * <ul>
         * <li><p>true: Disables risk item notifications</p>
         * </li>
         * <li><p>false: Enables risk item notifications</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Mute")
        public Boolean mute;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NoticeFeature")
        public Boolean noticeFeature;

        /**
         * <p>The ID of the user to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The risk code.</p>
         * 
         * <strong>example:</strong>
         * <p>22020010001</p>
         */
        @NameInMap("RiskCode")
        public String riskCode;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p>HIGH: High risk</p>
         * </li>
         * <li><p>MID: Medium risk</p>
         * </li>
         * <li><p>LOW: Low risk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MID</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The risk name.</p>
         * 
         * <strong>example:</strong>
         * <p>Engine version too low</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        /**
         * <p>The English name of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Low engine version</p>
         */
        @NameInMap("RiskNameEn")
        public String riskNameEn;

        /**
         * <p>The type of the risk.</p>
         * 
         * <strong>example:</strong>
         * <p>Version risk</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        /**
         * <p>The current situation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;:&quot;The current engine version is too low with many missing features&quot;,&quot;links&quot;:[{&quot;type&quot;:&quot;url&quot;,&quot;value&quot;:&quot;<a href="https://xxxx%22%22,%22desc%22:%22Version">https://xxxx&quot;&quot;,&quot;desc&quot;:&quot;Version</a> notes&quot;}]}</p>
         */
        @NameInMap("Situation")
        public String situation;

        /**
         * <p>The English description of the current situation.</p>
         * 
         * <strong>example:</strong>
         * <p>The current engine version is low, and there are many missing features</p>
         */
        @NameInMap("SituationEn")
        public String situationEn;

        /**
         * <p>The suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;desc&quot;: &quot;Upgrade to the latest version at the earliest opportunity.&quot;, &quot;links&quot;:[{&quot;type&quot;:&quot;upgrade&quot;,&quot;desc&quot;:&quot;Click to upgrade&quot;}]}</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The English description of the suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>Upgrade to the latest version</p>
         */
        @NameInMap("SuggestionEn")
        public String suggestionEn;

        /**
         * <p>The ID of the associated parent task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Values")
        public String values;

        public static ListClusterHealthCheckTaskResponseBodyDataResultRiskList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHealthCheckTaskResponseBodyDataResultRiskList self = new ListClusterHealthCheckTaskResponseBodyDataResultRiskList();
            return TeaModel.build(map, self);
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
            return this;
        }
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setMute(Boolean mute) {
            this.mute = mute;
            return this;
        }
        public Boolean getMute() {
            return this.mute;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setNoticeFeature(Boolean noticeFeature) {
            this.noticeFeature = noticeFeature;
            return this;
        }
        public Boolean getNoticeFeature() {
            return this.noticeFeature;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setRiskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }
        public String getRiskCode() {
            return this.riskCode;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setRiskNameEn(String riskNameEn) {
            this.riskNameEn = riskNameEn;
            return this;
        }
        public String getRiskNameEn() {
            return this.riskNameEn;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setSituation(String situation) {
            this.situation = situation;
            return this;
        }
        public String getSituation() {
            return this.situation;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setSituationEn(String situationEn) {
            this.situationEn = situationEn;
            return this;
        }
        public String getSituationEn() {
            return this.situationEn;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setSuggestionEn(String suggestionEn) {
            this.suggestionEn = suggestionEn;
            return this;
        }
        public String getSuggestionEn() {
            return this.suggestionEn;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class ListClusterHealthCheckTaskResponseBodyDataResult extends TeaModel {
        /**
         * <p>The complete version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.1</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Nacos-Ans</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-20T06:51:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_ingresspost-cn-0jbvrcex****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the user to which the cluster belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The number of nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Replica")
        public String replica;

        /**
         * <p>The list of risk items.</p>
         */
        @NameInMap("RiskList")
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResultRiskList> riskList;

        /**
         * <p>The total score.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_SC_2_4_200_c</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The job states.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of inspection items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalItem")
        public Integer totalItem;

        /**
         * <p>The total number of risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalRisk")
        public Integer totalRisk;

        /**
         * <p>Redundant field.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-12 15:07:55</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>NACOS_ANS_1_2_1_3</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static ListClusterHealthCheckTaskResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHealthCheckTaskResponseBodyDataResult self = new ListClusterHealthCheckTaskResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setReplica(String replica) {
            this.replica = replica;
            return this;
        }
        public String getReplica() {
            return this.replica;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setRiskList(java.util.List<ListClusterHealthCheckTaskResponseBodyDataResultRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResultRiskList> getRiskList() {
            return this.riskList;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setTotalRisk(Integer totalRisk) {
            this.totalRisk = totalRisk;
            return this;
        }
        public Integer getTotalRisk() {
            return this.totalRisk;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListClusterHealthCheckTaskResponseBodyDataResult setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class ListClusterHealthCheckTaskResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the list.</p>
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
         * <p>The list of health check tasks.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResult> result;

        /**
         * <p>The total number of queried rules.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListClusterHealthCheckTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHealthCheckTaskResponseBodyData self = new ListClusterHealthCheckTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClusterHealthCheckTaskResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListClusterHealthCheckTaskResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterHealthCheckTaskResponseBodyData setResult(java.util.List<ListClusterHealthCheckTaskResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListClusterHealthCheckTaskResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
