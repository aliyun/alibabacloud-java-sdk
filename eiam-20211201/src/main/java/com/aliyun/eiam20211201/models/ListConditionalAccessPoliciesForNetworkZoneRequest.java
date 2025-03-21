// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForNetworkZoneRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Application ID associated with the conditional access policy</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_11111</p>
     */
    @NameInMap("NetworkZoneId")
    public String networkZoneId;

    public static ListConditionalAccessPoliciesForNetworkZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForNetworkZoneRequest self = new ListConditionalAccessPoliciesForNetworkZoneRequest();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForNetworkZoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListConditionalAccessPoliciesForNetworkZoneRequest setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
        return this;
    }
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

}
