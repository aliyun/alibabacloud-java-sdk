// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ValidateEnvironmentTunnelResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errCode")
    public String errCode;

    // 错误信息
    @NameInMap("errMsg")
    public String errMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static ValidateEnvironmentTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateEnvironmentTunnelResponseBody self = new ValidateEnvironmentTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateEnvironmentTunnelResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ValidateEnvironmentTunnelResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ValidateEnvironmentTunnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
