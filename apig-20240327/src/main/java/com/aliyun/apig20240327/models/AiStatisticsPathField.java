// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsPathField extends TeaModel {
    /**
     * <p>The secondary business category of the field. Optional. Valid values: conversation (conversation content), config (configuration parameters), tools (tool calling), usage (usage statistics), metadata (metadata), choices (candidate results), identity (identity identifier), cache (cache information), media (multimedia content), logprobs (log probabilities), and custom (custom field). Set custom fields to custom.</p>
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
     * <p>The question content entered by the user</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The log key (field name).</p>
     * 
     * <strong>example:</strong>
     * <p>question</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>The request or response attribution. The backend normalizes this to request or response based on source.</p>
     * 
     * <strong>example:</strong>
     * <p>request</p>
     */
    @NameInMap("io")
    public String io;

    /**
     * <p>The corresponding jsonPath (gjson syntax).</p>
     * 
     * <strong>example:</strong>
     * <p>messages.#.content</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The annotation for the field key name.</p>
     * 
     * <strong>example:</strong>
     * <p>Question content</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Indicates whether collection is enabled to create a log record for the corresponding field in AI request logs.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("recordEnabled")
    public Boolean recordEnabled;

    /**
     * <p>The aggregation rule for streaming response fields. Valid values: append, first, and replace. append: appends the matched values from each streaming chunk in sequence. first: retains the first matched value. replace: uses the last matched value. When source is response_streaming_body and rule is not specified, first is used by default. This field is not required for non-streaming scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>append</p>
     */
    @NameInMap("rule")
    public String rule;

    /**
     * <p>Specifies whether the field is sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    /**
     * <p>The source of the field value. Valid values: fixed_value (fixed value), request_body (request body), request_header (request header), response_header (response header), response_body (non-streaming response body), and response_streaming_body (streaming response body).</p>
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
