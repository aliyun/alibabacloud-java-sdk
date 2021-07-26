// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateProjectProgressResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProjectProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectProgressResponseBody self = new UpdateProjectProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
