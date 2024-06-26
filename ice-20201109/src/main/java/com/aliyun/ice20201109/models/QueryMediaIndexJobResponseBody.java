// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaIndexJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("IndexJobInfoList")
    public java.util.List<QueryMediaIndexJobResponseBodyIndexJobInfoList> indexJobInfoList;

    /**
     * <strong>example:</strong>
     * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QueryMediaIndexJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaIndexJobResponseBody self = new QueryMediaIndexJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaIndexJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMediaIndexJobResponseBody setIndexJobInfoList(java.util.List<QueryMediaIndexJobResponseBodyIndexJobInfoList> indexJobInfoList) {
        this.indexJobInfoList = indexJobInfoList;
        return this;
    }
    public java.util.List<QueryMediaIndexJobResponseBodyIndexJobInfoList> getIndexJobInfoList() {
        return this.indexJobInfoList;
    }

    public QueryMediaIndexJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaIndexJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryMediaIndexJobResponseBodyIndexJobInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-11-21 11:33:51</p>
         */
        @NameInMap("GmtFinish")
        public String gmtFinish;

        /**
         * <strong>example:</strong>
         * <p>2023-11-21 11:33:50</p>
         */
        @NameInMap("GmtSubmit")
        public String gmtSubmit;

        /**
         * <strong>example:</strong>
         * <p>mm</p>
         */
        @NameInMap("IndexType")
        public String indexType;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryMediaIndexJobResponseBodyIndexJobInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaIndexJobResponseBodyIndexJobInfoList self = new QueryMediaIndexJobResponseBodyIndexJobInfoList();
            return TeaModel.build(map, self);
        }

        public QueryMediaIndexJobResponseBodyIndexJobInfoList setGmtFinish(String gmtFinish) {
            this.gmtFinish = gmtFinish;
            return this;
        }
        public String getGmtFinish() {
            return this.gmtFinish;
        }

        public QueryMediaIndexJobResponseBodyIndexJobInfoList setGmtSubmit(String gmtSubmit) {
            this.gmtSubmit = gmtSubmit;
            return this;
        }
        public String getGmtSubmit() {
            return this.gmtSubmit;
        }

        public QueryMediaIndexJobResponseBodyIndexJobInfoList setIndexType(String indexType) {
            this.indexType = indexType;
            return this;
        }
        public String getIndexType() {
            return this.indexType;
        }

        public QueryMediaIndexJobResponseBodyIndexJobInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
