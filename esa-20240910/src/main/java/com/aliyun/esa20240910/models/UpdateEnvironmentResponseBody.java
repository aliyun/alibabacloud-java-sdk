// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52DD50C2-C381-13BD-A269-5FAEEB848ACD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentResponseBody self = new UpdateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
