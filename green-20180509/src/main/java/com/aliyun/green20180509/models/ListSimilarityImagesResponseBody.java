// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ListSimilarityImagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ListSimilarityImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSimilarityImagesResponseBody self = new ListSimilarityImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSimilarityImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
