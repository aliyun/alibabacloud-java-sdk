// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RefreshAuthTokensRequest extends TeaModel {
    /**
     * <p>The validity period in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("ExpireSeconds")
    public Long expireSeconds;

    /**
     * <p>The list of instance IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-2zef0gov2nh2l3xxx,acp-2zef0gov2nh2l3yyy</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The list of license keys.</p>
     * 
     * <strong>example:</strong>
     * <p>lk-abcdef1234567890,lk-abcdef1234567891</p>
     */
    @NameInMap("LicenseKeys")
    public String licenseKeys;

    public static RefreshAuthTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAuthTokensRequest self = new RefreshAuthTokensRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAuthTokensRequest setExpireSeconds(Long expireSeconds) {
        this.expireSeconds = expireSeconds;
        return this;
    }
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public RefreshAuthTokensRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public RefreshAuthTokensRequest setLicenseKeys(String licenseKeys) {
        this.licenseKeys = licenseKeys;
        return this;
    }
    public String getLicenseKeys() {
        return this.licenseKeys;
    }

}
