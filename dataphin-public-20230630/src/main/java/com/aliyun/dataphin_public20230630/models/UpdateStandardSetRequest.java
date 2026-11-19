// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardSetRequest extends TeaModel {
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

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateStandardSetRequestUpdateCommand updateCommand;

    public static UpdateStandardSetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardSetRequest self = new UpdateStandardSetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardSetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardSetRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateStandardSetRequest setUpdateCommand(UpdateStandardSetRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardSetRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardSetRequestUpdateCommandApprovalConfig extends TeaModel {
        /**
         * <p>The approval process type. Valid values:</p>
         * <ul>
         * <li>BY_DEFAULT: Default approval type.</li>
         * <li>BY_TEMPLATE: Based on an approval template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_DEFAULT</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>Specifies whether to enable approval.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("EnableApproval")
        public Boolean enableApproval;

        /**
         * <p>Specifies whether to submit approvals in batches.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IsSubmitInBatch")
        public Boolean isSubmitInBatch;

        /**
         * <p>The ID of the approval template. This parameter takes effect only when the approval process type is set to BY_TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static UpdateStandardSetRequestUpdateCommandApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardSetRequestUpdateCommandApprovalConfig self = new UpdateStandardSetRequestUpdateCommandApprovalConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardSetRequestUpdateCommandApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public UpdateStandardSetRequestUpdateCommandApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public UpdateStandardSetRequestUpdateCommandApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public UpdateStandardSetRequestUpdateCommandApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class UpdateStandardSetRequestUpdateCommandDirectoryReference extends TeaModel {
        /**
         * <p>The parent folder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static UpdateStandardSetRequestUpdateCommandDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardSetRequestUpdateCommandDirectoryReference self = new UpdateStandardSetRequestUpdateCommandDirectoryReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardSetRequestUpdateCommandDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig extends TeaModel {
        /**
         * <p>The approval process type. Valid values:</p>
         * <ul>
         * <li>BY_DEFAULT: Default approval type.</li>
         * <li>BY_TEMPLATE: Based on an approval template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BY_DEFAULT</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>Specifies whether to enable approval.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("EnableApproval")
        public Boolean enableApproval;

        /**
         * <p>Specifies whether to submit approvals in batches.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IsSubmitInBatch")
        public Boolean isSubmitInBatch;

        /**
         * <p>The ID of the approval template. This parameter takes effect only when the approval process type is set to BY_TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig self = new UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class UpdateStandardSetRequestUpdateCommandVisibilityConfig extends TeaModel {
        /**
         * <p>The list of specified users who have visibility. This parameter takes effect only when the visibility type is set to SPECIFIED.</p>
         */
        @NameInMap("SpecifiedUserList")
        public java.util.List<String> specifiedUserList;

        /**
         * <p>The visibility type. Valid values:</p>
         * <ul>
         * <li>PUBLIC: Public.</li>
         * <li>PRIVATE: Private. Visible only to standard set members and administrators.</li>
         * <li>SPECIFIED: Visible to specified users.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateStandardSetRequestUpdateCommandVisibilityConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardSetRequestUpdateCommandVisibilityConfig self = new UpdateStandardSetRequestUpdateCommandVisibilityConfig();
            return TeaModel.build(map, self);
        }

        public UpdateStandardSetRequestUpdateCommandVisibilityConfig setSpecifiedUserList(java.util.List<String> specifiedUserList) {
            this.specifiedUserList = specifiedUserList;
            return this;
        }
        public java.util.List<String> getSpecifiedUserList() {
            return this.specifiedUserList;
        }

        public UpdateStandardSetRequestUpdateCommandVisibilityConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStandardSetRequestUpdateCommand extends TeaModel {
        /**
         * <p>The online approval configuration.</p>
         */
        @NameInMap("ApprovalConfig")
        public UpdateStandardSetRequestUpdateCommandApprovalConfig approvalConfig;

        /**
         * <p>The code of the standard set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CITY</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the default standard template.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DefaultStandardTemplateId")
        public Long defaultStandardTemplateId;

        /**
         * <p>The description of the standard set.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parent folder.</p>
         */
        @NameInMap("DirectoryReference")
        public UpdateStandardSetRequestUpdateCommandDirectoryReference directoryReference;

        /**
         * <p>The maintainers.</p>
         */
        @NameInMap("MaintainerList")
        public java.util.List<String> maintainerList;

        /**
         * <p>The member group list.</p>
         */
        @NameInMap("MemberGroupList")
        public java.util.List<String> memberGroupList;

        /**
         * <p>The member list.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<String> memberList;

        /**
         * <p>The name of the standard set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The offline approval configuration.</p>
         */
        @NameInMap("OfflineApprovalConfig")
        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig offlineApprovalConfig;

        /**
         * <p>The ID of the standard set.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("StandardSetId")
        public Long standardSetId;

        /**
         * <p>The visibility configuration.</p>
         */
        @NameInMap("VisibilityConfig")
        public UpdateStandardSetRequestUpdateCommandVisibilityConfig visibilityConfig;

        public static UpdateStandardSetRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardSetRequestUpdateCommand self = new UpdateStandardSetRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardSetRequestUpdateCommand setApprovalConfig(UpdateStandardSetRequestUpdateCommandApprovalConfig approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }
        public UpdateStandardSetRequestUpdateCommandApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        public UpdateStandardSetRequestUpdateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateStandardSetRequestUpdateCommand setDefaultStandardTemplateId(Long defaultStandardTemplateId) {
            this.defaultStandardTemplateId = defaultStandardTemplateId;
            return this;
        }
        public Long getDefaultStandardTemplateId() {
            return this.defaultStandardTemplateId;
        }

        public UpdateStandardSetRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardSetRequestUpdateCommand setDirectoryReference(UpdateStandardSetRequestUpdateCommandDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public UpdateStandardSetRequestUpdateCommandDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public UpdateStandardSetRequestUpdateCommand setMaintainerList(java.util.List<String> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        public UpdateStandardSetRequestUpdateCommand setMemberGroupList(java.util.List<String> memberGroupList) {
            this.memberGroupList = memberGroupList;
            return this;
        }
        public java.util.List<String> getMemberGroupList() {
            return this.memberGroupList;
        }

        public UpdateStandardSetRequestUpdateCommand setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public UpdateStandardSetRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardSetRequestUpdateCommand setOfflineApprovalConfig(UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig offlineApprovalConfig) {
            this.offlineApprovalConfig = offlineApprovalConfig;
            return this;
        }
        public UpdateStandardSetRequestUpdateCommandOfflineApprovalConfig getOfflineApprovalConfig() {
            return this.offlineApprovalConfig;
        }

        public UpdateStandardSetRequestUpdateCommand setStandardSetId(Long standardSetId) {
            this.standardSetId = standardSetId;
            return this;
        }
        public Long getStandardSetId() {
            return this.standardSetId;
        }

        public UpdateStandardSetRequestUpdateCommand setVisibilityConfig(UpdateStandardSetRequestUpdateCommandVisibilityConfig visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }
        public UpdateStandardSetRequestUpdateCommandVisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

    }

}
