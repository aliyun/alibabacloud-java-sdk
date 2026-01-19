// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerToClientRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ClientApplicationId")
    public String clientApplicationId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ResourceServerApplicationId")
    public String resourceServerApplicationId;

    public static AuthorizeResourceServerToClientRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerToClientRequest self = new AuthorizeResourceServerToClientRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerToClientRequest setClientApplicationId(String clientApplicationId) {
        this.clientApplicationId = clientApplicationId;
        return this;
    }
    public String getClientApplicationId() {
        return this.clientApplicationId;
    }

    public AuthorizeResourceServerToClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthorizeResourceServerToClientRequest setResourceServerApplicationId(String resourceServerApplicationId) {
        this.resourceServerApplicationId = resourceServerApplicationId;
        return this;
    }
    public String getResourceServerApplicationId() {
        return this.resourceServerApplicationId;
    }

}
