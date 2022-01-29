// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemAllFieldsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 字段信息
    @NameInMap("fields")
    public java.util.List<ListWorkItemAllFieldsResponseBodyFields> fields;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
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
        // 根据语言环境获取当前展示的值
        @NameInMap("displayValue")
        public String displayValue;

        // 字段唯一标识
        @NameInMap("fieldIdentifier")
        public String fieldIdentifier;

        // 待选值的唯一标识
        @NameInMap("identifier")
        public String identifier;

        // 展示级别，数字范围1~9，数字越大，颜色越浅。
        @NameInMap("level")
        public Long level;

        // 待选值顺序
        @NameInMap("position")
        public Long position;

        // 待选值中文名称
        @NameInMap("value")
        public String value;

        // 待选值英文名称
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
        // 字段类型
        @NameInMap("className")
        public String className;

        // 创建人id
        @NameInMap("creator")
        public String creator;

        // 默认值
        @NameInMap("defaultValue")
        public String defaultValue;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 字段格式
        @NameInMap("format")
        public String format;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 字段唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 是否必填
        @NameInMap("isRequired")
        public Boolean isRequired;

        // 创建时是否展示
        @NameInMap("isShowWhenCreate")
        public Boolean isShowWhenCreate;

        // 是否是系统必须字段，比如：负责人、状态等。
        @NameInMap("isSystemRequired")
        public Boolean isSystemRequired;

        // 联动的服务，比如：迭代 迭代服务开启/关闭，这个字段字段加进/剔除出对应的模板； 字段模板里，这类字段不能手动添加或删除
        @NameInMap("linkWithService")
        public String linkWithService;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 字段名称
        @NameInMap("name")
        public String name;

        // 待选值
        @NameInMap("options")
        public java.util.List<ListWorkItemAllFieldsResponseBodyFieldsOptions> options;

        // 区分不同的适用对象
        @NameInMap("resourceType")
        public String resourceType;

        // 区分不同的类型，如系统字段、用户自定义字段
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
