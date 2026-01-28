// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateAuthorizationResourceRequest extends TeaModel {
    /**
     * <p>授权资源关联的资源标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("AuthorizationResourceEntityId")
    public String authorizationResourceEntityId;

    /**
     * <p>授权资源的资源类型。枚举取值:asset(资产)、credential(凭据)、cloudAccountRole(云账号角色)。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_account_role</p>
     */
    @NameInMap("AuthorizationResourceEntityType")
    public String authorizationResourceEntityType;

    /**
     * <p>授权规则标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
     */
    @NameInMap("AuthorizationRuleId")
    public String authorizationRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static CreateAuthorizationResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationResourceRequest self = new CreateAuthorizationResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationResourceRequest setAuthorizationResourceEntityId(String authorizationResourceEntityId) {
        this.authorizationResourceEntityId = authorizationResourceEntityId;
        return this;
    }
    public String getAuthorizationResourceEntityId() {
        return this.authorizationResourceEntityId;
    }

    public CreateAuthorizationResourceRequest setAuthorizationResourceEntityType(String authorizationResourceEntityType) {
        this.authorizationResourceEntityType = authorizationResourceEntityType;
        return this;
    }
    public String getAuthorizationResourceEntityType() {
        return this.authorizationResourceEntityType;
    }

    public CreateAuthorizationResourceRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public CreateAuthorizationResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
