// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSpaceModelResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSpaceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceModelResponseBody self = new DeleteSpaceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
