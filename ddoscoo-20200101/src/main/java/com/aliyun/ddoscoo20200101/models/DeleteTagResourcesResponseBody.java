// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteTagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagResourcesResponseBody self = new DeleteTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
