// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemAllFieldsResponseBody extends TeaModel {
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

    @NameInMap("fields")
    public java.util.List<ListWorkItemAllFieldsResponseBodyFields> fields;

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

    public static ListWorkItemAllFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemAllFieldsResponseBody self = new ListWorkItemAllFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkItemAllFieldsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkItemAllFieldsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListWorkItemAllFieldsResponseBody setFields(java.util.List<ListWorkItemAllFieldsResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<ListWorkItemAllFieldsResponseBodyFields> getFields() {
        return this.fields;
    }

    public ListWorkItemAllFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkItemAllFieldsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkItemAllFieldsResponseBodyFieldsOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>重复的缺陷</p>
         */
        @NameInMap("displayValue")
        public String displayValue;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        /**
         * <strong>example:</strong>
         * <p>重复的缺陷</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("position")
        public Long position;

        /**
         * <strong>example:</strong>
         * <p>重复的缺陷</p>
         */
        @NameInMap("value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("valueEn")
        public String valueEn;

        public static ListWorkItemAllFieldsResponseBodyFieldsOptions build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemAllFieldsResponseBodyFieldsOptions self = new ListWorkItemAllFieldsResponseBodyFieldsOptions();
            return TeaModel.build(map, self);
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListWorkItemAllFieldsResponseBodyFieldsOptions setValueEn(String valueEn) {
            this.valueEn = valueEn;
            return this;
        }
        public String getValueEn() {
            return this.valueEn;
        }

    }

    public static class ListWorkItemAllFieldsResponseBodyFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>例：date</p>
         */
        @NameInMap("className")
        public String className;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>字段的具体信息</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>list</p>
         */
        @NameInMap("format")
        public String format;

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
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isRequired")
        public Boolean isRequired;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isShowWhenCreate")
        public Boolean isShowWhenCreate;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isSystemRequired")
        public Boolean isSystemRequired;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("linkWithService")
        public String linkWithService;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>负责人</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("options")
        public java.util.List<ListWorkItemAllFieldsResponseBodyFieldsOptions> options;

        /**
         * <strong>example:</strong>
         * <p>例：Workitem</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>NativeField</p>
         */
        @NameInMap("type")
        public String type;

        public static ListWorkItemAllFieldsResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemAllFieldsResponseBodyFields self = new ListWorkItemAllFieldsResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public ListWorkItemAllFieldsResponseBodyFields setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListWorkItemAllFieldsResponseBodyFields setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkItemAllFieldsResponseBodyFields setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListWorkItemAllFieldsResponseBodyFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkItemAllFieldsResponseBodyFields setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListWorkItemAllFieldsResponseBodyFields setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkItemAllFieldsResponseBodyFields setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkItemAllFieldsResponseBodyFields setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkItemAllFieldsResponseBodyFields setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public ListWorkItemAllFieldsResponseBodyFields setIsShowWhenCreate(Boolean isShowWhenCreate) {
            this.isShowWhenCreate = isShowWhenCreate;
            return this;
        }
        public Boolean getIsShowWhenCreate() {
            return this.isShowWhenCreate;
        }

        public ListWorkItemAllFieldsResponseBodyFields setIsSystemRequired(Boolean isSystemRequired) {
            this.isSystemRequired = isSystemRequired;
            return this;
        }
        public Boolean getIsSystemRequired() {
            return this.isSystemRequired;
        }

        public ListWorkItemAllFieldsResponseBodyFields setLinkWithService(String linkWithService) {
            this.linkWithService = linkWithService;
            return this;
        }
        public String getLinkWithService() {
            return this.linkWithService;
        }

        public ListWorkItemAllFieldsResponseBodyFields setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListWorkItemAllFieldsResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkItemAllFieldsResponseBodyFields setOptions(java.util.List<ListWorkItemAllFieldsResponseBodyFieldsOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<ListWorkItemAllFieldsResponseBodyFieldsOptions> getOptions() {
            return this.options;
        }

        public ListWorkItemAllFieldsResponseBodyFields setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListWorkItemAllFieldsResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
