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
         * <li>1: window function</li>
         * <li>2: aggregate function</li>
         * <li>3: numerical function</li>
         * <li>4: string function</li>
         * <li>5: time function</li>
         * <li>6: IP address utility function</li>
         * <li>7: URL-related function</li>
         * <li>8: encoding and decoding function</li>
         * <li>9: business-related function</li>
         * <li>10: other.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <p>The class name that implements the function in the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.lydaas.SleepTest</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The command format for function calling to invoke.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>udf_sleep(100)</p>
         */
        @NameInMap("CommandHelp")
        public String commandHelp;

        /**
         * <p>The commit remarks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the user-defined function.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("Id")
        public Long id;

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
