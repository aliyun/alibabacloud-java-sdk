// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
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
