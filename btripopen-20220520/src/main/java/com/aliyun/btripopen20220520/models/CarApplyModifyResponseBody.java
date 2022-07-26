// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarApplyModifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("err_code")
    public Integer errCode;

    @NameInMap("err_msg")
    public String errMsg;

    @NameInMap("module")
    public Boolean module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CarApplyModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarApplyModifyResponseBody self = new CarApplyModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CarApplyModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarApplyModifyResponseBody setErrCode(Integer errCode) {
        this.errCode = errCode;
        return this;
    }
    public Integer getErrCode() {
        return this.errCode;
    }

    public CarApplyModifyResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CarApplyModifyResponseBody setModule(Boolean module) {
        this.module = module;
        return this;
    }
    public Boolean getModule() {
        return this.module;
    }

    public CarApplyModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarApplyModifyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
