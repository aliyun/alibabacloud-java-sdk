// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryOneKeyDeleteBlockListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryOneKeyDeleteBlockListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOneKeyDeleteBlockListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOneKeyDeleteBlockListResponseBody self = new QueryOneKeyDeleteBlockListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOneKeyDeleteBlockListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOneKeyDeleteBlockListResponseBody setData(java.util.List<QueryOneKeyDeleteBlockListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOneKeyDeleteBlockListResponseBodyData> getData() {
        return this.data;
    }

    public QueryOneKeyDeleteBlockListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOneKeyDeleteBlockListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOneKeyDeleteBlockListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOneKeyDeleteBlockListResponseBodyData extends TeaModel {
        @NameInMap("BlockCode")
        public String blockCode;

        @NameInMap("BlockMsg")
        public String blockMsg;

        public static QueryOneKeyDeleteBlockListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOneKeyDeleteBlockListResponseBodyData self = new QueryOneKeyDeleteBlockListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOneKeyDeleteBlockListResponseBodyData setBlockCode(String blockCode) {
            this.blockCode = blockCode;
            return this;
        }
        public String getBlockCode() {
            return this.blockCode;
        }

        public QueryOneKeyDeleteBlockListResponseBodyData setBlockMsg(String blockMsg) {
            this.blockMsg = blockMsg;
            return this;
        }
        public String getBlockMsg() {
            return this.blockMsg;
        }

    }

}
