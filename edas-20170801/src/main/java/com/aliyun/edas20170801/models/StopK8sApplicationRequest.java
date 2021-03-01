// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopK8sApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Timeout")
    public Integer timeout;

    public static StopK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopK8sApplicationRequest self = new StopK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
