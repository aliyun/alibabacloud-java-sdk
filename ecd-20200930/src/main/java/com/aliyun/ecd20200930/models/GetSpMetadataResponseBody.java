// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponseBody extends TeaModel {
    @NameInMap("SpMetadata")
    public String spMetadata;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSpMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpMetadataResponseBody self = new GetSpMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpMetadataResponseBody setSpMetadata(String spMetadata) {
        this.spMetadata = spMetadata;
        return this;
    }
    public String getSpMetadata() {
        return this.spMetadata;
    }

    public GetSpMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
