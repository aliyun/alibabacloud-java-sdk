// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionExternalApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeprovisionExternalApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionExternalApplicationRequest self = new DeprovisionExternalApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeprovisionExternalApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
