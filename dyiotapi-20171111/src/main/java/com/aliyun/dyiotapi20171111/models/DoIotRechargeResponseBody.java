// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoIotRechargeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IotRecharge")
    public DoIotRechargeResponseBodyIotRecharge iotRecharge;

    @NameInMap("Code")
    public String code;

    public static DoIotRechargeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoIotRechargeResponseBody self = new DoIotRechargeResponseBody();
        return TeaModel.build(map, self);
    }

    public DoIotRechargeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoIotRechargeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoIotRechargeResponseBody setIotRecharge(DoIotRechargeResponseBodyIotRecharge iotRecharge) {
        this.iotRecharge = iotRecharge;
        return this;
    }
    public DoIotRechargeResponseBodyIotRecharge getIotRecharge() {
        return this.iotRecharge;
    }

    public DoIotRechargeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DoIotRechargeResponseBodyIotRecharge extends TeaModel {
        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("DoneCode")
        public String doneCode;

        @NameInMap("OrderResult")
        public String orderResult;

        public static DoIotRechargeResponseBodyIotRecharge build(java.util.Map<String, ?> map) throws Exception {
            DoIotRechargeResponseBodyIotRecharge self = new DoIotRechargeResponseBodyIotRecharge();
            return TeaModel.build(map, self);
        }

        public DoIotRechargeResponseBodyIotRecharge setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public DoIotRechargeResponseBodyIotRecharge setDoneCode(String doneCode) {
            this.doneCode = doneCode;
            return this;
        }
        public String getDoneCode() {
            return this.doneCode;
        }

        public DoIotRechargeResponseBodyIotRecharge setOrderResult(String orderResult) {
            this.orderResult = orderResult;
            return this;
        }
        public String getOrderResult() {
            return this.orderResult;
        }

    }

}
