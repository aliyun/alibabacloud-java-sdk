// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceRemarkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigInstanceRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceRemarkResponseBody self = new ConfigInstanceRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
