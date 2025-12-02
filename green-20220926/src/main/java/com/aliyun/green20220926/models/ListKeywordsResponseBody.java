// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordsResponseBody extends TeaModel {
    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public ListKeywordsResponseBodyData data;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success flag.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordsResponseBody self = new ListKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeywordsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListKeywordsResponseBody setData(ListKeywordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKeywordsResponseBodyData getData() {
        return this.data;
    }

    public ListKeywordsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeywordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKeywordsResponseBodyDataItems extends TeaModel {
        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-03 14:43:03</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-03 14:43:03</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Keyword library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        @NameInMap("KeywordLibId")
        public String keywordLibId;

        /**
         * <p>Keyword data ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4205334</p>
         */
        @NameInMap("KeywordMd5Id")
        public Long keywordMd5Id;

        /**
         * <p>Keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>测试词</p>
         */
        @NameInMap("Word")
        public String word;

        public static ListKeywordsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListKeywordsResponseBodyDataItems self = new ListKeywordsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListKeywordsResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListKeywordsResponseBodyDataItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListKeywordsResponseBodyDataItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListKeywordsResponseBodyDataItems setKeywordLibId(String keywordLibId) {
            this.keywordLibId = keywordLibId;
            return this;
        }
        public String getKeywordLibId() {
            return this.keywordLibId;
        }

        public ListKeywordsResponseBodyDataItems setKeywordMd5Id(Long keywordMd5Id) {
            this.keywordMd5Id = keywordMd5Id;
            return this;
        }
        public Long getKeywordMd5Id() {
            return this.keywordMd5Id;
        }

        public ListKeywordsResponseBodyDataItems setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class ListKeywordsResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Data of the current page.</p>
         */
        @NameInMap("Items")
        public java.util.List<ListKeywordsResponseBodyDataItems> items;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListKeywordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKeywordsResponseBodyData self = new ListKeywordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKeywordsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListKeywordsResponseBodyData setItems(java.util.List<ListKeywordsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListKeywordsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListKeywordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListKeywordsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
