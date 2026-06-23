// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetFilterDocumentListRequest extends TeaModel {
    /**
     * <p>AND expression to filter documents or document chunks.</p>
     */
    @NameInMap("and")
    public java.util.List<GetFilterDocumentListRequestAnd> and;

    /**
     * <p>List of document IDs to filter documents or document chunks.</p>
     */
    @NameInMap("docIdList")
    public java.util.List<String> docIdList;

    /**
     * <p>Document library ID to filter documents or document chunks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cjshcxxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>OR expression to filter documents or document chunks.</p>
     */
    @NameInMap("or")
    public java.util.List<GetFilterDocumentListRequestOr> or;

    /**
     * <p>Page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Number of records per page for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>List of document statuses to filter documents.</p>
     * <h3>Document parsing status codes</h3>
     * <p><em>Status codes: WaitRefresh, InQueue, FetchingData, Embedding, Completed, FormatError, Error</em></p>
     * <ul>
     * <li><p>Completed: Active. Document parsing completed.</p>
     * </li>
     * <li><p>Error: Inactive. Document parsing failed.</p>
     * </li>
     * <li><p>FormatError: File format error. Re-upload the file in the correct format if it is encrypted or incomplete.</p>
     * </li>
     * <li><p>InQueue: Pending. Document is waiting for parsing.</p>
     * </li>
     * <li><p>Parsed: Parsing completed.</p>
     * </li>
     * <li><p>Other statuses are internal system states. For example, WaitRefresh means the task is scheduled. FetchingData means parsing is in progress. Embedding means index building is in progress.</p>
     * </li>
     * </ul>
     */
    @NameInMap("status")
    public java.util.List<String> status;

    public static GetFilterDocumentListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFilterDocumentListRequest self = new GetFilterDocumentListRequest();
        return TeaModel.build(map, self);
    }

    public GetFilterDocumentListRequest setAnd(java.util.List<GetFilterDocumentListRequestAnd> and) {
        this.and = and;
        return this;
    }
    public java.util.List<GetFilterDocumentListRequestAnd> getAnd() {
        return this.and;
    }

    public GetFilterDocumentListRequest setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
    }

    public GetFilterDocumentListRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetFilterDocumentListRequest setOr(java.util.List<GetFilterDocumentListRequestOr> or) {
        this.or = or;
        return this;
    }
    public java.util.List<GetFilterDocumentListRequestOr> getOr() {
        return this.or;
    }

    public GetFilterDocumentListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetFilterDocumentListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFilterDocumentListRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public static class GetFilterDocumentListRequestAnd extends TeaModel {
        /**
         * <p>Weight of the value in the text retrieval engine. Default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>Metadata key in the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <h3>Relationship between the stored metadata value and your input value</h3>
         * <ul>
         * <li><p>eq: The stored metadata value equals your input value.</p>
         * </li>
         * <li><p>contains: The stored metadata value list contains your input value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Input metadata value.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("value")
        public String value;

        public static GetFilterDocumentListRequestAnd build(java.util.Map<String, ?> map) throws Exception {
            GetFilterDocumentListRequestAnd self = new GetFilterDocumentListRequestAnd();
            return TeaModel.build(map, self);
        }

        public GetFilterDocumentListRequestAnd setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public GetFilterDocumentListRequestAnd setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFilterDocumentListRequestAnd setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetFilterDocumentListRequestAnd setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFilterDocumentListRequestOr extends TeaModel {
        /**
         * <p>Weight of the value in the text retrieval engine. Default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <p>Metadata key in the document library.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <h3>Relationship between the stored metadata value and your input value</h3>
         * <ul>
         * <li><p>eq: The stored metadata value equals your input value.</p>
         * </li>
         * <li><p>contains: The stored metadata value list contains your input value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>Input metadata value.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("value")
        public String value;

        public static GetFilterDocumentListRequestOr build(java.util.Map<String, ?> map) throws Exception {
            GetFilterDocumentListRequestOr self = new GetFilterDocumentListRequestOr();
            return TeaModel.build(map, self);
        }

        public GetFilterDocumentListRequestOr setBoost(Float boost) {
            this.boost = boost;
            return this;
        }
        public Float getBoost() {
            return this.boost;
        }

        public GetFilterDocumentListRequestOr setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetFilterDocumentListRequestOr setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetFilterDocumentListRequestOr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
