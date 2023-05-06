// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetIconDownloadUrlRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetIconDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIconDownloadUrlRequest self = new GetIconDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetIconDownloadUrlRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GetIconDownloadUrlRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetIconDownloadUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
