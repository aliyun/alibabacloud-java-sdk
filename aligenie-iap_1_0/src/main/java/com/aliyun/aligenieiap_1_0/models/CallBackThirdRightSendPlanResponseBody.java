// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CallBackThirdRightSendPlanResponseBody extends TeaModel {
    @NameInMap("RetCode")
    public String retCode;

    @NameInMap("RetMsg")
    public String retMsg;

    @NameInMap("RetValue")
    public Boolean retValue;

    @NameInMap("requestId")
    public String requestId;

    public static CallBackThirdRightSendPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CallBackThirdRightSendPlanResponseBody self = new CallBackThirdRightSendPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CallBackThirdRightSendPlanResponseBody setRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }
    public String getRetCode() {
        return this.retCode;
    }

    public CallBackThirdRightSendPlanResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public CallBackThirdRightSendPlanResponseBody setRetValue(Boolean retValue) {
        this.retValue = retValue;
        return this;
    }
    public Boolean getRetValue() {
        return this.retValue;
    }

    public CallBackThirdRightSendPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
