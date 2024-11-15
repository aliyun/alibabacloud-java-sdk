// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryAnswerSampleByPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<QueryAnswerSampleByPageResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAnswerSampleByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAnswerSampleByPageResponseBody self = new QueryAnswerSampleByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAnswerSampleByPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryAnswerSampleByPageResponseBody setItems(java.util.List<QueryAnswerSampleByPageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QueryAnswerSampleByPageResponseBodyItems> getItems() {
        return this.items;
    }

    public QueryAnswerSampleByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAnswerSampleByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAnswerSampleByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAnswerSampleByPageResponseBodyItems extends TeaModel {
        @NameInMap("Answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>2023-07-31 06:16:06</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1666</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>104813*****2399</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static QueryAnswerSampleByPageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAnswerSampleByPageResponseBodyItems self = new QueryAnswerSampleByPageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryAnswerSampleByPageResponseBodyItems setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public QueryAnswerSampleByPageResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAnswerSampleByPageResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAnswerSampleByPageResponseBodyItems setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public QueryAnswerSampleByPageResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
