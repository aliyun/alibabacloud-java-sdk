// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOpenUrlResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static GetOpenUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenUrlResponseBody self = new GetOpenUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenUrlResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
