// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeAccountPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static ChangeAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountPasswordResponse self = new ChangeAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAccountPasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeAccountPasswordResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
