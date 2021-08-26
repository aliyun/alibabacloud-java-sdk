// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileSignedURIResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 签名地址
    @NameInMap("URI")
    public String URI;

    public static GetFileSignedURIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileSignedURIResponseBody self = new GetFileSignedURIResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileSignedURIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileSignedURIResponseBody setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
