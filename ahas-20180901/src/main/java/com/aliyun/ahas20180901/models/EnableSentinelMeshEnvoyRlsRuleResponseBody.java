// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelMeshEnvoyRlsRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnableSentinelMeshEnvoyRlsRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableSentinelMeshEnvoyRlsRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelMeshEnvoyRlsRuleResponseBody self = new EnableSentinelMeshEnvoyRlsRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSentinelMeshEnvoyRlsRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponseBody setData(EnableSentinelMeshEnvoyRlsRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableSentinelMeshEnvoyRlsRuleResponseBodyData getData() {
        return this.data;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSentinelMeshEnvoyRlsRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors build(java.util.Map<String, ?> map) throws Exception {
            EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors self = new EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors();
            return TeaModel.build(map, self);
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class EnableSentinelMeshEnvoyRlsRuleResponseBodyData extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceDescriptors")
        public java.util.List<EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> resourceDescriptors;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("TimeUnit")
        public Integer timeUnit;

        @NameInMap("UserId")
        public String userId;

        public static EnableSentinelMeshEnvoyRlsRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableSentinelMeshEnvoyRlsRuleResponseBodyData self = new EnableSentinelMeshEnvoyRlsRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setResourceDescriptors(java.util.List<EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> resourceDescriptors) {
            this.resourceDescriptors = resourceDescriptors;
            return this;
        }
        public java.util.List<EnableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> getResourceDescriptors() {
            return this.resourceDescriptors;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setTimeUnit(Integer timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Integer getTimeUnit() {
            return this.timeUnit;
        }

        public EnableSentinelMeshEnvoyRlsRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
