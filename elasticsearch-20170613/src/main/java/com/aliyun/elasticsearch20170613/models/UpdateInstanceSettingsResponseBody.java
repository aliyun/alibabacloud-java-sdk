// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSettingsResponseBody self = new UpdateInstanceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
