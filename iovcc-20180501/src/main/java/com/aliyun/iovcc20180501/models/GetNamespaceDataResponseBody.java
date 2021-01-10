// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetNamespaceDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static GetNamespaceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceDataResponseBody self = new GetNamespaceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNamespaceDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
