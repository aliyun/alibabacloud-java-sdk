// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ModelParameters extends TeaModel {
    /**
     * <p>Specifies whether to enable explicit caching for system messages.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableCacheControl")
    public Boolean enableCacheControl;

    /**
     * <p>Specifies whether to enable thinking mode. This takes effect only for hybrid thinking models and defaults to false if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableThinking")
    public Boolean enableThinking;

    /**
     * <p>The extended parameters, which are a serialized string of a JSON object. These are merged into the top level of the model request body to pass through other Model Studio parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable_search&quot;:false}</p>
     */
    @NameInMap("extraBody")
    public String extraBody;

    /**
     * <p>The frequency penalty where positive values reduce repetition, with a range of -2.0 to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("frequencyPenalty")
    public Float frequencyPenalty;

    /**
     * <p>The maximum number of output tokens, including the chain-of-thought and the response. This is recommended for thinking models.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("maxCompletionTokens")
    public Integer maxCompletionTokens;

    /**
     * <p>The maximum number of output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("maxTokens")
    public Long maxTokens;

    /**
     * <p>The presence penalty where positive values encourage new topics, with a range of -2.0 to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("presencePenalty")
    public Float presencePenalty;

    /**
     * <p>The reasoning effort level. This takes effect only when thinking mode is enabled. For the Qwen3.8 series, valid values are low, medium, and xhigh. This cannot be set simultaneously with thinkingBudget.</p>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("reasoningEffort")
    public String reasoningEffort;

    /**
     * <p>The repetition penalty that controls the repetition of consecutive sequences. The value must be greater than 0. A value of 1.0 indicates no penalty, and a larger value results in less repetition.</p>
     * 
     * <strong>example:</strong>
     * <p>1.05</p>
     */
    @NameInMap("repetitionPenalty")
    public Double repetitionPenalty;

    /**
     * <p>The response content format, which defaults to text if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;json_schema&quot;,&quot;jsonSchema&quot;:{&quot;name&quot;:&quot;answer&quot;,&quot;strict&quot;:true,&quot;schema&quot;:&quot;{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;answer\&quot;:{\&quot;type\&quot;:\&quot;string\&quot;}},\&quot;required\&quot;:[\&quot;answer\&quot;]}&quot;}}</p>
     */
    @NameInMap("responseFormat")
    public ModelParametersResponseFormat responseFormat;

    /**
     * <p>The random seed, with a range of 0 to 2147483647, which attempts to return the same result for the same input and parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("seed")
    public Integer seed;

    /**
     * <p>The stop sequences that immediately halt generation when encountered.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;END&quot;]</p>
     */
    @NameInMap("stopSequences")
    public java.util.List<String> stopSequences;

    /**
     * <p>The temperature parameter that controls the randomness of the output, with a range of 0 to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("temperature")
    public Float temperature;

    /**
     * <p>The maximum number of tokens for the thinking process. This takes effect only when thinking mode is enabled and cannot be set simultaneously with reasoningEffort.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("thinkingBudget")
    public Integer thinkingBudget;

    /**
     * <p>The Top K sampling parameter, with a range of 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("topK")
    public Integer topK;

    /**
     * <p>The Top P sampling parameter, with a range of 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("topP")
    public Float topP;

    public static ModelParameters build(java.util.Map<String, ?> map) throws Exception {
        ModelParameters self = new ModelParameters();
        return TeaModel.build(map, self);
    }

    public ModelParameters setEnableCacheControl(Boolean enableCacheControl) {
        this.enableCacheControl = enableCacheControl;
        return this;
    }
    public Boolean getEnableCacheControl() {
        return this.enableCacheControl;
    }

    public ModelParameters setEnableThinking(Boolean enableThinking) {
        this.enableThinking = enableThinking;
        return this;
    }
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    public ModelParameters setExtraBody(String extraBody) {
        this.extraBody = extraBody;
        return this;
    }
    public String getExtraBody() {
        return this.extraBody;
    }

    public ModelParameters setFrequencyPenalty(Float frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    public Float getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    public ModelParameters setMaxCompletionTokens(Integer maxCompletionTokens) {
        this.maxCompletionTokens = maxCompletionTokens;
        return this;
    }
    public Integer getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }

    public ModelParameters setMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    public ModelParameters setPresencePenalty(Float presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    public Float getPresencePenalty() {
        return this.presencePenalty;
    }

    public ModelParameters setReasoningEffort(String reasoningEffort) {
        this.reasoningEffort = reasoningEffort;
        return this;
    }
    public String getReasoningEffort() {
        return this.reasoningEffort;
    }

    public ModelParameters setRepetitionPenalty(Double repetitionPenalty) {
        this.repetitionPenalty = repetitionPenalty;
        return this;
    }
    public Double getRepetitionPenalty() {
        return this.repetitionPenalty;
    }

    public ModelParameters setResponseFormat(ModelParametersResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
    public ModelParametersResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    public ModelParameters setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public ModelParameters setStopSequences(java.util.List<String> stopSequences) {
        this.stopSequences = stopSequences;
        return this;
    }
    public java.util.List<String> getStopSequences() {
        return this.stopSequences;
    }

    public ModelParameters setTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }
    public Float getTemperature() {
        return this.temperature;
    }

    public ModelParameters setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
        return this;
    }
    public Integer getThinkingBudget() {
        return this.thinkingBudget;
    }

    public ModelParameters setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public ModelParameters setTopP(Float topP) {
        this.topP = topP;
        return this;
    }
    public Float getTopP() {
        return this.topP;
    }

    public static class ModelParametersResponseFormatJsonSchema extends TeaModel {
        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>answer</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The JSON Schema definition, which is a serialized string of a JSON object.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;answer&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;answer&quot;]}</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>Specifies whether to strictly adhere to the schema structure. Set this to true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("strict")
        public Boolean strict;

        public static ModelParametersResponseFormatJsonSchema build(java.util.Map<String, ?> map) throws Exception {
            ModelParametersResponseFormatJsonSchema self = new ModelParametersResponseFormatJsonSchema();
            return TeaModel.build(map, self);
        }

        public ModelParametersResponseFormatJsonSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModelParametersResponseFormatJsonSchema setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ModelParametersResponseFormatJsonSchema setStrict(Boolean strict) {
            this.strict = strict;
            return this;
        }
        public Boolean getStrict() {
            return this.strict;
        }

    }

    public static class ModelParametersResponseFormat extends TeaModel {
        /**
         * <p>The JSON Schema constraint, which is required when the type is json_schema.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;answer&quot;,&quot;strict&quot;:true,&quot;schema&quot;:&quot;{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;answer\&quot;:{\&quot;type\&quot;:\&quot;string\&quot;}},\&quot;required\&quot;:[\&quot;answer\&quot;]}&quot;}</p>
         */
        @NameInMap("jsonSchema")
        public ModelParametersResponseFormatJsonSchema jsonSchema;

        /**
         * <p>The format type. Valid values: text, json_object, and json_schema. When using json_object, the prompt must explicitly request JSON output.</p>
         * 
         * <strong>example:</strong>
         * <p>json_object</p>
         */
        @NameInMap("type")
        public String type;

        public static ModelParametersResponseFormat build(java.util.Map<String, ?> map) throws Exception {
            ModelParametersResponseFormat self = new ModelParametersResponseFormat();
            return TeaModel.build(map, self);
        }

        public ModelParametersResponseFormat setJsonSchema(ModelParametersResponseFormatJsonSchema jsonSchema) {
            this.jsonSchema = jsonSchema;
            return this;
        }
        public ModelParametersResponseFormatJsonSchema getJsonSchema() {
            return this.jsonSchema;
        }

        public ModelParametersResponseFormat setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
