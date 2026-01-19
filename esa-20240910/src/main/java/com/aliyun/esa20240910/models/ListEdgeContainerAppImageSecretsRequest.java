// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppImageSecretsRequest extends TeaModel {
    /**
     * <p>Application ID, which can be obtained using the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListEdgeContainerAppImageSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppImageSecretsRequest self = new ListEdgeContainerAppImageSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppImageSecretsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
