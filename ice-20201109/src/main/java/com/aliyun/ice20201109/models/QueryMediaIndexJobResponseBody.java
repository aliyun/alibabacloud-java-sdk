// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaIndexJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IndexJobInfoList")
    public java.util.List<QueryMediaIndexJobResponseBodyIndexJobInfoList> indexJobInfoList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("GmtFinish")
        public String gmtFinish;

        @NameInMap("GmtSubmit")
        public String gmtSubmit;

        @NameInMap("IndexType")
        public String indexType;

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
