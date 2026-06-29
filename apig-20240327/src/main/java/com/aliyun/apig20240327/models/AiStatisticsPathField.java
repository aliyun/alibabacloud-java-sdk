// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsPathField extends TeaModel {
    /**
     * <p>The secondary category.</p>
     * 
     * <strong>example:</strong>
     * <p>conversation</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The field description.</p>
     * 
     * <strong>example:</strong>
     * <p>用户输入的问题内容</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The log key.</p>
     * 
     * <strong>example:</strong>
     * <p>question</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>The request or response direction.</p>
     * 
     * <strong>example:</strong>
     * <p>request</p>
     */
    @NameInMap("io")
    public String io;

    /**
     * <p>The corresponding JSON path (GJSON syntax).</p>
     * 
     * <strong>example:</strong>
     * <p>messages.#.content</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The display name of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>问题内容</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether collection is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("recordEnabled")
    public Boolean recordEnabled;

    /**
     * <p>The rule used for streaming response extraction. Valid values:</p>
     * <ul>
     * <li>append: appends content</li>
     * <li>first: retrieves the first value</li>
     * <li>replace: retrieves the last value</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>append</p>
     */
    @NameInMap("rule")
    public String rule;

    /**
     * <p>Indicates whether the field is sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    /**
     * <p>The data source.</p>
     * 
     * <strong>example:</strong>
     * <p>request_body</p>
     */
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
