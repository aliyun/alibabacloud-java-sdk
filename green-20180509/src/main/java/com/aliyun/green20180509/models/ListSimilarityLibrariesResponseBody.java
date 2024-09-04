// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityLibrariesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ListSimilarityLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityLibrariesResponseBody self = new ListSimilarityLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSimilarityLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
