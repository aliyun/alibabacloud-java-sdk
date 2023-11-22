// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DropSearchIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DropSearchIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DropSearchIndexResponseBody self = new DropSearchIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DropSearchIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
