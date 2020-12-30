// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOrderResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryCdpOrderResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static QueryCdpOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOrderResponseBody self = new QueryCdpOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCdpOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCdpOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCdpOrderResponseBody setData(QueryCdpOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCdpOrderResponseBodyData getData() {
        return this.data;
    }

    public QueryCdpOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCdpOrderResponseBodyData extends TeaModel {
        @NameInMap("ExtendParam")
        public String extendParam;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("ResultMsg")
        public String resultMsg;

        public static QueryCdpOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCdpOrderResponseBodyData self = new QueryCdpOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCdpOrderResponseBodyData setExtendParam(String extendParam) {
            this.extendParam = extendParam;
            return this;
        }
        public String getExtendParam() {
            return this.extendParam;
        }

        public QueryCdpOrderResponseBodyData setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public QueryCdpOrderResponseBodyData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

    }

}
