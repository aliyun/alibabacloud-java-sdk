// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ResetAgenticApiKeyRequest extends TeaModel {
    /**
     * <p>The validity period of the new Access Token starting from the time of this reset, in seconds. Valid values: 1 to 31536000 (approximately 365 days). If you do not specify this parameter, the original expiration time of the Access Token is retained. This parameter is required when the target Access Token has already expired. Otherwise, the system retains the past expiration time and issues an Access Token that is invalid upon creation, and the request is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>2592000</p>
     */
    @NameInMap("ExpireAfterSeconds")
    public Integer expireAfterSeconds;

    /**
     * <p>The ID of the data gateway Access Token to reset. This value is the same as the Id returned by the create and query operations. Only the creator of the Access Token can reset it, and the target Access Token cannot be in a revoked state.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Id")
    public Long id;

    public static ResetAgenticApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticApiKeyRequest self = new ResetAgenticApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public ResetAgenticApiKeyRequest setExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
        return this;
    }
    public Integer getExpireAfterSeconds() {
        return this.expireAfterSeconds;
    }

    public ResetAgenticApiKeyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
