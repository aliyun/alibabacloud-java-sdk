// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class OperateLogHubResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71B41FF9-1275-5F75-973D-8BC3C60236E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateLogHubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubResponseBody self = new OperateLogHubResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateLogHubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
