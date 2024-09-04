// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetSimilarityImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityImageResponseBody self = new GetSimilarityImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimilarityImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
