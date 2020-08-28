// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupPolicyRequest extends TeaModel {
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InnerAccessPolicy")
    @Validation(required = true)
    public String innerAccessPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifySecurityGroupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupPolicyRequest self = new ModifySecurityGroupPolicyRequest();
        return TeaModel.build(map, self);
    }

}
