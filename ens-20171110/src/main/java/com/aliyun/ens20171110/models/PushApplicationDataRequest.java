// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data files that you want to push. The value must be a JSON string.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The push policy in the canary release environment. The value must be a JSON string. You can specify multiple push policies. By default, all data files are pushed.</p>
     */
    @NameInMap("PushStrategy")
    public String pushStrategy;

    /**
     * <p>This parameter does not take effect.</p>
     */
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
