// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CountAppVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    public static CountAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CountAppVersionRequest self = new CountAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public CountAppVersionRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
