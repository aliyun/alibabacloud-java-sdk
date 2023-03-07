// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopVisualServiceResponseBody extends TeaModel {
    /**
     * <p>The status of the VNC Remote Service. Valid values:</p>
     * <br>
     * <p>*   Service started</p>
     * <p>*   Service stopped</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopVisualServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopVisualServiceResponseBody self = new StopVisualServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopVisualServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopVisualServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
