// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderBatchCreateResponseBody extends TeaModel {
    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // resultObj
    @NameInMap("ResultObj")
    public java.util.Map<String, ?> resultObj;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static OrderBatchCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderBatchCreateResponseBody self = new OrderBatchCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderBatchCreateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderBatchCreateResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OrderBatchCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderBatchCreateResponseBody setResultObj(java.util.Map<String, ?> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.Map<String, ?> getResultObj() {
        return this.resultObj;
    }

    public OrderBatchCreateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
