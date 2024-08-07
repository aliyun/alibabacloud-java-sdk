// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigNetworkRegionBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockResponseBody self = new ConfigNetworkRegionBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
