// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>452392483381546****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeprovisionApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionApplicationRequest self = new DeprovisionApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeprovisionApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
