// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveImageLabelsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static RemoveImageLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageLabelsResponseBody self = new RemoveImageLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveImageLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
