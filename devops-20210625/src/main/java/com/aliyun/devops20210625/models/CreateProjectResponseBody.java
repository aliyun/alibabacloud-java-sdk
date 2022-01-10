// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 项目信息
    @NameInMap("project")
    public CreateProjectResponseBodyProject project;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateProjectResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateProjectResponseBody setProject(CreateProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public CreateProjectResponseBodyProject getProject() {
        return this.project;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProjectResponseBodyProject extends TeaModel {
        // 空间大类
        @NameInMap("category")
        public String category;

        // 空间大类id
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        // 创建人id
        @NameInMap("creator")
        public String creator;

        // 自定义编号
        @NameInMap("customCode")
        public String customCode;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 图标
        @NameInMap("icon")
        public String icon;

        // 大图标
        @NameInMap("iconBig")
        public String iconBig;

        // 图表组，json格式字符串
        @NameInMap("iconGroup")
        public String iconGroup;

        // 小图标
        @NameInMap("iconSmall")
        public String iconSmall;

        // 项目id
        @NameInMap("id")
        public String id;

        // 项目唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 空间路径
        @NameInMap("identifierPath")
        public String identifierPath;

        // 项目状态
        @NameInMap("logicalStatus")
        public String logicalStatus;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 项目名称
        @NameInMap("name")
        public String name;

        // 企业id
        @NameInMap("organizationIdentifier")
        public String organizationIdentifier;

        // 父项目id
        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        // 可见范围
        @NameInMap("scope")
        public String scope;

        // 状态id
        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        // 状态阶段
        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        // 空间小类
        @NameInMap("subType")
        public String subType;

        // 空间小类id
        @NameInMap("typeIdentifier")
        public String typeIdentifier;

        public static CreateProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyProject self = new CreateProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyProject setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateProjectResponseBodyProject setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public CreateProjectResponseBodyProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateProjectResponseBodyProject setCustomCode(String customCode) {
            this.customCode = customCode;
            return this;
        }
        public String getCustomCode() {
            return this.customCode;
        }

        public CreateProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProjectResponseBodyProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateProjectResponseBodyProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateProjectResponseBodyProject setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateProjectResponseBodyProject setIconBig(String iconBig) {
            this.iconBig = iconBig;
            return this;
        }
        public String getIconBig() {
            return this.iconBig;
        }

        public CreateProjectResponseBodyProject setIconGroup(String iconGroup) {
            this.iconGroup = iconGroup;
            return this;
        }
        public String getIconGroup() {
            return this.iconGroup;
        }

        public CreateProjectResponseBodyProject setIconSmall(String iconSmall) {
            this.iconSmall = iconSmall;
            return this;
        }
        public String getIconSmall() {
            return this.iconSmall;
        }

        public CreateProjectResponseBodyProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateProjectResponseBodyProject setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateProjectResponseBodyProject setIdentifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            return this;
        }
        public String getIdentifierPath() {
            return this.identifierPath;
        }

        public CreateProjectResponseBodyProject setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public CreateProjectResponseBodyProject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateProjectResponseBodyProject setOrganizationIdentifier(String organizationIdentifier) {
            this.organizationIdentifier = organizationIdentifier;
            return this;
        }
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

        public CreateProjectResponseBodyProject setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public CreateProjectResponseBodyProject setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateProjectResponseBodyProject setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public CreateProjectResponseBodyProject setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public CreateProjectResponseBodyProject setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public CreateProjectResponseBodyProject setTypeIdentifier(String typeIdentifier) {
            this.typeIdentifier = typeIdentifier;
            return this;
        }
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

    }

}
