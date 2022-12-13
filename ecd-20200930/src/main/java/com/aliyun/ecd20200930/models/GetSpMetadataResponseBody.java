// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The metadata of the SP.
    @NameInMap("SpMetadata")
    public String spMetadata;

    public static GetSpMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataResponseBody self = new GetSpMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpMetadataResponseBody setSpMetadata(String spMetadata) {
        this.spMetadata = spMetadata;
        return this;
    }
    public String getSpMetadata() {
        return this.spMetadata;
    }

}
