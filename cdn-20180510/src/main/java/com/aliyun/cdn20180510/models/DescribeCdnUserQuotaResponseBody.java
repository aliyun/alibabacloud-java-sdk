// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserQuotaResponseBody extends TeaModel {
    // The maximum number of URLs and directories that can be blocked.
    @NameInMap("BlockQuota")
    public Integer blockQuota;

    // The remaining number of URLs and directories that can be blocked.
    @NameInMap("BlockRemain")
    public Integer blockRemain;

    // The maximum number of accelerated domain names that can be added to Alibaba Cloud CDN.
    @NameInMap("DomainQuota")
    public Integer domainQuota;

    // The maximum number of URLs that can be prefetched.
    @NameInMap("PreloadQuota")
    public Integer preloadQuota;

    // The remaining number of URLs that can be prefetched.
    @NameInMap("PreloadRemain")
    public Integer preloadRemain;

    // The maximum number of directories that can be refreshed.
    @NameInMap("RefreshDirQuota")
    public Integer refreshDirQuota;

    // The remaining number of directories that can be refreshed.
    @NameInMap("RefreshDirRemain")
    public Integer refreshDirRemain;

    // The maximum number of URLs that can be refreshed.
    @NameInMap("RefreshUrlQuota")
    public Integer refreshUrlQuota;

    // The remaining number of URLs that can be refreshed.
    @NameInMap("RefreshUrlRemain")
    public Integer refreshUrlRemain;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserQuotaResponseBody self = new DescribeCdnUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserQuotaResponseBody setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public Integer getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeCdnUserQuotaResponseBody setBlockRemain(Integer blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeCdnUserQuotaResponseBody setDomainQuota(Integer domainQuota) {
        this.domainQuota = domainQuota;
        return this;
    }
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    public DescribeCdnUserQuotaResponseBody setPreloadQuota(Integer preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public Integer getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeCdnUserQuotaResponseBody setPreloadRemain(Integer preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeCdnUserQuotaResponseBody setRefreshDirQuota(Integer refreshDirQuota) {
        this.refreshDirQuota = refreshDirQuota;
        return this;
    }
    public Integer getRefreshDirQuota() {
        return this.refreshDirQuota;
    }

    public DescribeCdnUserQuotaResponseBody setRefreshDirRemain(Integer refreshDirRemain) {
        this.refreshDirRemain = refreshDirRemain;
        return this;
    }
    public Integer getRefreshDirRemain() {
        return this.refreshDirRemain;
    }

    public DescribeCdnUserQuotaResponseBody setRefreshUrlQuota(Integer refreshUrlQuota) {
        this.refreshUrlQuota = refreshUrlQuota;
        return this;
    }
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    public DescribeCdnUserQuotaResponseBody setRefreshUrlRemain(Integer refreshUrlRemain) {
        this.refreshUrlRemain = refreshUrlRemain;
        return this;
    }
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    public DescribeCdnUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
