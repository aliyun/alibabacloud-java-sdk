// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelVersionLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteModelVersionLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelVersionLabelsResponseBody self = new DeleteModelVersionLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelVersionLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
