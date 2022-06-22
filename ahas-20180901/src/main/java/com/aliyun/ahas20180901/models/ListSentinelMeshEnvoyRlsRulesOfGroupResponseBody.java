// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody self = new ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody setData(java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors self = new ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors();
            return TeaModel.build(map, self);
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceDescriptors")
        public java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors> resourceDescriptors;

        @NameInMap("StatInterval")
        public Integer statInterval;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("TimeUnit")
        public Integer timeUnit;

        @NameInMap("UserId")
        public String userId;

        public static ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData self = new ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setResourceDescriptors(java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors> resourceDescriptors) {
            this.resourceDescriptors = resourceDescriptors;
            return this;
        }
        public java.util.List<ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyDataResourceDescriptors> getResourceDescriptors() {
            return this.resourceDescriptors;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setStatInterval(Integer statInterval) {
            this.statInterval = statInterval;
            return this;
        }
        public Integer getStatInterval() {
            return this.statInterval;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setTimeUnit(Integer timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public Integer getTimeUnit() {
            return this.timeUnit;
        }

        public ListSentinelMeshEnvoyRlsRulesOfGroupResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
