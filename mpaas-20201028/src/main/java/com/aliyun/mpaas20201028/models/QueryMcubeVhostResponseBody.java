// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMcubeVhostResponseBody extends TeaModel {
    @NameInMap("QueryVhostResult")
    public QueryMcubeVhostResponseBodyQueryVhostResult queryVhostResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMcubeVhostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeVhostResponseBody self = new QueryMcubeVhostResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcubeVhostResponseBody setQueryVhostResult(QueryMcubeVhostResponseBodyQueryVhostResult queryVhostResult) {
        this.queryVhostResult = queryVhostResult;
        return this;
    }
    public QueryMcubeVhostResponseBodyQueryVhostResult getQueryVhostResult() {
        return this.queryVhostResult;
    }

    public QueryMcubeVhostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMcubeVhostResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcubeVhostResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMcubeVhostResponseBodyQueryVhostResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static QueryMcubeVhostResponseBodyQueryVhostResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcubeVhostResponseBodyQueryVhostResult self = new QueryMcubeVhostResponseBodyQueryVhostResult();
            return TeaModel.build(map, self);
        }

        public QueryMcubeVhostResponseBodyQueryVhostResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMcubeVhostResponseBodyQueryVhostResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public QueryMcubeVhostResponseBodyQueryVhostResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
