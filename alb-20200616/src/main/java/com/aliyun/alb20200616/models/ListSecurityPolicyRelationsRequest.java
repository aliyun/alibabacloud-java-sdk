// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyRelationsRequest extends TeaModel {
    /**
     * <p>The security policy IDs. You can specify up to five IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityPolicyIds")
    public java.util.List<String> securityPolicyIds;

    public static ListSecurityPolicyRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyRelationsRequest self = new ListSecurityPolicyRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyRelationsRequest setSecurityPolicyIds(java.util.List<String> securityPolicyIds) {
        this.securityPolicyIds = securityPolicyIds;
        return this;
    }
    public java.util.List<String> getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

}
