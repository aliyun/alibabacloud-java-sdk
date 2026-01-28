// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RemoveUserFromAuthorizationRuleRequest extends TeaModel {
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
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>账户ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RemoveUserFromAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromAuthorizationRuleRequest self = new RemoveUserFromAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromAuthorizationRuleRequest setAuthorizationRuleId(String authorizationRuleId) {
        this.authorizationRuleId = authorizationRuleId;
        return this;
    }
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    public RemoveUserFromAuthorizationRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveUserFromAuthorizationRuleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
