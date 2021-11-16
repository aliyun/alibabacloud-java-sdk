// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceResponseBody extends TeaModel {
    @NameInMap("data")
    public Long data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceResponseBody self = new UpdateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
