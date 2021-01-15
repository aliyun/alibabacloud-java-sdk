// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeletePhysicalSpaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePhysicalSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePhysicalSpaceResponseBody self = new DeletePhysicalSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePhysicalSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
