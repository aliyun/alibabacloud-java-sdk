// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyLogHubStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AA1F421-395B-5BC4-BDDC-762C508A952B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogHubStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogHubStatusResponseBody self = new ModifyLogHubStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogHubStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
