// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAppDownloadUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    public static GetAppDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppDownloadUrlRequest self = new GetAppDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAppDownloadUrlRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetAppDownloadUrlRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

}
