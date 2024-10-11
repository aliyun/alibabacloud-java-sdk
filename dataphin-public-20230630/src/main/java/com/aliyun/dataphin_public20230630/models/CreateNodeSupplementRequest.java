// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateNodeSupplementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateNodeSupplementRequestCreateCommand createCommand;

    /**
     * <strong>example:</strong>
     * <p>DEV/PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
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
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

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
        @NameInMap("Exclude")
        public Boolean exclude;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("FieldIdList")
        public java.util.List<String> fieldIdList;

        /**
         * <p>This parameter is required.</p>
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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("NodeId")
        public String nodeId;

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
        @NameInMap("ContainAllDownStream")
        public Boolean containAllDownStream;

        @NameInMap("DownStreamNodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandDownStreamNodeIdList> downStreamNodeIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-01</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        @NameInMap("FilterList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandFilterList> filterList;

        @NameInMap("GlobalParamList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandGlobalParamList> globalParamList;

        @NameInMap("MaxDueTime")
        public String maxDueTime;

        @NameInMap("MinDueTime")
        public String minDueTime;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("NodeIdList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeIdList> nodeIdList;

        @NameInMap("NodeParamsList")
        public java.util.List<CreateNodeSupplementRequestCreateCommandNodeParamsList> nodeParamsList;

        @NameInMap("Parallelism")
        public Integer parallelism;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>101121</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-01</p>
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
