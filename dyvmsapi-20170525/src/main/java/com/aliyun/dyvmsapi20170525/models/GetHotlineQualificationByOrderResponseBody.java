// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetHotlineQualificationByOrderResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
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
         * 
         * <strong>example:</strong>
         * <p>22456****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The qualification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1478*****</p>
         */
        @NameInMap("QualificationId")
        public String qualificationId;

        /**
         * <p>The qualification state. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong></li>
         * <li><strong>OTHER</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
