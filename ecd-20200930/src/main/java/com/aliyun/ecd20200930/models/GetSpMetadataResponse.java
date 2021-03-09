// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SpMetadata")
    @Validation(required = true)
    public String spMetadata;

    public static GetSpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataResponse self = new GetSpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpMetadataResponse setSpMetadata(String spMetadata) {
        this.spMetadata = spMetadata;
        return this;
    }
    public String getSpMetadata() {
        return this.spMetadata;
    }

}
