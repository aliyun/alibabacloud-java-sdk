// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateResourceServerScopeRequest extends TeaModel {
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
     * <p>authorize_required</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

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
     * <p>权限名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>读取全部用户</p>
     */
    @NameInMap("ResourceServerScopeName")
    public String resourceServerScopeName;

    /**
     * <p>权限类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>urn:alibaba:idaas:resourceserver:scope:delegated</p>
     */
    @NameInMap("ResourceServerScopeType")
    public String resourceServerScopeType;

    /**
     * <p>权限值，大小写不敏感，格式(${ResourceType}:${ResourceOption}:${ResourceRestrict})</p>
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
