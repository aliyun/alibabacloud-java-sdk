// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsResponseBody extends TeaModel {
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
