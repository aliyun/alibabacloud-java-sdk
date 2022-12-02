// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceFormProperty extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Placeholder")
    public Boolean placeholder;

    @NameInMap("Required")
    public Boolean required;

    @NameInMap("SearchSupported")
    public Boolean searchSupported;

    @NameInMap("Sequence")
    public Integer sequence;

    @NameInMap("TableVisible")
    public Boolean tableVisible;

    @NameInMap("Uniqueness")
    public Boolean uniqueness;

    @NameInMap("ValueReference")
    public String valueReference;

    @NameInMap("ValueSource")
    public String valueSource;

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
