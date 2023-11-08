// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UpdateImageAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateImageAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageAttributeResponseBody self = new UpdateImageAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
