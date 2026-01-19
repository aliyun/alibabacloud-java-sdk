// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCloudAccountRoleAccessCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxx:role/role-test</p>
     */
    @NameInMap("cloudAccountRoleExternalId")
    public String cloudAccountRoleExternalId;

    public static ObtainCloudAccountRoleAccessCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainCloudAccountRoleAccessCredentialRequest self = new ObtainCloudAccountRoleAccessCredentialRequest();
        return TeaModel.build(map, self);
    }

    public ObtainCloudAccountRoleAccessCredentialRequest setCloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
        this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
        return this;
    }
    public String getCloudAccountRoleExternalId() {
        return this.cloudAccountRoleExternalId;
    }

}
