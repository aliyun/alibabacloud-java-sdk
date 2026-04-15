// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreatePayOrderToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasOrderCreateResponse")
    public CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse mpaasOrderCreateResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatePayOrderToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePayOrderToMsenceResponseBody self = new CreatePayOrderToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePayOrderToMsenceResponseBody setMpaasOrderCreateResponse(CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse mpaasOrderCreateResponse) {
        this.mpaasOrderCreateResponse = mpaasOrderCreateResponse;
        return this;
    }
    public CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse getMpaasOrderCreateResponse() {
        return this.mpaasOrderCreateResponse;
    }

    public CreatePayOrderToMsenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePayOrderToMsenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePayOrderToMsenceResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreatePayOrderToMsenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3929520</p>
         */
        @NameInMap("BizOrderId")
        public String bizOrderId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse build(java.util.Map<String, ?> map) throws Exception {
            CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse self = new CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse();
            return TeaModel.build(map, self);
        }

        public CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse setBizOrderId(String bizOrderId) {
            this.bizOrderId = bizOrderId;
            return this;
        }
        public String getBizOrderId() {
            return this.bizOrderId;
        }

        public CreatePayOrderToMsenceResponseBodyMpaasOrderCreateResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
