// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerScopesToOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>The ID of the resource server application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client. This token can contain only ASCII characters and must be no more than 64 characters long. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The organization ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>A list of scope permission IDs for the resource server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ress_XXXXX&quot;,&quot;ress_XXXXX&quot;]</p>
     */
    @NameInMap("ResourceServerScopeIds")
    public java.util.List<String> resourceServerScopeIds;

    public static AuthorizeResourceServerScopesToOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerScopesToOrganizationalUnitRequest self = new AuthorizeResourceServerScopesToOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public AuthorizeResourceServerScopesToOrganizationalUnitRequest setResourceServerScopeIds(java.util.List<String> resourceServerScopeIds) {
        this.resourceServerScopeIds = resourceServerScopeIds;
        return this;
    }
    public java.util.List<String> getResourceServerScopeIds() {
        return this.resourceServerScopeIds;
    }

}
