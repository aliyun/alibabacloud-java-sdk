// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CloneAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static CloneAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneAppRequest self = new CloneAppRequest();
        return TeaModel.build(map, self);
    }

    public CloneAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
