// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StopWuyingServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopWuyingServerResponseBody self = new StopWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public StopWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
