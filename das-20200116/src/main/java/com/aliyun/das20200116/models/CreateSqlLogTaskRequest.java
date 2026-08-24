// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskRequest extends TeaModel {
    /**
     * <p>The end time of the task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1608888296000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<CreateSqlLogTaskRequestFilters> filters;

    /**
     * <p>The database instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL audit export 1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>This parameter is applicable only to cluster instances. You can specify this parameter to query the batch task of a specific node. If you do not specify this parameter, the batch task of the primary node is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-uf6k5f6g3912i****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node information of the PolarDB-X 2.0 database instance.</p>
     * <ul>
     * <li><p><strong>polarx_cn</strong>: compute node.</p>
     * </li>
     * <li><p><strong>polarx_dn</strong>: data node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The start time of the task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The task type.</p>
     * <ul>
     * <li><strong>Export</strong>: export task.<blockquote>
     * <p>For the filter parameters and values supported by <strong>Export</strong>, see <strong>Request parameters description</strong>.</p>
     * </blockquote>
     * </li>
     * <li><strong>Query</strong>: query task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Export</p>
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
         * <blockquote>
         * <p>For the supported filter parameters and values, see <strong>Request parameters description</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>KeyWords</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>select</p>
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
