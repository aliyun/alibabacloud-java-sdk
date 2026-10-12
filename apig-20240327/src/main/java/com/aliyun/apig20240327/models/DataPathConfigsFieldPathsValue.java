// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DataPathConfigsFieldPathsValue extends TeaModel {
    /**
     * <p>The identity key of the field, which is unique within the same request path, such as input_token.</p>
     * 
     * <strong>example:</strong>
     * <p>input_token</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>The JSONPath expression of the field in the request or response message, such as usage.prompt_tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>usage.prompt_tokens</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The value extraction rule for the field.</p>
     * 
     * <strong>example:</strong>
     * <p>first</p>
     */
    @NameInMap("rule")
    public String rule;

    /**
     * <p>The display name of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>Input token</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The description of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>Input token statistics</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The source of the field value, indicating which part of the message the field is read from, such as response_body.</p>
     * 
     * <strong>example:</strong>
     * <p>response_body</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The statistical category to which the field belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>usage</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The message direction to which the field belongs, indicating whether it is extracted from the request or the response.</p>
     * 
     * <strong>example:</strong>
     * <p>response</p>
     */
    @NameInMap("io")
    public String io;

    /**
     * <p>Indicates whether the field contains sensitive information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    /**
     * <p>Indicates whether collection is enabled for the field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("recordEnabled")
    public Boolean recordEnabled;

    /**
     * <p>Indicates whether the collection status of the field can be toggled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("toggleAllowed")
    public Boolean toggleAllowed;

    /**
     * <p>Indicates whether the JSONPath of the field can be rewritten.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("jsonPathRewriteAllowed")
    public Boolean jsonPathRewriteAllowed;

    /**
     * <p>Indicates whether the field configuration is derived from a field template.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("fromTemplate")
    public Boolean fromTemplate;

    public static DataPathConfigsFieldPathsValue build(java.util.Map<String, ?> map) throws Exception {
        DataPathConfigsFieldPathsValue self = new DataPathConfigsFieldPathsValue();
        return TeaModel.build(map, self);
    }

    public DataPathConfigsFieldPathsValue setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }
    public String getFieldKey() {
        return this.fieldKey;
    }

    public DataPathConfigsFieldPathsValue setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }
    public String getJsonPath() {
        return this.jsonPath;
    }

    public DataPathConfigsFieldPathsValue setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public DataPathConfigsFieldPathsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataPathConfigsFieldPathsValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataPathConfigsFieldPathsValue setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DataPathConfigsFieldPathsValue setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataPathConfigsFieldPathsValue setIo(String io) {
        this.io = io;
        return this;
    }
    public String getIo() {
        return this.io;
    }

    public DataPathConfigsFieldPathsValue setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public DataPathConfigsFieldPathsValue setRecordEnabled(Boolean recordEnabled) {
        this.recordEnabled = recordEnabled;
        return this;
    }
    public Boolean getRecordEnabled() {
        return this.recordEnabled;
    }

    public DataPathConfigsFieldPathsValue setToggleAllowed(Boolean toggleAllowed) {
        this.toggleAllowed = toggleAllowed;
        return this;
    }
    public Boolean getToggleAllowed() {
        return this.toggleAllowed;
    }

    public DataPathConfigsFieldPathsValue setJsonPathRewriteAllowed(Boolean jsonPathRewriteAllowed) {
        this.jsonPathRewriteAllowed = jsonPathRewriteAllowed;
        return this;
    }
    public Boolean getJsonPathRewriteAllowed() {
        return this.jsonPathRewriteAllowed;
    }

    public DataPathConfigsFieldPathsValue setFromTemplate(Boolean fromTemplate) {
        this.fromTemplate = fromTemplate;
        return this;
    }
    public Boolean getFromTemplate() {
        return this.fromTemplate;
    }

}
