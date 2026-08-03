// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class CreateAndPayResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAndPayResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CreateOrderFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>创建订单失败</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static CreateAndPayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPayResponseBody self = new CreateAndPayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndPayResponseBody setData(CreateAndPayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAndPayResponseBodyData getData() {
        return this.data;
    }

    public CreateAndPayResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAndPayResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateAndPayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAndPayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAndPayResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class CreateAndPayResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SO202606290001</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        /**
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static CreateAndPayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAndPayResponseBodyData self = new CreateAndPayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAndPayResponseBodyData setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public CreateAndPayResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
