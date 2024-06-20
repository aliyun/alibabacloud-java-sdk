// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F81D9EC0-1872-50F5-A96C-A0647D****1D</p>
     */
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
