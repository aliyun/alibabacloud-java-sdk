// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryBizLogByOpTypeAndTimeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public java.util.List<java.util.Map<String, ?>> resultObj;

    @NameInMap("Success")
    public String success;

    public static QueryBizLogByOpTypeAndTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBizLogByOpTypeAndTimeResponseBody self = new QueryBizLogByOpTypeAndTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBizLogByOpTypeAndTimeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryBizLogByOpTypeAndTimeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryBizLogByOpTypeAndTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBizLogByOpTypeAndTimeResponseBody setResultObj(java.util.List<java.util.Map<String, ?>> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResultObj() {
        return this.resultObj;
    }

    public QueryBizLogByOpTypeAndTimeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
