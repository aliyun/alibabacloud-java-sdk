// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateRectifyFlowRequest extends TeaModel {
    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateRectifyFlowRequestCreateCommand createCommand;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static CreateRectifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRectifyFlowRequest self = new CreateRectifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateRectifyFlowRequest setCreateCommand(CreateRectifyFlowRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateRectifyFlowRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateRectifyFlowRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateRectifyFlowRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class CreateRectifyFlowRequestCreateCommand extends TeaModel {
        /**
         * <p>Specifies whether to associate with an existing process. Default value: false.</p>
         */
        @NameInMap("BindToRectify")
        public Boolean bindToRectify;

        /**
         * <p>This parameter is required when you associate with an existing process.</p>
         * 
         * <strong>example:</strong>
         * <p>117970862340</p>
         */
        @NameInMap("BindToRectifyId")
        public Long bindToRectifyId;

        /**
         * <p>The operation description. This parameter is optional. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Initiate quality issue rectification for the customer table</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The governance object type. Valid values: TABLE, DATASOURCE_TABLE, DATASOURCE, INDEX, REALTIME_LOGICAL_TABLE, and QD_FEATURE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("GovernItemType")
        public String governItemType;

        /**
         * <p>The list of issue IDs. Issues that cannot be rectified are skipped. If all issues are skipped, the original business error is returned.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GovernObjectIds")
        public java.util.List<Long> governObjectIds;

        /**
         * <p>The rectification name. This parameter is required when you create a process and can contain up to 128 characters. It is ignored when you associate with an existing process.</p>
         * 
         * <strong>example:</strong>
         * <p>Quality issue rectification for the customer table</p>
         */
        @NameInMap("RectifyName")
        public String rectifyName;

        /**
         * <p>The rectification priority. Valid values: HIGH, MIDDLE, and LOW. Default value: MIDDLE. This parameter is ignored and not verified when you associate with an existing process.</p>
         * 
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("RectifyPriority")
        public String rectifyPriority;

        /**
         * <p>The rectification scope. Valid values: QUALITY_RULE_SCOPE, QUALITY_RULE_TASK_SCOPE, QUALITY_GOVERN_OBJECT_SCOPE, and QUALITY_WATCH_SCOPE. The default value is the same as the value on the page. A rule scope may include other issues.</p>
         * 
         * <strong>example:</strong>
         * <p>QUALITY_GOVERN_OBJECT_SCOPE</p>
         */
        @NameInMap("RectifyScope")
        public String rectifyScope;

        /**
         * <p>The ID of the user who performs the rectification. Default value: the current user. This parameter is ignored when you associate with an existing process.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("RectifyUser")
        public String rectifyUser;

        /**
         * <p>The ID of the user who performs the verification. Default value: the current user. This parameter is ignored when you associate with an existing process.</p>
         * 
         * <strong>example:</strong>
         * <p>user002</p>
         */
        @NameInMap("VerifyUser")
        public String verifyUser;

        public static CreateRectifyFlowRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateRectifyFlowRequestCreateCommand self = new CreateRectifyFlowRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateRectifyFlowRequestCreateCommand setBindToRectify(Boolean bindToRectify) {
            this.bindToRectify = bindToRectify;
            return this;
        }
        public Boolean getBindToRectify() {
            return this.bindToRectify;
        }

        public CreateRectifyFlowRequestCreateCommand setBindToRectifyId(Long bindToRectifyId) {
            this.bindToRectifyId = bindToRectifyId;
            return this;
        }
        public Long getBindToRectifyId() {
            return this.bindToRectifyId;
        }

        public CreateRectifyFlowRequestCreateCommand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CreateRectifyFlowRequestCreateCommand setGovernItemType(String governItemType) {
            this.governItemType = governItemType;
            return this;
        }
        public String getGovernItemType() {
            return this.governItemType;
        }

        public CreateRectifyFlowRequestCreateCommand setGovernObjectIds(java.util.List<Long> governObjectIds) {
            this.governObjectIds = governObjectIds;
            return this;
        }
        public java.util.List<Long> getGovernObjectIds() {
            return this.governObjectIds;
        }

        public CreateRectifyFlowRequestCreateCommand setRectifyName(String rectifyName) {
            this.rectifyName = rectifyName;
            return this;
        }
        public String getRectifyName() {
            return this.rectifyName;
        }

        public CreateRectifyFlowRequestCreateCommand setRectifyPriority(String rectifyPriority) {
            this.rectifyPriority = rectifyPriority;
            return this;
        }
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        public CreateRectifyFlowRequestCreateCommand setRectifyScope(String rectifyScope) {
            this.rectifyScope = rectifyScope;
            return this;
        }
        public String getRectifyScope() {
            return this.rectifyScope;
        }

        public CreateRectifyFlowRequestCreateCommand setRectifyUser(String rectifyUser) {
            this.rectifyUser = rectifyUser;
            return this;
        }
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        public CreateRectifyFlowRequestCreateCommand setVerifyUser(String verifyUser) {
            this.verifyUser = verifyUser;
            return this;
        }
        public String getVerifyUser() {
            return this.verifyUser;
        }

    }

}
