// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateResourceServerScopeRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The authorization type. This parameter is required for user permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the scope permission.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Read User Info</p>
     */
    @NameInMap("ResourceServerScopeName")
    public String resourceServerScopeName;

    /**
     * <p>The type of the scope permission.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
     */
    @NameInMap("ResourceServerScopeType")
    public String resourceServerScopeType;

    /**
     * <p>The value of the scope permission.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>User:Read:ALL</p>
     */
    @NameInMap("ResourceServerScopeValue")
    public String resourceServerScopeValue;

    public static CreateResourceServerScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceServerScopeRequest self = new CreateResourceServerScopeRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceServerScopeRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateResourceServerScopeRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public CreateResourceServerScopeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateResourceServerScopeRequest setResourceServerScopeName(String resourceServerScopeName) {
        this.resourceServerScopeName = resourceServerScopeName;
        return this;
    }
    public String getResourceServerScopeName() {
        return this.resourceServerScopeName;
    }

    public CreateResourceServerScopeRequest setResourceServerScopeType(String resourceServerScopeType) {
        this.resourceServerScopeType = resourceServerScopeType;
        return this;
    }
    public String getResourceServerScopeType() {
        return this.resourceServerScopeType;
    }

    public CreateResourceServerScopeRequest setResourceServerScopeValue(String resourceServerScopeValue) {
        this.resourceServerScopeValue = resourceServerScopeValue;
        return this;
    }
    public String getResourceServerScopeValue() {
        return this.resourceServerScopeValue;
    }

}
