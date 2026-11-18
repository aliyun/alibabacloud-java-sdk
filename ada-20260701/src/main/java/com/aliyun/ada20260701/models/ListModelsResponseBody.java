// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results used for this pagination. If not paginated, it is the total number of results. It is not the actual number of entries returned on this page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The array of model structures. For nested fields, refer to the supplementary description of response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Id&quot;:&quot;text-model-example&quot;,&quot;Object&quot;:&quot;model&quot;,&quot;Created&quot;:1793491200,&quot;OwnedBy&quot;:&quot;provider-example&quot;,&quot;DisplayName&quot;:&quot;Sample text model&quot;,&quot;Capabilities&quot;:{&quot;InputModalities&quot;:[&quot;text&quot;]},&quot;CreditsCoefficient&quot;:&quot;2.5&quot;,&quot;ThinkingLevels&quot;:[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;],&quot;ThinkingLevel&quot;:&quot;off&quot;}]</p>
     */
    @NameInMap("Models")
    public java.util.List<ListModelsResponseBodyModels> models;

    /**
     * <p>The token for the next page. An empty value indicates that there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request. It is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of models that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsResponseBody setModels(java.util.List<ListModelsResponseBodyModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ListModelsResponseBodyModels> getModels() {
        return this.models;
    }

    public ListModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListModelsResponseBodyModelsCapabilities extends TeaModel {
        /**
         * <p>The supported input modalities. For text sessions, select a model that includes text.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;text&quot;]</p>
         */
        @NameInMap("InputModalities")
        public java.util.List<String> inputModalities;

        public static ListModelsResponseBodyModelsCapabilities build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModelsCapabilities self = new ListModelsResponseBodyModelsCapabilities();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModelsCapabilities setInputModalities(java.util.List<String> inputModalities) {
            this.inputModalities = inputModalities;
            return this;
        }
        public java.util.List<String> getInputModalities() {
            return this.inputModalities;
        }

    }

    public static class ListModelsResponseBodyModels extends TeaModel {
        /**
         * <p>The model capabilities structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InputModalities&quot;:[&quot;text&quot;]}</p>
         */
        @NameInMap("Capabilities")
        public ListModelsResponseBodyModelsCapabilities capabilities;

        /**
         * <p><strong>[Deprecated]</strong> The legacy compatibility field. It is no longer returned. Do not use it as a dependency for integration.</p>
         * 
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("ContextWindow")
        @Deprecated
        public Long contextWindow;

        /**
         * <p>The time when the model was created. It is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1793491200</p>
         */
        @NameInMap("Created")
        public Long created;

        /**
         * <p>The credit coefficient of the model, returned as a decimal string. Not returned if not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("CreditsCoefficient")
        public String creditsCoefficient;

        /**
         * <p>The display name of the model. Do not pass it as the model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample text model</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The model identifier. Used as Params.modelId for SetAgentSessionModel. Use the actual returned value.</p>
         * 
         * <strong>example:</strong>
         * <p>text-model-example</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p><strong>[Deprecated]</strong> The legacy compatibility field. It is no longer returned. Do not use it as a dependency for integration.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("MaxContextWindow")
        @Deprecated
        public Long maxContextWindow;

        /**
         * <p>The object type. Fixed to model.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The identifier of the model provider.</p>
         * 
         * <strong>example:</strong>
         * <p>provider-example</p>
         */
        @NameInMap("OwnedBy")
        public String ownedBy;

        /**
         * <p><strong>[Deprecated]</strong> The legacy compatibility field. It is no longer returned. Use ThinkingLevels instead.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportsThinking")
        @Deprecated
        public Integer supportsThinking;

        /**
         * <p>The default thinking level in the model catalog. It does not represent the current value of the session. Query the current value by using GetAgentSessionModel.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ThinkingLevel")
        public String thinkingLevel;

        /**
         * <p>The thinking levels supported by the model. An empty array does not mean all levels are supported. The target session still needs to be verified.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;]</p>
         */
        @NameInMap("ThinkingLevels")
        public java.util.List<String> thinkingLevels;

        /**
         * <p><strong>[Deprecated]</strong> The legacy compatibility field. It is no longer returned. Use ThinkingLevel instead.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ThinkingMode")
        @Deprecated
        public Integer thinkingMode;

        public static ListModelsResponseBodyModels build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyModels self = new ListModelsResponseBodyModels();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyModels setCapabilities(ListModelsResponseBodyModelsCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public ListModelsResponseBodyModelsCapabilities getCapabilities() {
            return this.capabilities;
        }

        @Deprecated
        public ListModelsResponseBodyModels setContextWindow(Long contextWindow) {
            this.contextWindow = contextWindow;
            return this;
        }
        public Long getContextWindow() {
            return this.contextWindow;
        }

        public ListModelsResponseBodyModels setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListModelsResponseBodyModels setCreditsCoefficient(String creditsCoefficient) {
            this.creditsCoefficient = creditsCoefficient;
            return this;
        }
        public String getCreditsCoefficient() {
            return this.creditsCoefficient;
        }

        public ListModelsResponseBodyModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListModelsResponseBodyModels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        @Deprecated
        public ListModelsResponseBodyModels setMaxContextWindow(Long maxContextWindow) {
            this.maxContextWindow = maxContextWindow;
            return this;
        }
        public Long getMaxContextWindow() {
            return this.maxContextWindow;
        }

        public ListModelsResponseBodyModels setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ListModelsResponseBodyModels setOwnedBy(String ownedBy) {
            this.ownedBy = ownedBy;
            return this;
        }
        public String getOwnedBy() {
            return this.ownedBy;
        }

        @Deprecated
        public ListModelsResponseBodyModels setSupportsThinking(Integer supportsThinking) {
            this.supportsThinking = supportsThinking;
            return this;
        }
        public Integer getSupportsThinking() {
            return this.supportsThinking;
        }

        public ListModelsResponseBodyModels setThinkingLevel(String thinkingLevel) {
            this.thinkingLevel = thinkingLevel;
            return this;
        }
        public String getThinkingLevel() {
            return this.thinkingLevel;
        }

        public ListModelsResponseBodyModels setThinkingLevels(java.util.List<String> thinkingLevels) {
            this.thinkingLevels = thinkingLevels;
            return this;
        }
        public java.util.List<String> getThinkingLevels() {
            return this.thinkingLevels;
        }

        @Deprecated
        public ListModelsResponseBodyModels setThinkingMode(Integer thinkingMode) {
            this.thinkingMode = thinkingMode;
            return this;
        }
        public Integer getThinkingMode() {
            return this.thinkingMode;
        }

    }

}
