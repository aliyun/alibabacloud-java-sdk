// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UserMetricsEndpoint extends TeaModel {
    @NameInMap("Path")
    public String path;

    @NameInMap("Port")
    public Integer port;

    public static UserMetricsEndpoint build(java.util.Map<String, ?> map) throws Exception {
        UserMetricsEndpoint self = new UserMetricsEndpoint();
        return TeaModel.build(map, self);
    }

    public UserMetricsEndpoint setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UserMetricsEndpoint setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
