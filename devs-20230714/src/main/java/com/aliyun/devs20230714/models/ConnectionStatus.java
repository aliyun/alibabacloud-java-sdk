// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ConnectionStatus extends TeaModel {
    @NameInMap("installation")
    public Installation installation;

    public static ConnectionStatus build(java.util.Map<String, ?> map) throws Exception {
        ConnectionStatus self = new ConnectionStatus();
        return TeaModel.build(map, self);
    }

    public ConnectionStatus setInstallation(Installation installation) {
        this.installation = installation;
        return this;
    }
    public Installation getInstallation() {
        return this.installation;
    }

}
