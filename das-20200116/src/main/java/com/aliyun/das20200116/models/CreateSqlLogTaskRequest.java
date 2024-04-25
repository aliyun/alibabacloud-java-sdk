// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filters")
    public java.util.List<CreateSqlLogTaskRequestFilters> filters;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("Role")
    public String role;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static CreateSqlLogTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlLogTaskRequest self = new CreateSqlLogTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlLogTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSqlLogTaskRequest setFilters(java.util.List<CreateSqlLogTaskRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<CreateSqlLogTaskRequestFilters> getFilters() {
        return this.filters;
    }

    public CreateSqlLogTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSqlLogTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSqlLogTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateSqlLogTaskRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateSqlLogTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSqlLogTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateSqlLogTaskRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateSqlLogTaskRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlLogTaskRequestFilters self = new CreateSqlLogTaskRequestFilters();
            return TeaModel.build(map, self);
        }

        public CreateSqlLogTaskRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSqlLogTaskRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
