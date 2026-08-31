// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateNodeSupplementRequest extends TeaModel {
    /**
     * <p>The data backfill request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateNodeSupplementRequestCreateCommand createCommand;

    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: Development environment. </li>
     * <li>PROD (default): Production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public CreateNodeSupplementRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList extends TeaModel {
        /**
         * <p>The field ID.</p>
         */
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <p>The node ID.</p>
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
         * <p>The filter key. Valid values:</p>
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
         * <p>The list of filter values.</p>
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
         * <p>The parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
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
         * <p>The list of field IDs. This parameter is applicable when the node ID is a logical table node ID. If this parameter is not specified, all fields in the table are used by default.</p>
         */
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <p>The node ID.</p>
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
         * <p>The parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
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
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_23324</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The parameter list.</p>
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
         * <p>Specifies whether to include all downstream nodes in batch mode. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainAllDownStream")
        public Boolean containAllDownStream;

        /**
         * <p>The IDs of downstream nodes to run. This parameter takes effect only when ContainAllDownStream is set to false.</p>
         */
        @NameInMap("DownStreamNodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList> downStreamNodeIdList;

        /**
         * <p>The end business date.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-21</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
         * <p>The list of filters. This parameter is used together with ContainAllDownStream to include or exclude nodes based on criteria such as project or node. Default value: empty.</p>
         */
        @NameInMap("FilterList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandFilterList> filterList;

        /**
         * <p>The runtime global parameters.</p>
         */
        @NameInMap("GlobalParamList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandGlobalParamList> globalParamList;

        /**
         * <p>The latest trigger time in the HH:MM format. This parameter is applicable only to hourly nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>20:59</p>
         */
        @NameInMap("MaxDueTime")
        public String maxDueTime;

        /**
         * <p>The earliest trigger time in the HH:MM format. This parameter is applicable only to hourly nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("MinDueTime")
        public String minDueTime;

        /**
         * <p>The name of the data backfill. If this parameter is not specified, the system automatically generates a name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestBackfill</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The root nodes for data backfill. Multiple root nodes are supported.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeIdList> nodeIdList;

        /**
         * <p>The runtime custom parameters configured by node.</p>
         */
        @NameInMap("NodeParamsList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsList> nodeParamsList;

        /**
         * <p>The concurrency. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Parallelism")
        public Integer parallelism;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Corresponds to the &quot;Task Run Time&quot; option in the data backfill dialog box. If this parameter is set to true, the scheduled run time of instances is ignored and all instances run immediately. If this parameter is set to false, instances wait for their scheduled run time before running. Default value: true.</p>
         */
        @NameInMap("RunImmediately")
        public Boolean runImmediately;

        /**
         * <p>The start business date.</p>
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

        public CreateNodeSupplementRequestCreateCommand setRunImmediately(Boolean runImmediately) {
            this.runImmediately = runImmediately;
            return this;
        }
        public Boolean getRunImmediately() {
            return this.runImmediately;
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
