// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterSubnetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049366F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigClusterSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterSubnetResponseBody self = new ConfigClusterSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigClusterSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
