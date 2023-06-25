// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListTestCaseFieldsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("fields")
    public java.util.List<ListTestCaseFieldsResponseBodyFields> fields;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListTestCaseFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTestCaseFieldsResponseBody self = new ListTestCaseFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTestCaseFieldsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTestCaseFieldsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListTestCaseFieldsResponseBody setFields(java.util.List<ListTestCaseFieldsResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<ListTestCaseFieldsResponseBodyFields> getFields() {
        return this.fields;
    }

    public ListTestCaseFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTestCaseFieldsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTestCaseFieldsResponseBodyFieldsOptions extends TeaModel {
        @NameInMap("displayValue")
        public String displayValue;

        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("level")
        public Long level;

        @NameInMap("position")
        public Long position;

        @NameInMap("value")
        public String value;

        @NameInMap("valueEn")
        public String valueEn;

        public static ListTestCaseFieldsResponseBodyFieldsOptions build(java.util.Map<String, ?> map) throws Exception {
            ListTestCaseFieldsResponseBodyFieldsOptions self = new ListTestCaseFieldsResponseBodyFieldsOptions();
            return TeaModel.build(map, self);
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
            return this;
        }
        public String getDisplayValue() {
            return this.displayValue;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setFieldIdentifier(String fieldIdentifier) {
            this.fieldIdentifier = fieldIdentifier;
            return this;
        }
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListTestCaseFieldsResponseBodyFieldsOptions setValueEn(String valueEn) {
            this.valueEn = valueEn;
            return this;
        }
        public String getValueEn() {
            return this.valueEn;
        }

    }

    public static class ListTestCaseFieldsResponseBodyFields extends TeaModel {
        @NameInMap("className")
        public String className;

        @NameInMap("creator")
        public String creator;

        @NameInMap("defaultValue")
        public String defaultValue;

        @NameInMap("description")
        public String description;

        @NameInMap("format")
        public String format;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("isRequired")
        public Boolean isRequired;

        @NameInMap("isShowWhenCreate")
        public Boolean isShowWhenCreate;

        @NameInMap("isSystemRequired")
        public Boolean isSystemRequired;

        @NameInMap("linkWithService")
        public String linkWithService;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("name")
        public String name;

        @NameInMap("options")
        public java.util.List<ListTestCaseFieldsResponseBodyFieldsOptions> options;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("type")
        public String type;

        public static ListTestCaseFieldsResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            ListTestCaseFieldsResponseBodyFields self = new ListTestCaseFieldsResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public ListTestCaseFieldsResponseBodyFields setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListTestCaseFieldsResponseBodyFields setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTestCaseFieldsResponseBodyFields setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListTestCaseFieldsResponseBodyFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTestCaseFieldsResponseBodyFields setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListTestCaseFieldsResponseBodyFields setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTestCaseFieldsResponseBodyFields setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTestCaseFieldsResponseBodyFields setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListTestCaseFieldsResponseBodyFields setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public ListTestCaseFieldsResponseBodyFields setIsShowWhenCreate(Boolean isShowWhenCreate) {
            this.isShowWhenCreate = isShowWhenCreate;
            return this;
        }
        public Boolean getIsShowWhenCreate() {
            return this.isShowWhenCreate;
        }

        public ListTestCaseFieldsResponseBodyFields setIsSystemRequired(Boolean isSystemRequired) {
            this.isSystemRequired = isSystemRequired;
            return this;
        }
        public Boolean getIsSystemRequired() {
            return this.isSystemRequired;
        }

        public ListTestCaseFieldsResponseBodyFields setLinkWithService(String linkWithService) {
            this.linkWithService = linkWithService;
            return this;
        }
        public String getLinkWithService() {
            return this.linkWithService;
        }

        public ListTestCaseFieldsResponseBodyFields setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListTestCaseFieldsResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTestCaseFieldsResponseBodyFields setOptions(java.util.List<ListTestCaseFieldsResponseBodyFieldsOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<ListTestCaseFieldsResponseBodyFieldsOptions> getOptions() {
            return this.options;
        }

        public ListTestCaseFieldsResponseBodyFields setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTestCaseFieldsResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
