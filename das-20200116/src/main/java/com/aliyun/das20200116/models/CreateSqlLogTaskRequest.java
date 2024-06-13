// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<CreateSqlLogTaskRequestFilters> filters;

    /**
     * <p>The ID of the database instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  This parameter is available only for instances that run in a cluster architecture. You can specify this parameter to query the offline tasks of a specific node. By default, if this parameter is not specified, the information about the offline tasks of the primary node is returned.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The role of the node of the PolarDB-X 2.0 database instance. Valid values:</p>
     * <br>
     * <p>*   **polarx_cn**: compute node</p>
     * <p>*   **polarx_dn**: data node</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The beginning of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The type of the task. Valid values:</p>
     * <br>
     * <p>*   **Export**</p>
     * <p>*   **Query**</p>
     * <p>*   **Insight**</p>
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
         * <br>
         * <p>>  For more information about the supported filter parameters and their valid values, see the following **supplement about the Key parameter**.</p>
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
