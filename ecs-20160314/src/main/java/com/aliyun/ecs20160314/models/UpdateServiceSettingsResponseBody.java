// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class UpdateServiceSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSettingsResponseBody self = new UpdateServiceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
