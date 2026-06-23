// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunLibraryChatGenerationRequest extends TeaModel {
    /**
     * <p>A list of document IDs.</p>
     */
    @NameInMap("docIdList")
    public java.util.List<String> docIdList;

    /**
     * <p>Specifies whether to enable multi-turn enhancement.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableFollowUp")
    public Boolean enableFollowUp;

    /**
     * <p>Specifies whether to enable query splitting.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableMultiQuery")
    public Boolean enableMultiQuery;

    /**
     * <p>Specifies whether to enable openQA.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableOpenQa")
    public Boolean enableOpenQa;

    /**
     * <p>The Large Language Model (LLM) used for multi-turn query enhancement.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("followUpLlm")
    public String followUpLlm;

    /**
     * <p>The ID of the document library.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3akzl28vap</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>The type of the LLM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("llmType")
    public String llmType;

    /**
     * <p>The LLM used for query splitting.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("multiQueryLlm")
    public String multiQueryLlm;

    /**
     * <p>The query entered by the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>这两天北京气候怎么样</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The property filter.</p>
     */
    @NameInMap("queryCriteria")
    public RunLibraryChatGenerationRequestQueryCriteria queryCriteria;

    /**
     * <p>The type of the sort policy. Valid values: \<code>linear\\</code> and \<code>model\\</code>. \<code>linear\\</code>: rule-based sorting. \<code>model\\</code>: model-based sorting (LLM).</p>
     * 
     * <strong>example:</strong>
     * <p>linear</p>
     */
    @NameInMap("rerankType")
    public String rerankType;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Specifies whether to use streaming or non-streaming mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>A list of subqueries.</p>
     */
    @NameInMap("subQueryList")
    public java.util.List<String> subQueryList;

    /**
     * <p>Search engine parameters: text search parameters.</p>
     */
    @NameInMap("textSearchParameter")
    public RunLibraryChatGenerationRequestTextSearchParameter textSearchParameter;

    /**
     * <p>The final number of retrieved corpus entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topK")
    public Integer topK;

    /**
     * <p>Search engine parameters: vector search parameters.</p>
     */
    @NameInMap("vectorSearchParameter")
    public RunLibraryChatGenerationRequestVectorSearchParameter vectorSearchParameter;

    /**
     * <p>Specifies whether to return document references.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withDocumentReference")
    public Boolean withDocumentReference;

    public static RunLibraryChatGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunLibraryChatGenerationRequest self = new RunLibraryChatGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunLibraryChatGenerationRequest setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
    }

    public RunLibraryChatGenerationRequest setEnableFollowUp(Boolean enableFollowUp) {
        this.enableFollowUp = enableFollowUp;
        return this;
    }
    public Boolean getEnableFollowUp() {
        return this.enableFollowUp;
    }

    public RunLibraryChatGenerationRequest setEnableMultiQuery(Boolean enableMultiQuery) {
        this.enableMultiQuery = enableMultiQuery;
        return this;
    }
    public Boolean getEnableMultiQuery() {
        return this.enableMultiQuery;
    }

    public RunLibraryChatGenerationRequest setEnableOpenQa(Boolean enableOpenQa) {
        this.enableOpenQa = enableOpenQa;
        return this;
    }
    public Boolean getEnableOpenQa() {
        return this.enableOpenQa;
    }

    public RunLibraryChatGenerationRequest setFollowUpLlm(String followUpLlm) {
        this.followUpLlm = followUpLlm;
        return this;
    }
    public String getFollowUpLlm() {
        return this.followUpLlm;
    }

    public RunLibraryChatGenerationRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public RunLibraryChatGenerationRequest setLlmType(String llmType) {
        this.llmType = llmType;
        return this;
    }
    public String getLlmType() {
        return this.llmType;
    }

    public RunLibraryChatGenerationRequest setMultiQueryLlm(String multiQueryLlm) {
        this.multiQueryLlm = multiQueryLlm;
        return this;
    }
    public String getMultiQueryLlm() {
        return this.multiQueryLlm;
    }

    public RunLibraryChatGenerationRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RunLibraryChatGenerationRequest setQueryCriteria(RunLibraryChatGenerationRequestQueryCriteria queryCriteria) {
        this.queryCriteria = queryCriteria;
        return this;
    }
    public RunLibraryChatGenerationRequestQueryCriteria getQueryCriteria() {
        return this.queryCriteria;
    }

    public RunLibraryChatGenerationRequest setRerankType(String rerankType) {
        this.rerankType = rerankType;
        return this;
    }
    public String getRerankType() {
        return this.rerankType;
    }

    public RunLibraryChatGenerationRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunLibraryChatGenerationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunLibraryChatGenerationRequest setSubQueryList(java.util.List<String> subQueryList) {
        this.subQueryList = subQueryList;
        return this;
    }
    public java.util.List<String> getSubQueryList() {
        return this.subQueryList;
    }

    public RunLibraryChatGenerationRequest setTextSearchParameter(RunLibraryChatGenerationRequestTextSearchParameter textSearchParameter) {
        this.textSearchParameter = textSearchParameter;
        return this;
    }
    public RunLibraryChatGenerationRequestTextSearchParameter getTextSearchParameter() {
        return this.textSearchParameter;
    }

    public RunLibraryChatGenerationRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public RunLibraryChatGenerationRequest setVectorSearchParameter(RunLibraryChatGenerationRequestVectorSearchParameter vectorSearchParameter) {
        this.vectorSearchParameter = vectorSearchParameter;
        return this;
    }
    public RunLibraryChatGenerationRequestVectorSearchParameter getVectorSearchParameter() {
        return this.vectorSearchParameter;
    }

    public RunLibraryChatGenerationRequest setWithDocumentReference(Boolean withDocumentReference) {
        this.withDocumentReference = withDocumentReference;
        return this;
    }
    public Boolean getWithDocumentReference() {
        return this.withDocumentReference;
    }

    public static class RunLibraryChatGenerationRequestQueryCriteriaAnd extends TeaModel {
        /**
         * <p>The weight of the tag. A value less than 1 decreases the weight of the corresponding keyword. A value greater than 1 increases the weight.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The operator for the tag. It specifies the relationship between the metadata key\&quot;s stored value and your input value.</p>
         * <ul>
         * <li><p>eq: Equal to.</p>
         * </li>
         * <li><p>lte: Less than or equal to.</p>
         * </li>
         * <li><p>gte: Greater than or equal to.</p>
         * </li>
         * <li><p>lt: Less than.</p>
         * </li>
         * <li><p>gt: Greater than.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("value")
        public String value;

        public static RunLibraryChatGenerationRequestQueryCriteriaAnd build(java.util.Map<String, ?> map) throws Exception {
            RunLibraryChatGenerationRequestQueryCriteriaAnd self = new RunLibraryChatGenerationRequestQueryCriteriaAnd();
            return TeaModel.build(map, self);
        }

        public RunLibraryChatGenerationRequestQueryCriteriaAnd setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaAnd setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaAnd setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaAnd setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RunLibraryChatGenerationRequestQueryCriteriaOr extends TeaModel {
        /**
         * <p>The weight of the tag. A value less than 1 decreases the weight of the corresponding keyword. A value greater than 1 increases the weight.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The operator for the tag. It specifies the relationship between the metadata key\&quot;s stored value and your input value.</p>
         * <ul>
         * <li><p>eq: Equal to.</p>
         * </li>
         * <li><p>lte: Less than or equal to.</p>
         * </li>
         * <li><p>gte: Greater than or equal to.</p>
         * </li>
         * <li><p>lt: Less than.</p>
         * </li>
         * <li><p>gt: Greater than.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("value")
        public String value;

        public static RunLibraryChatGenerationRequestQueryCriteriaOr build(java.util.Map<String, ?> map) throws Exception {
            RunLibraryChatGenerationRequestQueryCriteriaOr self = new RunLibraryChatGenerationRequestQueryCriteriaOr();
            return TeaModel.build(map, self);
        }

        public RunLibraryChatGenerationRequestQueryCriteriaOr setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaOr setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaOr setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RunLibraryChatGenerationRequestQueryCriteriaOr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RunLibraryChatGenerationRequestQueryCriteria extends TeaModel {
        /**
         * <p>The \<code>and\\</code> expression, used to filter documents or document chunks.</p>
         */
        @NameInMap("and")
        public java.util.List<RunLibraryChatGenerationRequestQueryCriteriaAnd> and;

        /**
         * <p>The \<code>or\\</code> expression, used to filter documents or document chunks.</p>
         */
        @NameInMap("or")
        public java.util.List<RunLibraryChatGenerationRequestQueryCriteriaOr> or;

        public static RunLibraryChatGenerationRequestQueryCriteria build(java.util.Map<String, ?> map) throws Exception {
            RunLibraryChatGenerationRequestQueryCriteria self = new RunLibraryChatGenerationRequestQueryCriteria();
            return TeaModel.build(map, self);
        }

        public RunLibraryChatGenerationRequestQueryCriteria setAnd(java.util.List<RunLibraryChatGenerationRequestQueryCriteriaAnd> and) {
            this.and = and;
            return this;
        }
        public java.util.List<RunLibraryChatGenerationRequestQueryCriteriaAnd> getAnd() {
            return this.and;
        }

        public RunLibraryChatGenerationRequestQueryCriteria setOr(java.util.List<RunLibraryChatGenerationRequestQueryCriteriaOr> or) {
            this.or = or;
            return this;
        }
        public java.util.List<RunLibraryChatGenerationRequestQueryCriteriaOr> getOr() {
            return this.or;
        }

    }

    public static class RunLibraryChatGenerationRequestTextSearchParameter extends TeaModel {
        /**
         * <p>The number of rows to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("limit")
        public Integer limit;

        /**
         * <p>The search tokenizer. Valid values: \<code>Standard\\</code>, \<code>IkMaxWord\\</code>, and \<code>IkSmart\\</code>. Configure this parameter as needed. If left empty, the tokenizer attached to the document library is used.</p>
         * 
         * <strong>example:</strong>
         * <p>IkMaxWord</p>
         */
        @NameInMap("searchAnalyzerType")
        public String searchAnalyzerType;

        public static RunLibraryChatGenerationRequestTextSearchParameter build(java.util.Map<String, ?> map) throws Exception {
            RunLibraryChatGenerationRequestTextSearchParameter self = new RunLibraryChatGenerationRequestTextSearchParameter();
            return TeaModel.build(map, self);
        }

        public RunLibraryChatGenerationRequestTextSearchParameter setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public RunLibraryChatGenerationRequestTextSearchParameter setSearchAnalyzerType(String searchAnalyzerType) {
            this.searchAnalyzerType = searchAnalyzerType;
            return this;
        }
        public String getSearchAnalyzerType() {
            return this.searchAnalyzerType;
        }

    }

    public static class RunLibraryChatGenerationRequestVectorSearchParameter extends TeaModel {
        /**
         * <p>The number of rows to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("limit")
        public Integer limit;

        public static RunLibraryChatGenerationRequestVectorSearchParameter build(java.util.Map<String, ?> map) throws Exception {
            RunLibraryChatGenerationRequestVectorSearchParameter self = new RunLibraryChatGenerationRequestVectorSearchParameter();
            return TeaModel.build(map, self);
        }

        public RunLibraryChatGenerationRequestVectorSearchParameter setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

    }

}
