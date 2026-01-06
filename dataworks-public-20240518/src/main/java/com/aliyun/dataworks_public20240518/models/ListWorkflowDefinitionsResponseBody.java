// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowDefinitionsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListWorkflowDefinitionsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C3ED0C5-ABAB-55E1-854B-DAC02B11XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListWorkflowDefinitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowDefinitionsResponseBody self = new ListWorkflowDefinitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowDefinitionsResponseBody setPagingInfo(ListWorkflowDefinitionsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListWorkflowDefinitionsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListWorkflowDefinitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime extends TeaModel {
        /**
         * <p>Command</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        @NameInMap("Command")
        public String command;

        public static ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime self = new ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript extends TeaModel {
        /**
         * <p>The ID of the script.</p>
         * <blockquote>
         * <p> This field is of type Long in SDK versions prior to 8.0.0, and of type String in SDK version 8.0.0 and later. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures due to the type change may occur only when upgrading the SDK across version 8.0.0, in which case users need to manually correct the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>698002781368644XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The script path.</p>
         * 
         * <strong>example:</strong>
         * <p>XX/OpenAPI_test/workflow_test/OpenAPI_test_workflow_Demo</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Runtime</p>
         */
        @NameInMap("Runtime")
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime runtime;

        public static ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript self = new ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript setRuntime(ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime getRuntime() {
            return this.runtime;
        }

    }

    public static class ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions extends TeaModel {
        /**
         * <p>The timestamp when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1698057323000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique identifier of the workflow.</p>
         * <blockquote>
         * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The timestamp when the workflow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1698057323000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI test workflow Demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Owner</p>
         * 
         * <strong>example:</strong>
         * <p>110755000425XXXX</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace to which the workflow belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4710</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The script information.</p>
         */
        @NameInMap("Script")
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript script;

        /**
         * <p>The type of the workflow.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CycleWorkflow</li>
         * <li>ManualWorkflow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CycleWorkflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions self = new ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setScript(ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript script) {
            this.script = script;
            return this;
        }
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript getScript() {
            return this.script;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListWorkflowDefinitionsResponseBodyPagingInfo extends TeaModel {
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>227</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The workflows.</p>
         */
        @NameInMap("WorkflowDefinitions")
        public java.util.List<ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions> workflowDefinitions;

        public static ListWorkflowDefinitionsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDefinitionsResponseBodyPagingInfo self = new ListWorkflowDefinitionsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfo setWorkflowDefinitions(java.util.List<ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions> workflowDefinitions) {
            this.workflowDefinitions = workflowDefinitions;
            return this;
        }
        public java.util.List<ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions> getWorkflowDefinitions() {
            return this.workflowDefinitions;
        }

    }

}
