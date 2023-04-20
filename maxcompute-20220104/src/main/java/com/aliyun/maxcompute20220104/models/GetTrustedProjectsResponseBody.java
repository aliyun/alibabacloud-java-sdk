// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTrustedProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<String> data;

    @NameInMap("requestId")
    public String requestId;

    public static GetTrustedProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustedProjectsResponseBody self = new GetTrustedProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustedProjectsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetTrustedProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
