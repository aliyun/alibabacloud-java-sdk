// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateXpackMonitorConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned results:</p>
     * <br>
     * <p>*   true: The update was successful.</p>
     * <p>*   false: The update failed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateXpackMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateXpackMonitorConfigResponseBody self = new UpdateXpackMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateXpackMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateXpackMonitorConfigResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
