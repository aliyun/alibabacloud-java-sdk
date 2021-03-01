// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("From")
    public String from;

    public static GetK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationRequest self = new GetK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetK8sApplicationRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
