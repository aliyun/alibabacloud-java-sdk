// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentNodeResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    public static DeleteEnvironmentNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentNodeResponseBody self = new DeleteEnvironmentNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentNodeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteEnvironmentNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteEnvironmentNodeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
