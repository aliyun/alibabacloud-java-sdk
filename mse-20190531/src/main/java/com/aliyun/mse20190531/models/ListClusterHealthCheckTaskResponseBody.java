// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterHealthCheckTaskResponseBody extends TeaModel {
    /**
     * <p>systemError</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListClusterHealthCheckTaskResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>system error</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>mse-100-001</p>
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
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Module")
        public String module;

        @NameInMap("Mute")
        public Boolean mute;

        @NameInMap("NoticeFeature")
        public Boolean noticeFeature;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("RiskCode")
        public String riskCode;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("RiskType")
        public String riskType;

        @NameInMap("Situation")
        public String situation;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public Integer type;

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

        public ListClusterHealthCheckTaskResponseBodyDataResultRiskList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
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
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Replica")
        public String replica;

        @NameInMap("RiskList")
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResultRiskList> riskList;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalItem")
        public Integer totalItem;

        @NameInMap("TotalRisk")
        public Integer totalRisk;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListClusterHealthCheckTaskResponseBodyDataResult> result;

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
