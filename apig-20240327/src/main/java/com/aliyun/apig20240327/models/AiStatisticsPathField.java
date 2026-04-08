// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsPathField extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("description")
    public String description;

    @NameInMap("fieldKey")
    public String fieldKey;

    @NameInMap("io")
    public String io;

    @NameInMap("jsonPath")
    public String jsonPath;

    @NameInMap("name")
    public String name;

    @NameInMap("recordEnabled")
    public Boolean recordEnabled;

    @NameInMap("rule")
    public String rule;

    @NameInMap("sensitive")
    public Boolean sensitive;

    @NameInMap("source")
    public String source;

    public static AiStatisticsPathField build(java.util.Map<String, ?> map) throws Exception {
        AiStatisticsPathField self = new AiStatisticsPathField();
        return TeaModel.build(map, self);
    }

    public AiStatisticsPathField setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public AiStatisticsPathField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AiStatisticsPathField setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public AiStatisticsPathField setIo(String io) {
        this.io = io;
        return this;
    }
    public String getIo() {
        return this.io;
    }

    public AiStatisticsPathField setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }
    public String getJsonPath() {
        return this.jsonPath;
    }

    public AiStatisticsPathField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AiStatisticsPathField setRecordEnabled(Boolean recordEnabled) {
        this.recordEnabled = recordEnabled;
        return this;
    }
    public Boolean getRecordEnabled() {
        return this.recordEnabled;
    }

    public AiStatisticsPathField setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public AiStatisticsPathField setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public AiStatisticsPathField setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
