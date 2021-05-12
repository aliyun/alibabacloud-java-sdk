// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductComponentResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("status")
    public String status;

    @NameInMap("success")
    public Boolean success;

    public static AddProductComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentResponseBody self = new AddProductComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProductComponentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddProductComponentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public AddProductComponentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddProductComponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
