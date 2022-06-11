// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallAckOperatorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static InstallAckOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAckOperatorRequest self = new InstallAckOperatorRequest();
        return TeaModel.build(map, self);
    }

    public InstallAckOperatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InstallAckOperatorRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
