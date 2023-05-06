// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetDownloadStsCredentialRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetDownloadStsCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadStsCredentialRequest self = new GetDownloadStsCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadStsCredentialRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GetDownloadStsCredentialRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetDownloadStsCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
