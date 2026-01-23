// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardSetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StandardSetInfo")
    public GetStandardSetResponseBodyStandardSetInfo standardSetInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetStandardSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardSetResponseBody self = new GetStandardSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStandardSetResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStandardSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStandardSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardSetResponseBody setStandardSetInfo(GetStandardSetResponseBodyStandardSetInfo standardSetInfo) {
        this.standardSetInfo = standardSetInfo;
        return this;
    }
    public GetStandardSetResponseBodyStandardSetInfo getStandardSetInfo() {
        return this.standardSetInfo;
    }

    public GetStandardSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStandardSetResponseBodyStandardSetInfoApprovalConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BY_DEFAULT</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        @NameInMap("EnableApproval")
        public Boolean enableApproval;

        @NameInMap("IsSubmitInBatch")
        public Boolean isSubmitInBatch;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static GetStandardSetResponseBodyStandardSetInfoApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoApprovalConfig self = new GetStandardSetResponseBodyStandardSetInfoApprovalConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoCreator self = new GetStandardSetResponseBodyStandardSetInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoDirectoryReference extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/dir1</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static GetStandardSetResponseBodyStandardSetInfoDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoDirectoryReference self = new GetStandardSetResponseBodyStandardSetInfoDirectoryReference();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoLastModifier extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoLastModifier build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoLastModifier self = new GetStandardSetResponseBodyStandardSetInfoLastModifier();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoLastModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoLastModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoMaintainerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoMaintainerList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoMaintainerList self = new GetStandardSetResponseBodyStandardSetInfoMaintainerList();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoMaintainerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoMaintainerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoMemberGroupList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoMemberGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoMemberGroupList self = new GetStandardSetResponseBodyStandardSetInfoMemberGroupList();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoMemberGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoMemberGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoMemberList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoMemberList self = new GetStandardSetResponseBodyStandardSetInfoMemberList();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoMemberList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoMemberList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BY_DEFAULT</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        @NameInMap("EnableApproval")
        public Boolean enableApproval;

        @NameInMap("IsSubmitInBatch")
        public Boolean isSubmitInBatch;

        /**
         * <strong>example:</strong>
         * <p>1121</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        public static GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig self = new GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig setEnableApproval(Boolean enableApproval) {
            this.enableApproval = enableApproval;
            return this;
        }
        public Boolean getEnableApproval() {
            return this.enableApproval;
        }

        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig setIsSubmitInBatch(Boolean isSubmitInBatch) {
            this.isSubmitInBatch = isSubmitInBatch;
            return this;
        }
        public Boolean getIsSubmitInBatch() {
            return this.isSubmitInBatch;
        }

        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300000913</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>susan</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList self = new GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfoVisibilityConfig extends TeaModel {
        @NameInMap("SpecifiedUserList")
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList> specifiedUserList;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStandardSetResponseBodyStandardSetInfoVisibilityConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfoVisibilityConfig self = new GetStandardSetResponseBodyStandardSetInfoVisibilityConfig();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfig setSpecifiedUserList(java.util.List<GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList> specifiedUserList) {
            this.specifiedUserList = specifiedUserList;
            return this;
        }
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoVisibilityConfigSpecifiedUserList> getSpecifiedUserList() {
            return this.specifiedUserList;
        }

        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetStandardSetResponseBodyStandardSetInfo extends TeaModel {
        @NameInMap("ApprovalConfig")
        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig approvalConfig;

        /**
         * <strong>example:</strong>
         * <p>CITY</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public GetStandardSetResponseBodyStandardSetInfoCreator creator;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DefaultStandardTemplateId")
        public Long defaultStandardTemplateId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DirectoryReference")
        public GetStandardSetResponseBodyStandardSetInfoDirectoryReference directoryReference;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LastModifier")
        public GetStandardSetResponseBodyStandardSetInfoLastModifier lastModifier;

        @NameInMap("MaintainerList")
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMaintainerList> maintainerList;

        @NameInMap("MemberGroupList")
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberGroupList> memberGroupList;

        @NameInMap("MemberList")
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberList> memberList;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("OfflineApprovalConfig")
        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig offlineApprovalConfig;

        @NameInMap("VisibilityConfig")
        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfig visibilityConfig;

        public static GetStandardSetResponseBodyStandardSetInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStandardSetResponseBodyStandardSetInfo self = new GetStandardSetResponseBodyStandardSetInfo();
            return TeaModel.build(map, self);
        }

        public GetStandardSetResponseBodyStandardSetInfo setApprovalConfig(GetStandardSetResponseBodyStandardSetInfoApprovalConfig approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        public GetStandardSetResponseBodyStandardSetInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetStandardSetResponseBodyStandardSetInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStandardSetResponseBodyStandardSetInfo setCreator(GetStandardSetResponseBodyStandardSetInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoCreator getCreator() {
            return this.creator;
        }

        public GetStandardSetResponseBodyStandardSetInfo setDefaultStandardTemplateId(Long defaultStandardTemplateId) {
            this.defaultStandardTemplateId = defaultStandardTemplateId;
            return this;
        }
        public Long getDefaultStandardTemplateId() {
            return this.defaultStandardTemplateId;
        }

        public GetStandardSetResponseBodyStandardSetInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStandardSetResponseBodyStandardSetInfo setDirectoryReference(GetStandardSetResponseBodyStandardSetInfoDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public GetStandardSetResponseBodyStandardSetInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetStandardSetResponseBodyStandardSetInfo setLastModifier(GetStandardSetResponseBodyStandardSetInfoLastModifier lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoLastModifier getLastModifier() {
            return this.lastModifier;
        }

        public GetStandardSetResponseBodyStandardSetInfo setMaintainerList(java.util.List<GetStandardSetResponseBodyStandardSetInfoMaintainerList> maintainerList) {
            this.maintainerList = maintainerList;
            return this;
        }
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMaintainerList> getMaintainerList() {
            return this.maintainerList;
        }

        public GetStandardSetResponseBodyStandardSetInfo setMemberGroupList(java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberGroupList> memberGroupList) {
            this.memberGroupList = memberGroupList;
            return this;
        }
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberGroupList> getMemberGroupList() {
            return this.memberGroupList;
        }

        public GetStandardSetResponseBodyStandardSetInfo setMemberList(java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<GetStandardSetResponseBodyStandardSetInfoMemberList> getMemberList() {
            return this.memberList;
        }

        public GetStandardSetResponseBodyStandardSetInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetStandardSetResponseBodyStandardSetInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStandardSetResponseBodyStandardSetInfo setOfflineApprovalConfig(GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig offlineApprovalConfig) {
            this.offlineApprovalConfig = offlineApprovalConfig;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoOfflineApprovalConfig getOfflineApprovalConfig() {
            return this.offlineApprovalConfig;
        }

        public GetStandardSetResponseBodyStandardSetInfo setVisibilityConfig(GetStandardSetResponseBodyStandardSetInfoVisibilityConfig visibilityConfig) {
            this.visibilityConfig = visibilityConfig;
            return this;
        }
        public GetStandardSetResponseBodyStandardSetInfoVisibilityConfig getVisibilityConfig() {
            return this.visibilityConfig;
        }

    }

}
