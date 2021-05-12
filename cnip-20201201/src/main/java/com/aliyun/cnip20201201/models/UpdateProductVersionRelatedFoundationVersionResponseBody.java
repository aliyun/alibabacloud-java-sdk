// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRelatedFoundationVersionResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static UpdateProductVersionRelatedFoundationVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRelatedFoundationVersionResponseBody self = new UpdateProductVersionRelatedFoundationVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRelatedFoundationVersionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateProductVersionRelatedFoundationVersionResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateProductVersionRelatedFoundationVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
