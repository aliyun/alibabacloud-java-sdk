// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class AllowResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static AllowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllowResponseBody self = new AllowResponseBody();
        return TeaModel.build(map, self);
    }

    public AllowResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public AllowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
