// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteSimilarityLibraryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSimilarityLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSimilarityLibraryResponseBody self = new DeleteSimilarityLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSimilarityLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
