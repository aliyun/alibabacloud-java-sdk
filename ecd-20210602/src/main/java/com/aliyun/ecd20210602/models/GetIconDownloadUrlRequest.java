// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetIconDownloadUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    public static GetIconDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIconDownloadUrlRequest self = new GetIconDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetIconDownloadUrlRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetIconDownloadUrlRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

}
