// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunLibraryChatGenerationRequest extends TeaModel {
    @NameInMap("docIdList")
    public java.util.List<String> docIdList;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableFollowUp")
    public Boolean enableFollowUp;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableMultiQuery")
    public Boolean enableMultiQuery;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableOpenQa")
    public Boolean enableOpenQa;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("followUpLlm")
    public String followUpLlm;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3akzl28vap</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("llmType")
    public String llmType;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("multiQueryLlm")
    public String multiQueryLlm;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("queryCriteria")
    public RunLibraryChatGenerationRequestQueryCriteria queryCriteria;

    /**
     * <strong>example:</strong>
     * <p>linear</p>
     */
    @NameInMap("rerankType")
    public String rerankType;

    /**
     * <p>sessionId</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("subQueryList")
    public java.util.List<String> subQueryList;

    @NameInMap("textSearchParameter")
    public RunLibraryChatGenerationRequestTextSearchParameter textSearchParameter;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("topK")
    public Integer topK;

    @NameInMap("vectorSearchParameter")
    public RunLibraryChatGenerationRequestVectorSearchParameter vectorSearchParameter;

    /**
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
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

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
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

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
        @NameInMap("and")
        public java.util.List<RunLibraryChatGenerationRequestQueryCriteriaAnd> and;

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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("limit")
        public Integer limit;

        /**
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
