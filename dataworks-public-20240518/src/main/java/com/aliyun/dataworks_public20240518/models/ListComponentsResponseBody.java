// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListComponentsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. Use this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527ab****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setPagingInfo(ListComponentsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListComponentsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComponentsResponseBodyPagingInfoComponentsInputs extends TeaModel {
        /**
         * <p>The default value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>mdb.shard.2x.2xlarge.d</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_updateAlertRule_test_bULIRo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListComponentsResponseBodyPagingInfoComponentsInputs build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfoComponentsInputs self = new ListComponentsResponseBodyPagingInfoComponentsInputs();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfoComponentsInputs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListComponentsResponseBodyPagingInfoComponentsInputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComponentsResponseBodyPagingInfoComponentsInputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComponentsResponseBodyPagingInfoComponentsInputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComponentsResponseBodyPagingInfoComponentsOutputs extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>zdy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_updateAlertRule_test_bULIRo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListComponentsResponseBodyPagingInfoComponentsOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfoComponentsOutputs self = new ListComponentsResponseBodyPagingInfoComponentsOutputs();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfoComponentsOutputs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListComponentsResponseBodyPagingInfoComponentsOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComponentsResponseBodyPagingInfoComponentsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComponentsResponseBodyPagingInfoComponentsOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComponentsResponseBodyPagingInfoComponentsScriptRuntime extends TeaModel {
        /**
         * <p>The command.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL_COMPONENT</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListComponentsResponseBodyPagingInfoComponentsScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfoComponentsScriptRuntime self = new ListComponentsResponseBodyPagingInfoComponentsScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfoComponentsScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListComponentsResponseBodyPagingInfoComponentsScript extends TeaModel {
        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>348100</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The script path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The runtime.</p>
         */
        @NameInMap("Runtime")
        public ListComponentsResponseBodyPagingInfoComponentsScriptRuntime runtime;

        public static ListComponentsResponseBodyPagingInfoComponentsScript build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfoComponentsScript self = new ListComponentsResponseBodyPagingInfoComponentsScript();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfoComponentsScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListComponentsResponseBodyPagingInfoComponentsScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListComponentsResponseBodyPagingInfoComponentsScript setRuntime(ListComponentsResponseBodyPagingInfoComponentsScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListComponentsResponseBodyPagingInfoComponentsScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListComponentsResponseBodyPagingInfoComponents extends TeaModel {
        /**
         * <p>The component ID. This parameter can be used in requests to query, modify, or delete director components.</p>
         * 
         * <strong>example:</strong>
         * <p>12312313123</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-13 16:35:59</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc peering management_staging</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input parameters.</p>
         */
        @NameInMap("Inputs")
        public java.util.List<ListComponentsResponseBodyPagingInfoComponentsInputs> inputs;

        /**
         * <p>The timestamp when the publishing process was modified.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-30T13:30:58Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_updateAlertRule_test_lJd81f</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameters.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<ListComponentsResponseBodyPagingInfoComponentsOutputs> outputs;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>252675537980665607</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The DataWorks workspace ID. To obtain the workspace ID, log on to the DataWorks console and navigate to the workspace configuration page. You must specify either this parameter or ProjectIdentifier to identify the target DataWorks workspace for this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>199925</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public ListComponentsResponseBodyPagingInfoComponentsScript script;

        public static ListComponentsResponseBodyPagingInfoComponents build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfoComponents self = new ListComponentsResponseBodyPagingInfoComponents();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfoComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public ListComponentsResponseBodyPagingInfoComponents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComponentsResponseBodyPagingInfoComponents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComponentsResponseBodyPagingInfoComponents setInputs(java.util.List<ListComponentsResponseBodyPagingInfoComponentsInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyPagingInfoComponentsInputs> getInputs() {
            return this.inputs;
        }

        public ListComponentsResponseBodyPagingInfoComponents setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListComponentsResponseBodyPagingInfoComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComponentsResponseBodyPagingInfoComponents setOutputs(java.util.List<ListComponentsResponseBodyPagingInfoComponentsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyPagingInfoComponentsOutputs> getOutputs() {
            return this.outputs;
        }

        public ListComponentsResponseBodyPagingInfoComponents setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListComponentsResponseBodyPagingInfoComponents setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListComponentsResponseBodyPagingInfoComponents setScript(ListComponentsResponseBodyPagingInfoComponentsScript script) {
            this.script = script;
            return this;
        }
        public ListComponentsResponseBodyPagingInfoComponentsScript getScript() {
            return this.script;
        }

    }

    public static class ListComponentsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The UID of the user who created the dataset acceleration component. In Alibaba Cloud, this is the RAM user ID (or the Alibaba Cloud account ID if created by the account itself).</p>
         */
        @NameInMap("Components")
        public java.util.List<ListComponentsResponseBodyPagingInfoComponents> components;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListComponentsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyPagingInfo self = new ListComponentsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyPagingInfo setComponents(java.util.List<ListComponentsResponseBodyPagingInfoComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyPagingInfoComponents> getComponents() {
            return this.components;
        }

        public ListComponentsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListComponentsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListComponentsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
