// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDeleteAppsRequest extends TeaModel {
    @NameInMap("AppIds")
    public java.util.Map<String, ?> appIds;

    public static BatchDeleteAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAppsRequest self = new BatchDeleteAppsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAppsRequest setAppIds(java.util.Map<String, ?> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.Map<String, ?> getAppIds() {
        return this.appIds;
    }

}
