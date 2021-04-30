// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StartListenerRequest extends TeaModel {
    // 监听id
    @NameInMap("ListenerId")
    public String listenerId;

    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    //  是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static StartListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartListenerRequest self = new StartListenerRequest();
        return TeaModel.build(map, self);
    }

    public StartListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public StartListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
