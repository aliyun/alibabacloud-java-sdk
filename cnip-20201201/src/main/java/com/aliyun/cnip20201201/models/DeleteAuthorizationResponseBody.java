// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationResponseBody extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    public static DeleteAuthorizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationResponseBody self = new DeleteAuthorizationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteAuthorizationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeleteAuthorizationResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}
