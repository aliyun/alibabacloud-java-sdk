// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddSimilarityImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSimilarityImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSimilarityImageResponseBody self = new AddSimilarityImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSimilarityImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
