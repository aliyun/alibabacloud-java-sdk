// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteGatewaySecurityGroupRuleRequest extends TeaModel {
    /**
     * <p>Whether to cascade delete the security group rules.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cascadingDelete")
    public Boolean cascadingDelete;

    public static DeleteGatewaySecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySecurityGroupRuleRequest self = new DeleteGatewaySecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySecurityGroupRuleRequest setCascadingDelete(Boolean cascadingDelete) {
        this.cascadingDelete = cascadingDelete;
        return this;
    }
    public Boolean getCascadingDelete() {
        return this.cascadingDelete;
    }

}
