// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class StopListenerRequest extends TeaModel {
    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 监听id
    @NameInMap("ListenerId")
    public String listenerId;

    public static StopListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopListenerRequest self = new StopListenerRequest();
        return TeaModel.build(map, self);
    }

    public StopListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StopListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

}
