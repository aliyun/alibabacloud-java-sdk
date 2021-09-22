// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDBCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBCollectionResponseBody self = new DeleteDBCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
