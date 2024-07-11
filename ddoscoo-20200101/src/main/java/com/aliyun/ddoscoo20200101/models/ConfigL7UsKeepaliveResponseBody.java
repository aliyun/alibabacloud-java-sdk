// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7UsKeepaliveResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6D48AED0-41DB-5D9B-B484-3B6AAD312AD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigL7UsKeepaliveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7UsKeepaliveResponseBody self = new ConfigL7UsKeepaliveResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigL7UsKeepaliveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
