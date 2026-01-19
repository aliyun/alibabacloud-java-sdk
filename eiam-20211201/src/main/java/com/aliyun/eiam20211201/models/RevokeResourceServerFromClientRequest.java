// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeResourceServerFromClientRequest extends TeaModel {
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

    public static RevokeResourceServerFromClientRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourceServerFromClientRequest self = new RevokeResourceServerFromClientRequest();
        return TeaModel.build(map, self);
    }

    public RevokeResourceServerFromClientRequest setClientApplicationId(String clientApplicationId) {
        this.clientApplicationId = clientApplicationId;
        return this;
    }
    public String getClientApplicationId() {
        return this.clientApplicationId;
    }

    public RevokeResourceServerFromClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeResourceServerFromClientRequest setResourceServerApplicationId(String resourceServerApplicationId) {
        this.resourceServerApplicationId = resourceServerApplicationId;
        return this;
    }
    public String getResourceServerApplicationId() {
        return this.resourceServerApplicationId;
    }

}
