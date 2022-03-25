// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderAssignedScanISVResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public java.util.Map<String, ?> resultObj;

    @NameInMap("Success")
    public Boolean success;

    public static OrderAssignedScanISVResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderAssignedScanISVResponseBody self = new OrderAssignedScanISVResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderAssignedScanISVResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderAssignedScanISVResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OrderAssignedScanISVResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderAssignedScanISVResponseBody setResultObj(java.util.Map<String, ?> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.Map<String, ?> getResultObj() {
        return this.resultObj;
    }

    public OrderAssignedScanISVResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
