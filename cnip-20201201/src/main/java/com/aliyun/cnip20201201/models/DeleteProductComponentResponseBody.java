// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductComponentResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("status")
    public String status;

    @NameInMap("success")
    public Boolean success;

    public static DeleteProductComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductComponentResponseBody self = new DeleteProductComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProductComponentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeleteProductComponentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeleteProductComponentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeleteProductComponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
