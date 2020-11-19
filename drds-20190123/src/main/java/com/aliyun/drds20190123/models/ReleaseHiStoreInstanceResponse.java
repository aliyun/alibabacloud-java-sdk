// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseHiStoreInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    public static ReleaseHiStoreInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseHiStoreInstanceResponse self = new ReleaseHiStoreInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseHiStoreInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseHiStoreInstanceResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
