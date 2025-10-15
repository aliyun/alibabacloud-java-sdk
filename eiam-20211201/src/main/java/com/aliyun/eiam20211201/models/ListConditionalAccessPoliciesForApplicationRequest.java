// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForApplicationRequest extends TeaModel {
    /**
     * <p>条件访问策略关联的应用ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListConditionalAccessPoliciesForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForApplicationRequest self = new ListConditionalAccessPoliciesForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListConditionalAccessPoliciesForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
