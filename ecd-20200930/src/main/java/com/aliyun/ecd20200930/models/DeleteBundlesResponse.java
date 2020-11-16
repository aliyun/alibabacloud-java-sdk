// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteBundlesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBundlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBundlesResponse self = new DeleteBundlesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBundlesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
