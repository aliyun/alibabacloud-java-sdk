// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectTemplatesResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    // 项目模板信息
    @NameInMap("templates")
    public java.util.List<ListProjectTemplatesResponseBodyTemplates> templates;

    public static ListProjectTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectTemplatesResponseBody self = new ListProjectTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProjectTemplatesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListProjectTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectTemplatesResponseBody setTemplates(java.util.List<ListProjectTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListProjectTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListProjectTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("copyFrom")
        public String copyFrom;

        // 创建人id
        @NameInMap("creator")
        public String creator;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 模板封面
        @NameInMap("icon")
        public String icon;

        // 模板唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 模板名称
        @NameInMap("name")
        public String name;

        // 模板英文名称
        @NameInMap("nameEn")
        public String nameEn;

        // 所属资源类型
        @NameInMap("resourceCategory")
        public String resourceCategory;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("spaceType")
        public String spaceType;

        // 模板类型 0-system/4-custom/16-instance
        @NameInMap("type")
        public Long type;

        public static ListProjectTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListProjectTemplatesResponseBodyTemplates self = new ListProjectTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListProjectTemplatesResponseBodyTemplates setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public String getCopyFrom() {
            return this.copyFrom;
        }

        public ListProjectTemplatesResponseBodyTemplates setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectTemplatesResponseBodyTemplates setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectTemplatesResponseBodyTemplates setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListProjectTemplatesResponseBodyTemplates setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListProjectTemplatesResponseBodyTemplates setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListProjectTemplatesResponseBodyTemplates setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListProjectTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectTemplatesResponseBodyTemplates setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public ListProjectTemplatesResponseBodyTemplates setResourceCategory(String resourceCategory) {
            this.resourceCategory = resourceCategory;
            return this;
        }
        public String getResourceCategory() {
            return this.resourceCategory;
        }

        public ListProjectTemplatesResponseBodyTemplates setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListProjectTemplatesResponseBodyTemplates setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public ListProjectTemplatesResponseBodyTemplates setSpaceType(String spaceType) {
            this.spaceType = spaceType;
            return this;
        }
        public String getSpaceType() {
            return this.spaceType;
        }

        public ListProjectTemplatesResponseBodyTemplates setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
