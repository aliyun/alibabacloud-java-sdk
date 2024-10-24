// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QuerySessionInfoResponseBody extends TeaModel {
    @NameInMap("queryResourceInfoList")
    public java.util.List<QuerySessionInfoResponseBodyQueryResourceInfoList> queryResourceInfoList;

    /**
     * <strong>example:</strong>
     * <p>4D902811-B75C-5D1B-8882-D515F8E2F977</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("total")
    public Long total;

    public static QuerySessionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionInfoResponseBody self = new QuerySessionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionInfoResponseBody setQueryResourceInfoList(java.util.List<QuerySessionInfoResponseBodyQueryResourceInfoList> queryResourceInfoList) {
        this.queryResourceInfoList = queryResourceInfoList;
        return this;
    }
    public java.util.List<QuerySessionInfoResponseBodyQueryResourceInfoList> getQueryResourceInfoList() {
        return this.queryResourceInfoList;
    }

    public QuerySessionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySessionInfoResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QuerySessionInfoResponseBodyQueryResourceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a169e9ec18404edc9972afd80866dc97</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("status")
        public String status;

        public static QuerySessionInfoResponseBodyQueryResourceInfoList build(java.util.Map<String, ?> map) throws Exception {
            QuerySessionInfoResponseBodyQueryResourceInfoList self = new QuerySessionInfoResponseBodyQueryResourceInfoList();
            return TeaModel.build(map, self);
        }

        public QuerySessionInfoResponseBodyQueryResourceInfoList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public QuerySessionInfoResponseBodyQueryResourceInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
