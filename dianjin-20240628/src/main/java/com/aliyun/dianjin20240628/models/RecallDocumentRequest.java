// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecallDocumentRequest extends TeaModel {
    /**
     * <p>Metadata filter conditions.</p>
     */
    @NameInMap("filters")
    public java.util.List<RecallDocumentRequestFilters> filters;

    /**
     * <p>Text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>欧洲杯历史上有哪些球队因为球员的适应新文化而受益</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Enable parent-child document chunk retrieval.</p>
     * <ul>
     * <li>Parent-child document chunks: During document parsing, a complete semantic block, such as a paragraph or a section, might split into multiple document chunks. This depends on your chunking strategy. When you enable parent-child document retrieval, the system attempts to complete the semantic block of the retrieved document chunk. This makes the corpus more semantically complete when constructing prompts, improving answer completeness and accuracy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("rearrangement")
    public Boolean rearrangement;

    /**
     * <p>The number of document chunks to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("topK")
    public Integer topK;

    public static RecallDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        RecallDocumentRequest self = new RecallDocumentRequest();
        return TeaModel.build(map, self);
    }

    public RecallDocumentRequest setFilters(java.util.List<RecallDocumentRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<RecallDocumentRequestFilters> getFilters() {
        return this.filters;
    }

    public RecallDocumentRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RecallDocumentRequest setRearrangement(Boolean rearrangement) {
        this.rearrangement = rearrangement;
        return this;
    }
    public Boolean getRearrangement() {
        return this.rearrangement;
    }

    public RecallDocumentRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

    public static class RecallDocumentRequestFiltersAnd extends TeaModel {
        /**
         * <p>Keyword weight.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>The key of the metadata in the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>docType</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The relationship between the value stored in the document library metadata key and the value you enter.</p>
         * <ul>
         * <li><p>eq: The value stored in the document library metadata key equals the value you enter.</p>
         * </li>
         * <li><p>lte: The value stored in the document library metadata key is less than or equal to the value you enter.</p>
         * </li>
         * <li><p>gte: The value stored in the document library metadata key is greater than or equal to the value you enter.</p>
         * </li>
         * <li><p>lt: The value stored in the document library metadata key is less than the value you enter.</p>
         * </li>
         * <li><p>gt: The value stored in the document library metadata key is greater than the value you enter.</p>
         * </li>
         * <li><p>contains: The list of values stored in the document library metadata key contains the value you enter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value of the metadata you enter.</p>
         * 
         * <strong>example:</strong>
         * <p>策略报告</p>
         */
        @NameInMap("value")
        public String value;

        public static RecallDocumentRequestFiltersAnd build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentRequestFiltersAnd self = new RecallDocumentRequestFiltersAnd();
            return TeaModel.build(map, self);
        }

        public RecallDocumentRequestFiltersAnd setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public RecallDocumentRequestFiltersAnd setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RecallDocumentRequestFiltersAnd setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RecallDocumentRequestFiltersAnd setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecallDocumentRequestFiltersOr extends TeaModel {
        /**
         * <p>Keyword weight.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>The key of the metadata in the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>researcher</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The relationship between the value stored in the document library metadata key and the value you enter.</p>
         * <ul>
         * <li><p>eq: The value stored in the document library metadata key equals the value you enter.</p>
         * </li>
         * <li><p>lte: The value stored in the document library metadata key is less than or equal to the value you enter.</p>
         * </li>
         * <li><p>gte: The value stored in the document library metadata key is greater than or equal to the value you enter.</p>
         * </li>
         * <li><p>lt: The value stored in the document library metadata key is less than the value you enter.</p>
         * </li>
         * <li><p>gt: The value stored in the document library metadata key is greater than the value you enter.</p>
         * </li>
         * <li><p>contains: The list of values stored in the document library metadata key contains the value you enter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The value of the metadata you enter.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("value")
        public String value;

        public static RecallDocumentRequestFiltersOr build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentRequestFiltersOr self = new RecallDocumentRequestFiltersOr();
            return TeaModel.build(map, self);
        }

        public RecallDocumentRequestFiltersOr setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public RecallDocumentRequestFiltersOr setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RecallDocumentRequestFiltersOr setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public RecallDocumentRequestFiltersOr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RecallDocumentRequestFilters extends TeaModel {
        /**
         * <p>AND expression, used to filter documents/document chunks.</p>
         */
        @NameInMap("and")
        public java.util.List<RecallDocumentRequestFiltersAnd> and;

        /**
         * <p>Document chunk type, used to filter document chunks, such as: Text, Graph, Table, FAQ.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("chunkType")
        public String chunkType;

        /**
         * <p>Document ID list, used to filter documents/document chunks.</p>
         */
        @NameInMap("docIdList")
        public java.util.List<String> docIdList;

        /**
         * <p>Document library ID, used to filter documents/document chunks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdbjhvs</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <p>OR expression, used to filter documents/document chunks.</p>
         */
        @NameInMap("or")
        public java.util.List<RecallDocumentRequestFiltersOr> or;

        /**
         * <p>Document status list, used to filter documents.</p>
         */
        @NameInMap("status")
        public java.util.List<String> status;

        public static RecallDocumentRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            RecallDocumentRequestFilters self = new RecallDocumentRequestFilters();
            return TeaModel.build(map, self);
        }

        public RecallDocumentRequestFilters setAnd(java.util.List<RecallDocumentRequestFiltersAnd> and) {
            this.and = and;
            return this;
        }
        public java.util.List<RecallDocumentRequestFiltersAnd> getAnd() {
            return this.and;
        }

        public RecallDocumentRequestFilters setChunkType(String chunkType) {
            this.chunkType = chunkType;
            return this;
        }
        public String getChunkType() {
            return this.chunkType;
        }

        public RecallDocumentRequestFilters setDocIdList(java.util.List<String> docIdList) {
            this.docIdList = docIdList;
            return this;
        }
        public java.util.List<String> getDocIdList() {
            return this.docIdList;
        }

        public RecallDocumentRequestFilters setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public RecallDocumentRequestFilters setOr(java.util.List<RecallDocumentRequestFiltersOr> or) {
            this.or = or;
            return this;
        }
        public java.util.List<RecallDocumentRequestFiltersOr> getOr() {
            return this.or;
        }

        public RecallDocumentRequestFilters setStatus(java.util.List<String> status) {
            this.status = status;
            return this;
        }
        public java.util.List<String> getStatus() {
            return this.status;
        }

    }

}
