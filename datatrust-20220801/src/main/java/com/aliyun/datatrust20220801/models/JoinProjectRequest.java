// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class JoinProjectRequest extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public String port;

    @NameInMap("Token")
    public String token;

    public static JoinProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinProjectRequest self = new JoinProjectRequest();
        return TeaModel.build(map, self);
    }

    public JoinProjectRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public JoinProjectRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public JoinProjectRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
