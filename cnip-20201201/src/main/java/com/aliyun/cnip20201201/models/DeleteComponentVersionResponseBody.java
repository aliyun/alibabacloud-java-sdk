// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteComponentVersionResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteComponentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentVersionResponseBody self = new DeleteComponentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteComponentVersionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DeleteComponentVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
