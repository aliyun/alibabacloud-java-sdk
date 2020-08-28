// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class UpdateUserServiceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static UpdateUserServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserServiceInfoResponse self = new UpdateUserServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserServiceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserServiceInfoResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
