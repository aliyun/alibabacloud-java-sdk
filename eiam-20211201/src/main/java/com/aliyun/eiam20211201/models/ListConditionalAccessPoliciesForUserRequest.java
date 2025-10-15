// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForUserRequest extends TeaModel {
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
     * <p>条件访问策略关联的用户ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_xxxx</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListConditionalAccessPoliciesForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForUserRequest self = new ListConditionalAccessPoliciesForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConditionalAccessPoliciesForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
