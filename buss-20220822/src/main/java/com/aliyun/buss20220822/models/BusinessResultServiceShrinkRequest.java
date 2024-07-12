// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class BusinessResultServiceShrinkRequest extends TeaModel {
    @NameInMap("ActionCode")
    public String actionCode;

    @NameInMap("BussinessCode")
    public String bussinessCode;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String resultShrink;

    @NameInMap("Success")
    public Boolean success;

    public static BusinessResultServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BusinessResultServiceShrinkRequest self = new BusinessResultServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BusinessResultServiceShrinkRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public BusinessResultServiceShrinkRequest setBussinessCode(String bussinessCode) {
        this.bussinessCode = bussinessCode;
        return this;
    }
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    public BusinessResultServiceShrinkRequest setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public BusinessResultServiceShrinkRequest setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public BusinessResultServiceShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BusinessResultServiceShrinkRequest setResultShrink(String resultShrink) {
        this.resultShrink = resultShrink;
        return this;
    }
    public String getResultShrink() {
        return this.resultShrink;
    }

    public BusinessResultServiceShrinkRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
