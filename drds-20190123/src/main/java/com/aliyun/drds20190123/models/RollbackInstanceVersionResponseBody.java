// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RollbackInstanceVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static RollbackInstanceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceVersionResponseBody self = new RollbackInstanceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceVersionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RollbackInstanceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
