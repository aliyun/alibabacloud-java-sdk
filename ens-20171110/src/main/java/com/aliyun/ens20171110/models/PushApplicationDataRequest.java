// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Data")
    public String data;

    @NameInMap("PushStrategy")
    public String pushStrategy;

    @NameInMap("Timeout")
    public Integer timeout;

    public static PushApplicationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataRequest self = new PushApplicationDataRequest();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushApplicationDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PushApplicationDataRequest setPushStrategy(String pushStrategy) {
        this.pushStrategy = pushStrategy;
        return this;
    }
    public String getPushStrategy() {
        return this.pushStrategy;
    }

    public PushApplicationDataRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
