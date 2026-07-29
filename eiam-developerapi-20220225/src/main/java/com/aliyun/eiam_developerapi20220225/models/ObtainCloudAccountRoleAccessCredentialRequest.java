// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCloudAccountRoleAccessCredentialRequest extends TeaModel {
    /**
     * <p>The business identifier of the cloud account role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxx:role/role-test</p>
     */
    @NameInMap("cloudAccountRoleExternalId")
    public String cloudAccountRoleExternalId;

    /**
     * <p>Specifies the validity duration of the temporary security credentials (STS Token) for the cloud account role, in seconds. Valid values: 900 to 43200 (15 minutes to 12 hours).
     * Constraints:</p>
     * <ul>
     * <li>The minimum value cannot be less than 900 seconds.</li>
     * <li>The maximum value is subject to the maximum session duration of the cloud provider role or service account. For example, the default maximum session duration for an AWS role is 3600 seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("durationSeconds")
    public Integer durationSeconds;

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

    public ObtainCloudAccountRoleAccessCredentialRequest setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

}
