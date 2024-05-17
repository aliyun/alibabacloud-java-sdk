// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListRecentChangeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentChangeOrderRequest self = new ListRecentChangeOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentChangeOrderRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
