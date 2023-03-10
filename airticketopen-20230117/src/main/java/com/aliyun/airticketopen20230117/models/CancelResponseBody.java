// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CancelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public CancelResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static CancelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelResponseBody self = new CancelResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelResponseBody setData(CancelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelResponseBodyData getData() {
        return this.data;
    }

    public CancelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CancelResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public CancelResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CancelResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CancelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelResponseBodyData extends TeaModel {
        @NameInMap("order_num")
        public Long orderNum;

        public static CancelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelResponseBodyData self = new CancelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

}
