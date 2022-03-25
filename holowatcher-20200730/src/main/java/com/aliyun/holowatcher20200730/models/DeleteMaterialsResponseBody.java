// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteMaterialsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaterialsResponseBody self = new DeleteMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
