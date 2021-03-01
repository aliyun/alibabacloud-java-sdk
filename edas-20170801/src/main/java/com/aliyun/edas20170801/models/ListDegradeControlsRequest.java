// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDegradeControlsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListDegradeControlsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeControlsRequest self = new ListDegradeControlsRequest();
        return TeaModel.build(map, self);
    }

    public ListDegradeControlsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
