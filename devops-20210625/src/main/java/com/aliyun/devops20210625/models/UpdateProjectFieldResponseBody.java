// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProjectFieldResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("project")
    public UpdateProjectFieldResponseBodyProject project;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>true/false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateProjectFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectFieldResponseBody self = new UpdateProjectFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectFieldResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProjectFieldResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProjectFieldResponseBody setProject(UpdateProjectFieldResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public UpdateProjectFieldResponseBodyProject getProject() {
        return this.project;
    }

    public UpdateProjectFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProjectFieldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateProjectFieldResponseBodyProjectFieldList extends TeaModel {
        @NameInMap("displayName")
        public String displayName;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("value")
        public String value;

        @NameInMap("valueType")
        public String valueType;

        public static UpdateProjectFieldResponseBodyProjectFieldList build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectFieldResponseBodyProjectFieldList self = new UpdateProjectFieldResponseBodyProjectFieldList();
            return TeaModel.build(map, self);
        }

        public UpdateProjectFieldResponseBodyProjectFieldList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateProjectFieldResponseBodyProjectFieldList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateProjectFieldResponseBodyProjectFieldList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateProjectFieldResponseBodyProjectFieldList setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateProjectFieldResponseBodyProject extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        @NameInMap("creator")
        public String creator;

        @NameInMap("customCode")
        public String customCode;

        @NameInMap("description")
        public String description;

        @NameInMap("fieldList")
        public java.util.List<UpdateProjectFieldResponseBodyProjectFieldList> fieldList;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("icon")
        public String icon;

        @NameInMap("iconBig")
        public String iconBig;

        @NameInMap("iconGroup")
        public String iconGroup;

        @NameInMap("iconSmall")
        public String iconSmall;

        @NameInMap("id")
        public String id;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("identifierPath")
        public String identifierPath;

        @NameInMap("logicalStatus")
        public String logicalStatus;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("name")
        public String name;

        @NameInMap("organizationIdentifier")
        public String organizationIdentifier;

        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        @NameInMap("scope")
        public String scope;

        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        @NameInMap("statusName")
        public String statusName;

        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        @NameInMap("subType")
        public String subType;

        @NameInMap("typeIdentifier")
        public String typeIdentifier;

        public static UpdateProjectFieldResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectFieldResponseBodyProject self = new UpdateProjectFieldResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public UpdateProjectFieldResponseBodyProject setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateProjectFieldResponseBodyProject setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public UpdateProjectFieldResponseBodyProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateProjectFieldResponseBodyProject setCustomCode(String customCode) {
            this.customCode = customCode;
            return this;
        }
        public String getCustomCode() {
            return this.customCode;
        }

        public UpdateProjectFieldResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProjectFieldResponseBodyProject setFieldList(java.util.List<UpdateProjectFieldResponseBodyProjectFieldList> fieldList) {
            this.fieldList = fieldList;
            return this;
        }
        public java.util.List<UpdateProjectFieldResponseBodyProjectFieldList> getFieldList() {
            return this.fieldList;
        }

        public UpdateProjectFieldResponseBodyProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateProjectFieldResponseBodyProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public UpdateProjectFieldResponseBodyProject setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public UpdateProjectFieldResponseBodyProject setIconBig(String iconBig) {
            this.iconBig = iconBig;
            return this;
        }
        public String getIconBig() {
            return this.iconBig;
        }

        public UpdateProjectFieldResponseBodyProject setIconGroup(String iconGroup) {
            this.iconGroup = iconGroup;
            return this;
        }
        public String getIconGroup() {
            return this.iconGroup;
        }

        public UpdateProjectFieldResponseBodyProject setIconSmall(String iconSmall) {
            this.iconSmall = iconSmall;
            return this;
        }
        public String getIconSmall() {
            return this.iconSmall;
        }

        public UpdateProjectFieldResponseBodyProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProjectFieldResponseBodyProject setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public UpdateProjectFieldResponseBodyProject setIdentifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            return this;
        }
        public String getIdentifierPath() {
            return this.identifierPath;
        }

        public UpdateProjectFieldResponseBodyProject setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public UpdateProjectFieldResponseBodyProject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateProjectFieldResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProjectFieldResponseBodyProject setOrganizationIdentifier(String organizationIdentifier) {
            this.organizationIdentifier = organizationIdentifier;
            return this;
        }
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

        public UpdateProjectFieldResponseBodyProject setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public UpdateProjectFieldResponseBodyProject setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateProjectFieldResponseBodyProject setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public UpdateProjectFieldResponseBodyProject setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public UpdateProjectFieldResponseBodyProject setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public UpdateProjectFieldResponseBodyProject setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public UpdateProjectFieldResponseBodyProject setTypeIdentifier(String typeIdentifier) {
            this.typeIdentifier = typeIdentifier;
            return this;
        }
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

    }

}
