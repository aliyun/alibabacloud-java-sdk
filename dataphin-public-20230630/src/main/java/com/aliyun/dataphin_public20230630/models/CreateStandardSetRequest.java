// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardSetRequest extends TeaModel {
    /**
     * <p>The create instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardSetRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardSetRequest self = new CreateStandardSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardSetRequest setCreateCommand(CreateStandardSetRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardSetRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardSetRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardSetRequestCreateCommandApprovalConfig extends TeaModel {
        /**
         * <p>The approval process type. Valid values:</p>
         * <ul>
         * <li>BY_DEFAULT: the default approval type.</li>
         * <li>BY_TEMPLATE: approval based on an approval template.</li>
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

        public static CreateStandardSetRequestCreateCommandApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardSetRequestCreateCommandApprovalConfig self = new CreateStandardSetRequestCreateCommandApprovalConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardSetRequestCreateCommandApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public CreateStandardSetRequestCreateCommandApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public CreateStandardSetRequestCreateCommandApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public CreateStandardSetRequestCreateCommandApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateStandardSetRequestCreateCommandDirectoryReference extends TeaModel {
        /**
         * <p>The directory to which the standard set belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static CreateStandardSetRequestCreateCommandDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardSetRequestCreateCommandDirectoryReference self = new CreateStandardSetRequestCreateCommandDirectoryReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardSetRequestCreateCommandDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class CreateStandardSetRequestCreateCommandOfflineApprovalConfig extends TeaModel {
        /**
         * <p>The approval process type. Valid values:</p>
         * <ul>
         * <li>BY_DEFAULT: the default approval type.</li>
         * <li>BY_TEMPLATE: approval based on an approval template.</li>
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

        public static CreateStandardSetRequestCreateCommandOfflineApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardSetRequestCreateCommandOfflineApprovalConfig self = new CreateStandardSetRequestCreateCommandOfflineApprovalConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateStandardSetRequestCreateCommandVisibilityConfig extends TeaModel {
        /**
         * <p>The list of specified users who can view the standard set. This parameter takes effect only when the visibility type is set to SPECIFIED.</p>
         */
        @NameInMap("SpecifiedUserList")
        public java.util.List<String> specifiedUserList;

        /**
         * <p>The visibility type. Valid values:</p>
         * <ul>
         * <li>PUBLIC: visible to all users.</li>
         * <li>PRIVATE: visible only to standard set members and administrators.</li>
         * <li>SPECIFIED: visible only to specified users.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateStandardSetRequestCreateCommandVisibilityConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardSetRequestCreateCommandVisibilityConfig self = new CreateStandardSetRequestCreateCommandVisibilityConfig();
            return TeaModel.build(map, self);
        }

        public CreateStandardSetRequestCreateCommandVisibilityConfig setSpecifiedUserList(java.util.List<String> specifiedUserList) {
            this.specifiedUserList = specifiedUserList;
            return this;
        }
        public java.util.List<String> getSpecifiedUserList() {
            return this.specifiedUserList;
        }

        public CreateStandardSetRequestCreateCommandVisibilityConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateStandardSetRequestCreateCommand extends TeaModel {
        /**
         * <p>The approval configuration for going online.</p>
         */
        @NameInMap("ApprovalConfig")
        public CreateStandardSetRequestCreateCommandApprovalConfig approvalConfig;

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
         * <p>The directory to which the standard set belongs.</p>
         */
        @NameInMap("DirectoryReference")
        public CreateStandardSetRequestCreateCommandDirectoryReference directoryReference;

        /**
         * <p>The list of maintainers.</p>
         */
        @NameInMap("MaintainerList")
        public java.util.List<String> maintainerList;

        /**
         * <p>The list of member groups.</p>
         */
        @NameInMap("MemberGroupList")
        public java.util.List<String> memberGroupList;

        /**
         * <p>The list of members.</p>
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
         * <p>The approval configuration for going offline.</p>
         */
        @NameInMap("OfflineApprovalConfig")
        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig offlineApprovalConfig;

        /**
         * <p>The visibility configuration.</p>
         */
        @NameInMap("VisibilityConfig")
        public CreateStandardSetRequestCreateCommandVisibilityConfig visibilityConfig;

        public static CreateStandardSetRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardSetRequestCreateCommand self = new CreateStandardSetRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardSetRequestCreateCommand setApprovalConfig(CreateStandardSetRequestCreateCommandApprovalConfig approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }
        public CreateStandardSetRequestCreateCommandApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        public CreateStandardSetRequestCreateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateStandardSetRequestCreateCommand setDefaultStandardTemplateId(Long defaultStandardTemplateId) {
            this.defaultStandardTemplateId = defaultStandardTemplateId;
            return this;
        }
        public Long getDefaultStandardTemplateId() {
            return this.defaultStandardTemplateId;
        }

        public CreateStandardSetRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardSetRequestCreateCommand setDirectoryReference(CreateStandardSetRequestCreateCommandDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public CreateStandardSetRequestCreateCommandDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public CreateStandardSetRequestCreateCommand setMaintainerList(java.util.List<String> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<String> getMaintainerList() {
            return this.maintainerList;
        }

        public CreateStandardSetRequestCreateCommand setMemberGroupList(java.util.List<String> memberGroupList) {
            this.memberGroupList = memberGroupList;
            return this;
        }
        public java.util.List<String> getMemberGroupList() {
            return this.memberGroupList;
        }

        public CreateStandardSetRequestCreateCommand setMemberList(java.util.List<String> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<String> getMemberList() {
            return this.memberList;
        }

        public CreateStandardSetRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardSetRequestCreateCommand setOfflineApprovalConfig(CreateStandardSetRequestCreateCommandOfflineApprovalConfig offlineApprovalConfig) {
            this.offlineApprovalConfig = offlineApprovalConfig;
            return this;
        }
        public CreateStandardSetRequestCreateCommandOfflineApprovalConfig getOfflineApprovalConfig() {
            return this.offlineApprovalConfig;
        }

        public CreateStandardSetRequestCreateCommand setVisibilityConfig(CreateStandardSetRequestCreateCommandVisibilityConfig visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }
        public CreateStandardSetRequestCreateCommandVisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

    }

}
