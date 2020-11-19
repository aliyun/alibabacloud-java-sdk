// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RollbackInstanceVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static RollbackInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceVersionResponse self = new RollbackInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackInstanceVersionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
