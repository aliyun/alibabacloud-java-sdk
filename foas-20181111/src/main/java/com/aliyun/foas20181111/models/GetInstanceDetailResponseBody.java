// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    public String detail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDetailResponseBody self = new GetInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceDetailResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GetInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
