// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductComponentResponseBody extends TeaModel {
    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static UpdateProductComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentResponseBody self = new UpdateProductComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateProductComponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
