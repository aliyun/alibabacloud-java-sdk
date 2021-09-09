// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateExtendConfigRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateExtendConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExtendConfigRequest self = new UpdateExtendConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExtendConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
