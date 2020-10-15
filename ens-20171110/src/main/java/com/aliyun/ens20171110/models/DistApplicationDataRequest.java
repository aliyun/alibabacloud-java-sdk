// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("DistStrategy")
    public String distStrategy;

    public static DistApplicationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataRequest self = new DistApplicationDataRequest();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DistApplicationDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DistApplicationDataRequest setDistStrategy(String distStrategy) {
        this.distStrategy = distStrategy;
        return this;
    }
    public String getDistStrategy() {
        return this.distStrategy;
    }

}
