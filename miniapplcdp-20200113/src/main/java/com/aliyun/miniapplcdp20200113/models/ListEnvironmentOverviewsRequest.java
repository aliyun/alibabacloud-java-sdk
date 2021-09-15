// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListEnvironmentOverviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentOverviewsRequest self = new ListEnvironmentOverviewsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentOverviewsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
