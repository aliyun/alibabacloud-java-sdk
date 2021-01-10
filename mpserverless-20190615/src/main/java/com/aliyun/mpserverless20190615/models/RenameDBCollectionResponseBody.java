// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RenameDBCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RenameDBCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameDBCollectionResponseBody self = new RenameDBCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameDBCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
