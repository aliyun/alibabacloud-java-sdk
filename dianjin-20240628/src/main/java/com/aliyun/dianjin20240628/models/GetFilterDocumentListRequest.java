// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetFilterDocumentListRequest extends TeaModel {
    @NameInMap("and")
    public java.util.List<GetFilterDocumentListRequestAnd> and;

    @NameInMap("docIdList")
    public java.util.List<String> docIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cjshcxxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    @NameInMap("or")
    public java.util.List<GetFilterDocumentListRequestOr> or;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("boost")
        public Float boost;

        /**
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
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
