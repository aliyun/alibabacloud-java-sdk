// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelOperationLogListOpLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelOperationLogListOpLogsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelOperationLogListOpLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelOperationLogListOpLogsResponseBody self = new SentinelOperationLogListOpLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelOperationLogListOpLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelOperationLogListOpLogsResponseBody setData(java.util.List<SentinelOperationLogListOpLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelOperationLogListOpLogsResponseBodyData> getData() {
        return this.data;
    }

    public SentinelOperationLogListOpLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelOperationLogListOpLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelOperationLogListOpLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelOperationLogListOpLogsResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("createTimestamp")
        public Long createTimestamp;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifiedTimestamp")
        public Long modifiedTimestamp;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("newValue")
        public String newValue;

        @NameInMap("oldValue")
        public String oldValue;

        @NameInMap("opType")
        public String opType;

        @NameInMap("opUserId")
        public String opUserId;

        @NameInMap("resource")
        public String resource;

        @NameInMap("ruleId")
        public Long ruleId;

        @NameInMap("ruleType")
        public String ruleType;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("userId")
        public String userId;

        public static SentinelOperationLogListOpLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelOperationLogListOpLogsResponseBodyData self = new SentinelOperationLogListOpLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelOperationLogListOpLogsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setOpUserId(String opUserId) {
            this.opUserId = opUserId;
            return this;
        }
        public String getOpUserId() {
            return this.opUserId;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelOperationLogListOpLogsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
