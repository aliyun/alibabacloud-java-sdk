// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ChangePasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ChangePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponse self = new ChangePasswordResponse();
        return TeaModel.build(map, self);
    }

    public ChangePasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
