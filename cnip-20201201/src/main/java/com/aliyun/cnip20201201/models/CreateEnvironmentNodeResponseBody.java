// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static CreateEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentNodeResponseBody self = new CreateEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentNodeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateEnvironmentNodeResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateEnvironmentNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
