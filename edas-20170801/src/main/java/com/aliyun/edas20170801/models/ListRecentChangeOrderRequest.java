// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
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
