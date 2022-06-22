// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetPublishOrderStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPublishOrderStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetPublishOrderStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublishOrderStatusResponseBody self = new GetPublishOrderStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublishOrderStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPublishOrderStatusResponseBody setData(GetPublishOrderStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPublishOrderStatusResponseBodyData getData() {
        return this.data;
    }

    public GetPublishOrderStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPublishOrderStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishOrderStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetPublishOrderStatusResponseBodyData extends TeaModel {
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
        public String id;

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

        public static GetPublishOrderStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPublishOrderStatusResponseBodyData self = new GetPublishOrderStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPublishOrderStatusResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetPublishOrderStatusResponseBodyData setBatchOrderDTOList(java.util.List<String> batchOrderDTOList) {
            this.batchOrderDTOList = batchOrderDTOList;
            return this;
        }
        public java.util.List<String> getBatchOrderDTOList() {
            return this.batchOrderDTOList;
        }

        public GetPublishOrderStatusResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPublishOrderStatusResponseBodyData setCurrentBatch(Integer currentBatch) {
            this.currentBatch = currentBatch;
            return this;
        }
        public Integer getCurrentBatch() {
            return this.currentBatch;
        }

        public GetPublishOrderStatusResponseBodyData setCurrentStatus(String currentStatus) {
            this.currentStatus = currentStatus;
            return this;
        }
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        public GetPublishOrderStatusResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPublishOrderStatusResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetPublishOrderStatusResponseBodyData setPauseType(String pauseType) {
            this.pauseType = pauseType;
            return this;
        }
        public String getPauseType() {
            return this.pauseType;
        }

        public GetPublishOrderStatusResponseBodyData setSwitchDesc(String switchDesc) {
            this.switchDesc = switchDesc;
            return this;
        }
        public String getSwitchDesc() {
            return this.switchDesc;
        }

        public GetPublishOrderStatusResponseBodyData setSwitchName(String switchName) {
            this.switchName = switchName;
            return this;
        }
        public String getSwitchName() {
            return this.switchName;
        }

        public GetPublishOrderStatusResponseBodyData setSwitchNamespace(String switchNamespace) {
            this.switchNamespace = switchNamespace;
            return this;
        }
        public String getSwitchNamespace() {
            return this.switchNamespace;
        }

        public GetPublishOrderStatusResponseBodyData setSwitchType(String switchType) {
            this.switchType = switchType;
            return this;
        }
        public String getSwitchType() {
            return this.switchType;
        }

        public GetPublishOrderStatusResponseBodyData setSwitchValue(String switchValue) {
            this.switchValue = switchValue;
            return this;
        }
        public String getSwitchValue() {
            return this.switchValue;
        }

        public GetPublishOrderStatusResponseBodyData setTotalBatch(Integer totalBatch) {
            this.totalBatch = totalBatch;
            return this;
        }
        public Integer getTotalBatch() {
            return this.totalBatch;
        }

        public GetPublishOrderStatusResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
