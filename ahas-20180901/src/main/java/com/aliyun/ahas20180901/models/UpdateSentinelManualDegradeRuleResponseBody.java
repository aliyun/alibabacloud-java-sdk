// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelManualDegradeRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSentinelManualDegradeRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateSentinelManualDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelManualDegradeRuleResponseBody self = new UpdateSentinelManualDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelManualDegradeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSentinelManualDegradeRuleResponseBody setData(UpdateSentinelManualDegradeRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSentinelManualDegradeRuleResponseBodyData getData() {
        return this.data;
    }

    public UpdateSentinelManualDegradeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSentinelManualDegradeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSentinelManualDegradeRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSentinelManualDegradeRuleResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("ResourceMatchMode")
        public Integer resourceMatchMode;

        @NameInMap("UserId")
        public String userId;

        public static UpdateSentinelManualDegradeRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSentinelManualDegradeRuleResponseBodyData self = new UpdateSentinelManualDegradeRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setResourceMatchMode(Integer resourceMatchMode) {
            this.resourceMatchMode = resourceMatchMode;
            return this;
        }
        public Integer getResourceMatchMode() {
            return this.resourceMatchMode;
        }

        public UpdateSentinelManualDegradeRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
