// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppImageSecretRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reg-123*****</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteEdgeContainerAppImageSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppImageSecretRequest self = new DeleteEdgeContainerAppImageSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppImageSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteEdgeContainerAppImageSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
