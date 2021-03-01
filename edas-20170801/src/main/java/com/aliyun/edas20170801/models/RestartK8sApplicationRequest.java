// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartK8sApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Timeout")
    public Integer timeout;

    public static RestartK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartK8sApplicationRequest self = new RestartK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RestartK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
