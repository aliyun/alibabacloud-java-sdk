// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetOwnerAgreementInstanceResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public String data;

    // errCode
    @NameInMap("ErrCode")
    public String errCode;

    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetOwnerAgreementInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerAgreementInstanceResponseBody self = new GetOwnerAgreementInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOwnerAgreementInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOwnerAgreementInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetOwnerAgreementInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetOwnerAgreementInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOwnerAgreementInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
