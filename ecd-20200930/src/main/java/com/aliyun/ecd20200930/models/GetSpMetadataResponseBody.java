// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetSpMetadataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metadata of the SP.</p>
     */
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
