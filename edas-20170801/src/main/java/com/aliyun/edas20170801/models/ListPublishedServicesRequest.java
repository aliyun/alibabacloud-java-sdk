// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListPublishedServicesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListPublishedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesRequest self = new ListPublishedServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
