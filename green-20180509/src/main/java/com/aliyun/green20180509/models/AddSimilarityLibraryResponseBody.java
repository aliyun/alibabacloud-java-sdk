// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityLibraryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSimilarityLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityLibraryResponseBody self = new AddSimilarityLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSimilarityLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
