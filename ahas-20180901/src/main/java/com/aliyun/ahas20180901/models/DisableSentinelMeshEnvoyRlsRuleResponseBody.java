// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelMeshEnvoyRlsRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisableSentinelMeshEnvoyRlsRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableSentinelMeshEnvoyRlsRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelMeshEnvoyRlsRuleResponseBody self = new DisableSentinelMeshEnvoyRlsRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSentinelMeshEnvoyRlsRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponseBody setData(DisableSentinelMeshEnvoyRlsRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableSentinelMeshEnvoyRlsRuleResponseBodyData getData() {
        return this.data;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSentinelMeshEnvoyRlsRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors build(java.util.Map<String, ?> map) throws Exception {
            DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors self = new DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors();
            return TeaModel.build(map, self);
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DisableSentinelMeshEnvoyRlsRuleResponseBodyData extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceDescriptors")
        public java.util.List<DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> resourceDescriptors;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("TimeUnit")
        public Integer timeUnit;

        @NameInMap("UserId")
        public String userId;

        public static DisableSentinelMeshEnvoyRlsRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableSentinelMeshEnvoyRlsRuleResponseBodyData self = new DisableSentinelMeshEnvoyRlsRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setResourceDescriptors(java.util.List<DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> resourceDescriptors) {
            this.resourceDescriptors = resourceDescriptors;
            return this;
        }
        public java.util.List<DisableSentinelMeshEnvoyRlsRuleResponseBodyDataResourceDescriptors> getResourceDescriptors() {
            return this.resourceDescriptors;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setTimeUnit(Integer timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Integer getTimeUnit() {
            return this.timeUnit;
        }

        public DisableSentinelMeshEnvoyRlsRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
