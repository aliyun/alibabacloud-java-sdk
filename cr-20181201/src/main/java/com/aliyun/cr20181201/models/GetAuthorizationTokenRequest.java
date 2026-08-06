// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenRequest extends TeaModel {
    /**
     * <p>The validity period of the temporary credential in hours. Valid values: 1 to 24. When you use STS to call this operation, the actual validity period is the minimum of the STS token validity period and this parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpiresInHours")
    public Integer expiresInHours;

    /**
     * <p>The repository instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcvaduwb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAuthorizationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenRequest self = new GetAuthorizationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenRequest setExpiresInHours(Integer expiresInHours) {
        this.expiresInHours = expiresInHours;
        return this;
    }
    public Integer getExpiresInHours() {
        return this.expiresInHours;
    }

    public GetAuthorizationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
