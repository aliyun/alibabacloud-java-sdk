// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionExternalApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the external application installed for the current account. You can obtain the ID by calling ListExternalApplications or ListApplicationProvisionInfos with SourceType set to external. If the application is not installed, you must first call ProvisionExternalApplication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>417273362044613****</p>
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
