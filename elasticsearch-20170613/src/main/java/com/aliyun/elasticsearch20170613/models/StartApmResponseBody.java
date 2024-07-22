// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartApmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>526F30AB-4A43-55BA-910F-ACD275FD5F14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StartApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartApmResponseBody self = new StartApmResponseBody();
        return TeaModel.build(map, self);
    }

    public StartApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartApmResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
