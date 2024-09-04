// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetSimilarityLibraryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetSimilarityLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSimilarityLibraryResponseBody self = new GetSimilarityLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSimilarityLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
