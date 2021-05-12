// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("errCode")
    public String errCode;

    public static DeleteProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductResponseBody self = new DeleteProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteProductResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
