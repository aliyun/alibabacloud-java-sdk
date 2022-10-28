// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteModelLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelLabelsResponseBody self = new DeleteModelLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
