// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UserMetricsEndpoint extends TeaModel {
    /**
     * <p>The HTTP path of the metric collection API.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The port number on which the metric collection service listens.</p>
     */
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
