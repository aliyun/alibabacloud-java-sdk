// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentParamResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    public static DeleteEnvironmentParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentParamResponseBody self = new DeleteEnvironmentParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentParamResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteEnvironmentParamResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteEnvironmentParamResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
