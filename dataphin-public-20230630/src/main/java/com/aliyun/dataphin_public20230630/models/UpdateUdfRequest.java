// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateUdfRequest extends TeaModel {
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
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateUdfRequestUpdateCommand updateCommand;

    public static UpdateUdfRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfRequest self = new UpdateUdfRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUdfRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateUdfRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateUdfRequest setUpdateCommand(UpdateUdfRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateUdfRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateUdfRequestUpdateCommand extends TeaModel {
        /**
         * <p>The category. Valid values:</p>
         * <ul>
         * <li>1: Window function.</li>
         * <li>2: Aggregate function.</li>
         * <li>3: Numerical function.</li>
         * <li>4: String function.</li>
         * <li>5: Time function.</li>
         * <li>6: IP address helper function.</li>
         * <li>7: URL-related function.</li>
         * <li>8: Encoding and decoding function.</li>
         * <li>9: Business-related function.</li>
         * <li>10: Other.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom function.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the project.</p>
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

        public static UpdateUdfRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateUdfRequestUpdateCommand self = new UpdateUdfRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateUdfRequestUpdateCommand setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public UpdateUdfRequestUpdateCommand setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public UpdateUdfRequestUpdateCommand setCommandHelp(String commandHelp) {
            this.commandHelp = commandHelp;
            return this;
        }
        public String getCommandHelp() {
            return this.commandHelp;
        }

        public UpdateUdfRequestUpdateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateUdfRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateUdfRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateUdfRequestUpdateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateUdfRequestUpdateCommand setRefResourceIdList(java.util.List<Long> refResourceIdList) {
            this.refResourceIdList = refResourceIdList;
            return this;
        }
        public java.util.List<Long> getRefResourceIdList() {
            return this.refResourceIdList;
        }

    }

}
