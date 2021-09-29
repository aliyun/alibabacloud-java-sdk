// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewJobOrderResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Data")
    public NewJobOrderResponseBodyData data;

    public static NewJobOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NewJobOrderResponseBody self = new NewJobOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public NewJobOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NewJobOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NewJobOrderResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public NewJobOrderResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public NewJobOrderResponseBody setData(NewJobOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public NewJobOrderResponseBodyData getData() {
        return this.data;
    }

    public static class NewJobOrderResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

        public static NewJobOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NewJobOrderResponseBodyData self = new NewJobOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NewJobOrderResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
