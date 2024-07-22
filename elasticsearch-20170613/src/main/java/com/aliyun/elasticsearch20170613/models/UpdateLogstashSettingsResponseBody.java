// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>71D0D1DA-B22F-58CB-AF5B-D1657A6A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLogstashSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashSettingsResponseBody self = new UpdateLogstashSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
