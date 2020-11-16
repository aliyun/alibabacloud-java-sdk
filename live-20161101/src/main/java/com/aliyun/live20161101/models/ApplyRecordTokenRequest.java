// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyRecordTokenRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static ApplyRecordTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyRecordTokenRequest self = new ApplyRecordTokenRequest();
        return TeaModel.build(map, self);
    }

    public ApplyRecordTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
