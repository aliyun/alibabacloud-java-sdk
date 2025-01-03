// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

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
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("copyFrom")
        public String copyFrom;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>迭代的具体信息</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.xxxx.png">https://img.xxxx.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>专用模板</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Test Template</p>
         */
        @NameInMap("nameEn")
        public String nameEn;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("resourceCategory")
        public String resourceCategory;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("spaceType")
        public String spaceType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
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
