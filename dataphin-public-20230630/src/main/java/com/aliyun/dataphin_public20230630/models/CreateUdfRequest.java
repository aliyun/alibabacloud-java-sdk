// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateUdfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateUdfRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateUdfRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfRequest self = new CreateUdfRequest();
        return TeaModel.build(map, self);
    }

    public CreateUdfRequest setCreateCommand(CreateUdfRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateUdfRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateUdfRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateUdfRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.lydaas.SleepTest</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>udf_sleep(100)</p>
         */
        @NameInMap("CommandHelp")
        public String commandHelp;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_udf</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>711833</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RefResourceIdList")
        public java.util.List<Long> refResourceIdList;

        public static CreateUdfRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateUdfRequestCreateCommand self = new CreateUdfRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateUdfRequestCreateCommand setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public CreateUdfRequestCreateCommand setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public CreateUdfRequestCreateCommand setCommandHelp(String commandHelp) {
            this.commandHelp = commandHelp;
            return this;
        }
        public String getCommandHelp() {
            return this.commandHelp;
        }

        public CreateUdfRequestCreateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateUdfRequestCreateCommand setComputeEngineType(String computeEngineType) {
            this.computeEngineType = computeEngineType;
            return this;
        }
        public String getComputeEngineType() {
            return this.computeEngineType;
        }

        public CreateUdfRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUdfRequestCreateCommand setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreateUdfRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateUdfRequestCreateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateUdfRequestCreateCommand setRefResourceIdList(java.util.List<Long> refResourceIdList) {
            this.refResourceIdList = refResourceIdList;
            return this;
        }
        public java.util.List<Long> getRefResourceIdList() {
            return this.refResourceIdList;
        }

    }

}
