// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConsumedServicesRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListConsumedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesRequest self = new ListConsumedServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
