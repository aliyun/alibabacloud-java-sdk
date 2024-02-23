// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetHotlineQualificationByOrderResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetHotlineQualificationByOrderResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHotlineQualificationByOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineQualificationByOrderResponseBody self = new GetHotlineQualificationByOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineQualificationByOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineQualificationByOrderResponseBody setData(GetHotlineQualificationByOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineQualificationByOrderResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineQualificationByOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineQualificationByOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHotlineQualificationByOrderResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the qualification application ticket.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The qualification ID.</p>
         */
        @NameInMap("QualificationId")
        public String qualificationId;

        /**
         * <p>The qualification state. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**</p>
         * <p>*   **OTHER**</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetHotlineQualificationByOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineQualificationByOrderResponseBodyData self = new GetHotlineQualificationByOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineQualificationByOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetHotlineQualificationByOrderResponseBodyData setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public GetHotlineQualificationByOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
