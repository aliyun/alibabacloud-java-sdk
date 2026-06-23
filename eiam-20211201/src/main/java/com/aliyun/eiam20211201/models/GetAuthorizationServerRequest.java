// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationServerRequest extends TeaModel {
    /**
     * <p>IDaaS的授权服务器资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iauths_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("AuthorizationServerId")
    public String authorizationServerId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAuthorizationServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationServerRequest self = new GetAuthorizationServerRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationServerRequest setAuthorizationServerId(String authorizationServerId) {
        this.authorizationServerId = authorizationServerId;
        return this;
    }
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    public GetAuthorizationServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
