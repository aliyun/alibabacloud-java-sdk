// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateNodeSupplementRequest extends TeaModel {
    /**
     * <p>Create backfill request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateNodeSupplementRequestCreateCommand createCommand;

    /**
     * <p>Environment identifier.</p>
     * <ul>
     * <li>DEV: development environment.</li>
     * <li>PROD (default): production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateNodeSupplementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeSupplementRequest self = new CreateNodeSupplementRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeSupplementRequest setCreateCommand(CreateNodeSupplementRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateNodeSupplementRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateNodeSupplementRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public CreateNodeSupplementRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList extends TeaModel {
        /**
         * <p>Field ID</p>
         */
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>2323232</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList self = new CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommandFilterList extends TeaModel {
        /**
         * <p>Specifies whether to exclude the matched items. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exclude")
        public Boolean exclude;

        /**
         * <p>Filter key. Valid values:</p>
         * <ul>
         * <li>PROJECT: project</li>
         * <li>NODE_OUTPUT_NAME: node output name</li>
         * <li>NODE_NAME: node name</li>
         * <li>NODE_ID: node ID</li>
         * <li>TARGETS: specified endpoints</li>
         * <li>SOURCES: specified start points</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE_OUTPUT_NAME</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Filter value list</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static CreateNodeSupplementRequestCreateCommandFilterList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandFilterList self = new CreateNodeSupplementRequestCreateCommandFilterList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandFilterList setExclude(Boolean exclude) {
            this.exclude = exclude;
            return this;
        }
        public Boolean getExclude() {
            return this.exclude;
        }

        public CreateNodeSupplementRequestCreateCommandFilterList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNodeSupplementRequestCreateCommandFilterList setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommandGlobalParamList extends TeaModel {
        /**
         * <p>Parameter key</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Parameter value</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNodeSupplementRequestCreateCommandGlobalParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandGlobalParamList self = new CreateNodeSupplementRequestCreateCommandGlobalParamList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandGlobalParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNodeSupplementRequestCreateCommandGlobalParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommandNodeIdList extends TeaModel {
        /**
         * <p>Field ID list: Can be specified when the node is a logical table node ID. If not specified, the entire table is used by default.</p>
         */
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <p>Node ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n_1232324</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateNodeSupplementRequestCreateCommandNodeIdList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandNodeIdList self = new CreateNodeSupplementRequestCreateCommandNodeIdList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandNodeIdList setFieldIdList(java.util.List<String> fieldIdList) {
            this.fieldIdList = fieldIdList;
            return this;
        }
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        public CreateNodeSupplementRequestCreateCommandNodeIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommandNodeParamsListParamList extends TeaModel {
        /**
         * <p>Parameter key</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Parameter value</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNodeSupplementRequestCreateCommandNodeParamsListParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandNodeParamsListParamList self = new CreateNodeSupplementRequestCreateCommandNodeParamsListParamList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandNodeParamsListParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNodeSupplementRequestCreateCommandNodeParamsListParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommandNodeParamsList extends TeaModel {
        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>n_23324</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Parameter list</p>
         */
        @NameInMap("ParamList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsListParamList> paramList;

        public static CreateNodeSupplementRequestCreateCommandNodeParamsList build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommandNodeParamsList self = new CreateNodeSupplementRequestCreateCommandNodeParamsList();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommandNodeParamsList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateNodeSupplementRequestCreateCommandNodeParamsList setParamList(java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsListParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsListParamList> getParamList() {
            return this.paramList;
        }

    }

    public static class CreateNodeSupplementRequestCreateCommand extends TeaModel {
        /**
         * <p>Bulk mode: Include all downstream nodes. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainAllDownStream")
        public Boolean containAllDownStream;

        /**
         * <p>Downstream node IDs. Specifies downstream nodes for execution.</p>
         */
        @NameInMap("DownStreamNodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList> downStreamNodeIdList;

        /**
         * <p>End business date</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
         * <p>Filter list: Used together with ContainAllDownStream. You can include or exclude items based on project, node, and other criteria. Default value: empty.</p>
         */
        @NameInMap("FilterList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandFilterList> filterList;

        /**
         * <p>Runtime global parameters</p>
         */
        @NameInMap("GlobalParamList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandGlobalParamList> globalParamList;

        /**
         * <p>Latest trigger time (HH:MM). This parameter applies only to hourly tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("MaxDueTime")
        public String maxDueTime;

        /**
         * <p>Earliest trigger time (HH:MM). This parameter applies only to hourly tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("MinDueTime")
        public String minDueTime;

        /**
         * <p>Backfill name. If not specified, a name is automatically generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Root nodes for backfill. Multiple root nodes are supported.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeIdList> nodeIdList;

        /**
         * <p>Runtime custom parameters, configured per node</p>
         */
        @NameInMap("NodeParamsList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsList> nodeParamsList;

        /**
         * <p>Concurrency. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Parallelism")
        public Integer parallelism;

        /**
         * <p>Project ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Start business date</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21</p>
         */
        @NameInMap("StartBizDate")
        public String startBizDate;

        public static CreateNodeSupplementRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateNodeSupplementRequestCreateCommand self = new CreateNodeSupplementRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateNodeSupplementRequestCreateCommand setContainAllDownStream(Boolean containAllDownStream) {
            this.containAllDownStream = containAllDownStream;
            return this;
        }
        public Boolean getContainAllDownStream() {
            return this.containAllDownStream;
        }

        public CreateNodeSupplementRequestCreateCommand setDownStreamNodeIdList(java.util.List<CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList> downStreamNodeIdList) {
            this.downStreamNodeIdList = downStreamNodeIdList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList> getDownStreamNodeIdList() {
            return this.downStreamNodeIdList;
        }

        public CreateNodeSupplementRequestCreateCommand setEndBizDate(String endBizDate) {
            this.endBizDate = endBizDate;
            return this;
        }
        public String getEndBizDate() {
            return this.endBizDate;
        }

        public CreateNodeSupplementRequestCreateCommand setFilterList(java.util.List<CreateNodeSupplementRequestCreateCommandFilterList> filterList) {
            this.filterList = filterList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandFilterList> getFilterList() {
            return this.filterList;
        }

        public CreateNodeSupplementRequestCreateCommand setGlobalParamList(java.util.List<CreateNodeSupplementRequestCreateCommandGlobalParamList> globalParamList) {
            this.globalParamList = globalParamList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandGlobalParamList> getGlobalParamList() {
            return this.globalParamList;
        }

        public CreateNodeSupplementRequestCreateCommand setMaxDueTime(String maxDueTime) {
            this.maxDueTime = maxDueTime;
            return this;
        }
        public String getMaxDueTime() {
            return this.maxDueTime;
        }

        public CreateNodeSupplementRequestCreateCommand setMinDueTime(String minDueTime) {
            this.minDueTime = minDueTime;
            return this;
        }
        public String getMinDueTime() {
            return this.minDueTime;
        }

        public CreateNodeSupplementRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateNodeSupplementRequestCreateCommand setNodeIdList(java.util.List<CreateNodeSupplementRequestCreateCommandNodeIdList> nodeIdList) {
            this.nodeIdList = nodeIdList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        public CreateNodeSupplementRequestCreateCommand setNodeParamsList(java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsList> nodeParamsList) {
            this.nodeParamsList = nodeParamsList;
            return this;
        }
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsList> getNodeParamsList() {
            return this.nodeParamsList;
        }

        public CreateNodeSupplementRequestCreateCommand setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

        public CreateNodeSupplementRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateNodeSupplementRequestCreateCommand setStartBizDate(String startBizDate) {
            this.startBizDate = startBizDate;
            return this;
        }
        public String getStartBizDate() {
            return this.startBizDate;
        }

    }

}
