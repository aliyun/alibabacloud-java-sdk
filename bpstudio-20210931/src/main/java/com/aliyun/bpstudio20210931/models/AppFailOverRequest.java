// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailOverRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("FailZone")
    public String failZone;

    public static AppFailOverRequest build(java.util.Map<String, ?> map) throws Exception {
        AppFailOverRequest self = new AppFailOverRequest();
        return TeaModel.build(map, self);
    }

    public AppFailOverRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AppFailOverRequest setFailZone(String failZone) {
        this.failZone = failZone;
        return this;
    }
    public String getFailZone() {
        return this.failZone;
    }

}
