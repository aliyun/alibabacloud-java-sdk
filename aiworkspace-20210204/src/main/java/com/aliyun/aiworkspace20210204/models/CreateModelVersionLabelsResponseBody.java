// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelVersionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionLabelsResponseBody self = new CreateModelVersionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
