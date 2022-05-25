// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeRequest extends TeaModel {
    // 客户端ID
    @NameInMap("client_id")
    public String clientId;

    // scope范围
    @NameInMap("scope")
    public String scope;

    public static GenerateDeviceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceCodeRequest self = new GenerateDeviceCodeRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceCodeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GenerateDeviceCodeRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
