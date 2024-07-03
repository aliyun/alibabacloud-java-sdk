// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class StopAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>83A9075B-C646-59A9-8232-CAE41AF4B9E3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAppResponseBody self = new StopAppResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
