// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceFormProperty extends TeaModel {
    // 属性描述
    @NameInMap("Content")
    public String content;

    // 属性关键词
    @NameInMap("Keyword")
    public String keyword;

    // 前端界面控件占位符文字
    @NameInMap("Placeholder")
    public Boolean placeholder;

    // 属性是否必填
    @NameInMap("Required")
    public Boolean required;

    // 属性是否作为界面查询条件
    @NameInMap("SearchSupported")
    public Boolean searchSupported;

    // 属性展示的次序
    @NameInMap("Sequence")
    public Integer sequence;

    // 前端界面是否展示为表格列
    @NameInMap("TableVisible")
    public Boolean tableVisible;

    // 属性是否需要唯一检查
    @NameInMap("Uniqueness")
    public Boolean uniqueness;

    // 属性值来源具体的方式
    @NameInMap("ValueReference")
    public String valueReference;

    // 属性值来源类型：枚举、接口等
    @NameInMap("ValueSource")
    public String valueSource;

    // 属性类型，JSON或者分隔符
    @NameInMap("ValueType")
    public String valueType;

    public static DeviceFormProperty build(java.util.Map<String, ?> map) throws Exception {
        DeviceFormProperty self = new DeviceFormProperty();
        return TeaModel.build(map, self);
    }

    public DeviceFormProperty setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeviceFormProperty setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DeviceFormProperty setPlaceholder(Boolean placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    public Boolean getPlaceholder() {
        return this.placeholder;
    }

    public DeviceFormProperty setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public DeviceFormProperty setSearchSupported(Boolean searchSupported) {
        this.searchSupported = searchSupported;
        return this;
    }
    public Boolean getSearchSupported() {
        return this.searchSupported;
    }

    public DeviceFormProperty setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public DeviceFormProperty setTableVisible(Boolean tableVisible) {
        this.tableVisible = tableVisible;
        return this;
    }
    public Boolean getTableVisible() {
        return this.tableVisible;
    }

    public DeviceFormProperty setUniqueness(Boolean uniqueness) {
        this.uniqueness = uniqueness;
        return this;
    }
    public Boolean getUniqueness() {
        return this.uniqueness;
    }

    public DeviceFormProperty setValueReference(String valueReference) {
        this.valueReference = valueReference;
        return this;
    }
    public String getValueReference() {
        return this.valueReference;
    }

    public DeviceFormProperty setValueSource(String valueSource) {
        this.valueSource = valueSource;
        return this;
    }
    public String getValueSource() {
        return this.valueSource;
    }

    public DeviceFormProperty setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
