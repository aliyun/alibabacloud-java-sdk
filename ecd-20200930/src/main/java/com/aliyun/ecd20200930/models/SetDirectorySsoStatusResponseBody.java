// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDirectorySsoStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDirectorySsoStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDirectorySsoStatusResponseBody self = new SetDirectorySsoStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDirectorySsoStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
