// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListWorkflowDefinitionsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListWorkflowDefinitionsResponseBodyPagingInfo pagingInfo;

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
         * <p>脚本所属类型</p>
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
         * <p>工作流脚本的id</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>工作流的脚本路径</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>脚本的运行时信息</p>
         */
        @NameInMap("Runtime")
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScriptRuntime runtime;

        public static ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript self = new ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript();
            return TeaModel.build(map, self);
        }

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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
         * <p>工作流的创建时间</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>工作流的描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>工作流定义的唯一ID</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>工作流的最近修改时间</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>工作流的名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>工作流的责任人</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>工作流定义的所属项目空间</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>工作流的脚本信息</p>
         */
        @NameInMap("Script")
        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitionsScript script;

        /**
         * <p>工作流类型，可选值：CycleWorkflow、ManualWorkflow，分别表示周期工作流和手动工作流</p>
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

        public ListWorkflowDefinitionsResponseBodyPagingInfoWorkflowDefinitions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

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
