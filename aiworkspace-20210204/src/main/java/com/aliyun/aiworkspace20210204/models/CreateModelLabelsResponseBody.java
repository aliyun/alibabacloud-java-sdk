// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelLabelsResponseBody self = new CreateModelLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
