// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchIndexResponseBody self = new CreateSearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSearchIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
