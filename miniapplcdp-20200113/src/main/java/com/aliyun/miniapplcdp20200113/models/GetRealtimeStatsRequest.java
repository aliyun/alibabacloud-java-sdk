// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetRealtimeStatsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetRealtimeStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeStatsRequest self = new GetRealtimeStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeStatsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
