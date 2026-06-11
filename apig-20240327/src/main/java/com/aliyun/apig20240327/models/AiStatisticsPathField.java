// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiStatisticsPathField extends TeaModel {
    /**
     * <p>The category to which the field belongs, used for grouping and organizing fields.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>A detailed description that provides additional context about the field\&quot;s purpose and usage.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The unique key used to identify the field in statistical results.</p>
     */
    @NameInMap("fieldKey")
    public String fieldKey;

    /**
     * <p>Specifies whether the field is an input or an output. Valid values are typically <code>IN</code> or <code>OUT</code>.</p>
     */
    @NameInMap("io")
    public String io;

    /**
     * <p>The JSONPath expression to extract the field value from the source data.</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The display name of the field, used for labeling in user interfaces or reports.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether logging is enabled for this field. If set to <code>true</code>, the system records the field\&quot;s value in logs.</p>
     */
    @NameInMap("recordEnabled")
    public Boolean recordEnabled;

    /**
     * <p>A rule or condition applied to the extracted field. The rule\&quot;s format and effect are implementation-specific.</p>
     */
    @NameInMap("rule")
    public String rule;

    /**
     * <p>Indicates whether the field contains sensitive information. If set to <code>true</code>, the system may apply masking or other security measures.</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    /**
     * <p>The data source from which the field is extracted. For example, <code>Request</code> or <code>Response</code>.</p>
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
