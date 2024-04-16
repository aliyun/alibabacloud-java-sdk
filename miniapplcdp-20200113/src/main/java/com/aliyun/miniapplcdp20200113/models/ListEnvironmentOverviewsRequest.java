// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentOverviewsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Source")
    public String source;

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

    public ListEnvironmentOverviewsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
