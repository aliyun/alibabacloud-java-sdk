// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class UpdatePrivateRdsClassResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static UpdatePrivateRdsClassResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateRdsClassResponse self = new UpdatePrivateRdsClassResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateRdsClassResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePrivateRdsClassResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdatePrivateRdsClassResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
