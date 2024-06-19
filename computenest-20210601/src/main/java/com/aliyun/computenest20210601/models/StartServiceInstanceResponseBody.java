// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class StartServiceInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>464C8CB6-A548-5206-B83C-D32A8E43EC21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartServiceInstanceResponseBody self = new StartServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
