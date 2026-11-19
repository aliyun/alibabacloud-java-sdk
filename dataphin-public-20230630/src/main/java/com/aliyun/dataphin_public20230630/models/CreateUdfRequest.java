// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateUdfRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateUdfRequestCreateCommand createCommand;

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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public CreateUdfRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateUdfRequestCreateCommand extends TeaModel {
        /**
         * <p>The category identifier of the user-defined function (UDF). Valid values:</p>
         * <ul>
         * <li>1: window function</li>
         * <li>2: statistical function</li>
         * <li>3: numerical function</li>
         * <li>4: string function</li>
         * <li>5: time function</li>
         * <li>6: IP address helper function</li>
         * <li>7: URL-related function</li>
         * <li>8: encoding and decoding function</li>
         * <li>9: business-related function</li>
         * <li>10: other</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The name of the class that implements the function in the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.lydaas.SleepTest</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The command format for function invocation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>udf_sleep(100)</p>
         */
        @NameInMap("CommandHelp")
        public String commandHelp;

        /**
         * <p>The submission comment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The compute engine type. Valid values: MAX_COMPUTE and HADOOP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE</p>
         */
        @NameInMap("ComputeEngineType")
        public String computeEngineType;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The storage directory. Default value: /.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Directory")
        public String directory;

        /**
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_udf</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>711833</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The IDs of the referenced resources.</p>
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
