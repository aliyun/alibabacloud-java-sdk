// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class VirtualDeliveryToMsceneResponseBody extends TeaModel {
    @NameInMap("MpaasUserGamecenterPaymentVirtualdeliveryResponse")
    public VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserGamecenterPaymentVirtualdeliveryResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ac1f0083177615939018778261913</p>
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

    public static VirtualDeliveryToMsceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VirtualDeliveryToMsceneResponseBody self = new VirtualDeliveryToMsceneResponseBody();
        return TeaModel.build(map, self);
    }

    public VirtualDeliveryToMsceneResponseBody setMpaasUserGamecenterPaymentVirtualdeliveryResponse(VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserGamecenterPaymentVirtualdeliveryResponse) {
        this.mpaasUserGamecenterPaymentVirtualdeliveryResponse = mpaasUserGamecenterPaymentVirtualdeliveryResponse;
        return this;
    }
    public VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse getMpaasUserGamecenterPaymentVirtualdeliveryResponse() {
        return this.mpaasUserGamecenterPaymentVirtualdeliveryResponse;
    }

    public VirtualDeliveryToMsceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VirtualDeliveryToMsceneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VirtualDeliveryToMsceneResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VirtualDeliveryToMsceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
            VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse self = new VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse();
            return TeaModel.build(map, self);
        }

        public VirtualDeliveryToMsceneResponseBodyMpaasUserGamecenterPaymentVirtualdeliveryResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
