// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppDownloadUrlRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAppDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppDownloadUrlRequest self = new GetAppDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAppDownloadUrlRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GetAppDownloadUrlRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetAppDownloadUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
