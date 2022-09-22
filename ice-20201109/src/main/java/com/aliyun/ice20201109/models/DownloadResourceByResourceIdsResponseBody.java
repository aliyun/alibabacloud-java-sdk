// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DownloadResourceByResourceIdsResponseBody extends TeaModel {
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourcePackageUrl")
    public String resourcePackageUrl;

    public static DownloadResourceByResourceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadResourceByResourceIdsResponseBody self = new DownloadResourceByResourceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadResourceByResourceIdsResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public DownloadResourceByResourceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadResourceByResourceIdsResponseBody setResourcePackageUrl(String resourcePackageUrl) {
        this.resourcePackageUrl = resourcePackageUrl;
        return this;
    }
    public String getResourcePackageUrl() {
        return this.resourcePackageUrl;
    }

}
