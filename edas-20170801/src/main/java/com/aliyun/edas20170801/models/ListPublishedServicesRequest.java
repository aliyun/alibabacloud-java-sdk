// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListPublishedServicesRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1fbd8b72-<strong><strong>-</strong></strong>-bdfe-478dbc914121</p>
     */
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
