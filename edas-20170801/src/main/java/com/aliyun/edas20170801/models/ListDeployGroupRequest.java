// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDeployGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployGroupRequest self = new ListDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
