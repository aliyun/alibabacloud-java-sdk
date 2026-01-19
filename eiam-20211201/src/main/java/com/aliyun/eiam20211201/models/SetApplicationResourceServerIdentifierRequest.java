// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationResourceServerIdentifierRequest extends TeaModel {
    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>ResourceServer唯一标识，对应ResourceServer受众</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://gateway.com">http://gateway.com</a></p>
     */
    @NameInMap("ResourceServerIdentifier")
    public String resourceServerIdentifier;

    public static SetApplicationResourceServerIdentifierRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationResourceServerIdentifierRequest self = new SetApplicationResourceServerIdentifierRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationResourceServerIdentifierRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationResourceServerIdentifierRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetApplicationResourceServerIdentifierRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetApplicationResourceServerIdentifierRequest setResourceServerIdentifier(String resourceServerIdentifier) {
        this.resourceServerIdentifier = resourceServerIdentifier;
        return this;
    }
    public String getResourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }

}
