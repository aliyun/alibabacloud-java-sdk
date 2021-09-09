// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateXpackMonitorConfigRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateXpackMonitorConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateXpackMonitorConfigRequest self = new UpdateXpackMonitorConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateXpackMonitorConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
