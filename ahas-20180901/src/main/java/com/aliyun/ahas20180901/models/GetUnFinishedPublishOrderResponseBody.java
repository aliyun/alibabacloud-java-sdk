// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUnFinishedPublishOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUnFinishedPublishOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetUnFinishedPublishOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnFinishedPublishOrderResponseBody self = new GetUnFinishedPublishOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnFinishedPublishOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnFinishedPublishOrderResponseBody setData(GetUnFinishedPublishOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUnFinishedPublishOrderResponseBodyData getData() {
        return this.data;
    }

    public GetUnFinishedPublishOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnFinishedPublishOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnFinishedPublishOrderResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetUnFinishedPublishOrderResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("batchOrderDTOList")
        public java.util.List<String> batchOrderDTOList;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("currentBatch")
        public Integer currentBatch;

        @NameInMap("currentStatus")
        public String currentStatus;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("pauseType")
        public String pauseType;

        @NameInMap("switchDesc")
        public String switchDesc;

        @NameInMap("switchName")
        public String switchName;

        @NameInMap("switchNamespace")
        public String switchNamespace;

        @NameInMap("switchType")
        public String switchType;

        @NameInMap("switchValue")
        public String switchValue;

        @NameInMap("totalBatch")
        public Integer totalBatch;

        @NameInMap("userId")
        public String userId;

        public static GetUnFinishedPublishOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUnFinishedPublishOrderResponseBodyData self = new GetUnFinishedPublishOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUnFinishedPublishOrderResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetUnFinishedPublishOrderResponseBodyData setBatchOrderDTOList(java.util.List<String> batchOrderDTOList) {
            this.batchOrderDTOList = batchOrderDTOList;
            return this;
        }
        public java.util.List<String> getBatchOrderDTOList() {
            return this.batchOrderDTOList;
        }

        public GetUnFinishedPublishOrderResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetUnFinishedPublishOrderResponseBodyData setCurrentBatch(Integer currentBatch) {
            this.currentBatch = currentBatch;
            return this;
        }
        public Integer getCurrentBatch() {
            return this.currentBatch;
        }

        public GetUnFinishedPublishOrderResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public GetUnFinishedPublishOrderResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUnFinishedPublishOrderResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetUnFinishedPublishOrderResponseBodyData setPauseType(String pauseType) {
            this.pauseType = pauseType;
            return this;
        }
        public String getPauseType() {
            return this.pauseType;
        }

        public GetUnFinishedPublishOrderResponseBodyData setSwitchDesc(String switchDesc) {
            this.switchDesc = switchDesc;
            return this;
        }
        public String getSwitchDesc() {
            return this.switchDesc;
        }

        public GetUnFinishedPublishOrderResponseBodyData setSwitchName(String switchName) {
            this.switchName = switchName;
            return this;
        }
        public String getSwitchName() {
            return this.switchName;
        }

        public GetUnFinishedPublishOrderResponseBodyData setSwitchNamespace(String switchNamespace) {
            this.switchNamespace = switchNamespace;
            return this;
        }
        public String getSwitchNamespace() {
            return this.switchNamespace;
        }

        public GetUnFinishedPublishOrderResponseBodyData setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public GetUnFinishedPublishOrderResponseBodyData setSwitchValue(String switchValue) {
            this.switchValue = switchValue;
            return this;
        }
        public String getSwitchValue() {
            return this.switchValue;
        }

        public GetUnFinishedPublishOrderResponseBodyData setTotalBatch(Integer totalBatch) {
            this.totalBatch = totalBatch;
            return this;
        }
        public Integer getTotalBatch() {
            return this.totalBatch;
        }

        public GetUnFinishedPublishOrderResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
