// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<CreateSqlLogTaskRequestFilters> filters;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The node ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The role of the node in the PolarDB-X 2.0 instance. Valid values:</p>
     * <br>
     * <p>*   **polarx_cn**: compute node.</p>
     * <p>*   **polarx_dn**: data node.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   Export</p>
     * <p>*   Query</p>
     */
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
        /**
         * <p>The name of the filter parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         */
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
