// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    public Integer blockQuota;

    @NameInMap("RefreshUrlRemain")
    public Integer refreshUrlRemain;

    @NameInMap("DomainQuota")
    public Integer domainQuota;

    @NameInMap("BlockRemain")
    public Integer blockRemain;

    @NameInMap("PreloadRemain")
    public Integer preloadRemain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefreshUrlQuota")
    public Integer refreshUrlQuota;

    @NameInMap("PreloadQuota")
    public Integer preloadQuota;

    @NameInMap("RefreshDirQuota")
    public Integer refreshDirQuota;

    @NameInMap("RefreshDirRemain")
    public Integer refreshDirRemain;

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

    public DescribeCdnUserQuotaResponseBody setRefreshUrlRemain(Integer refreshUrlRemain) {
        this.refreshUrlRemain = refreshUrlRemain;
        return this;
    }
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    public DescribeCdnUserQuotaResponseBody setDomainQuota(Integer domainQuota) {
        this.domainQuota = domainQuota;
        return this;
    }
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    public DescribeCdnUserQuotaResponseBody setBlockRemain(Integer blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeCdnUserQuotaResponseBody setPreloadRemain(Integer preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeCdnUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnUserQuotaResponseBody setRefreshUrlQuota(Integer refreshUrlQuota) {
        this.refreshUrlQuota = refreshUrlQuota;
        return this;
    }
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    public DescribeCdnUserQuotaResponseBody setPreloadQuota(Integer preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public Integer getPreloadQuota() {
        return this.preloadQuota;
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

}
