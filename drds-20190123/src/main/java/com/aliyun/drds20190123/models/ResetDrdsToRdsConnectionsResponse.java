// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ResetDrdsToRdsConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static ResetDrdsToRdsConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDrdsToRdsConnectionsResponse self = new ResetDrdsToRdsConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ResetDrdsToRdsConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetDrdsToRdsConnectionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResetDrdsToRdsConnectionsResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
