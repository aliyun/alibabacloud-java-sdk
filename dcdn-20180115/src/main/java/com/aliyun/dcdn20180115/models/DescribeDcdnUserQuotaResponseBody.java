// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The maximum number of URLs that can be blocked.</p>
     */
    @NameInMap("BlockQuota")
    public Integer blockQuota;

    /**
     * <p>The remaining number of URLs that can be blocked.</p>
     */
    @NameInMap("BlockRemain")
    public Integer blockRemain;

    /**
     * <p>The maximum number of accelerated domains.</p>
     */
    @NameInMap("DomainQuota")
    public Integer domainQuota;

    /**
     * <p>The maximum number of URLs or directories with parameters ignored that can be refreshed.</p>
     */
    @NameInMap("IgnoreParamsQuota")
    public Integer ignoreParamsQuota;

    /**
     * <p>The number of remaining URLs or directories with parameters ignored that can be refreshed.</p>
     */
    @NameInMap("IgnoreParamsRemain")
    public Integer ignoreParamsRemain;

    /**
     * <p>The maximum number of URLs that can be prefetched.</p>
     */
    @NameInMap("PreloadQuota")
    public Integer preloadQuota;

    /**
     * <p>The remaining number of URLs that can be prefetched.</p>
     */
    @NameInMap("PreloadRemain")
    public Integer preloadRemain;

    /**
     * <p>The maximum number of directories that can be refreshed.</p>
     */
    @NameInMap("RefreshDirQuota")
    public Integer refreshDirQuota;

    /**
     * <p>The remaining number of directories that can be refreshed.</p>
     */
    @NameInMap("RefreshDirRemain")
    public Integer refreshDirRemain;

    /**
     * <p>The maximum number of URLs that can be refreshed.</p>
     */
    @NameInMap("RefreshUrlQuota")
    public Integer refreshUrlQuota;

    /**
     * <p>The remaining number of URLs that can be refreshed.</p>
     */
    @NameInMap("RefreshUrlRemain")
    public Integer refreshUrlRemain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserQuotaResponseBody self = new DescribeDcdnUserQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserQuotaResponseBody setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public Integer getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setBlockRemain(Integer blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setDomainQuota(Integer domainQuota) {
        this.domainQuota = domainQuota;
        return this;
    }
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setIgnoreParamsQuota(Integer ignoreParamsQuota) {
        this.ignoreParamsQuota = ignoreParamsQuota;
        return this;
    }
    public Integer getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setIgnoreParamsRemain(Integer ignoreParamsRemain) {
        this.ignoreParamsRemain = ignoreParamsRemain;
        return this;
    }
    public Integer getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setPreloadQuota(Integer preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public Integer getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setPreloadRemain(Integer preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setRefreshDirQuota(Integer refreshDirQuota) {
        this.refreshDirQuota = refreshDirQuota;
        return this;
    }
    public Integer getRefreshDirQuota() {
        return this.refreshDirQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setRefreshDirRemain(Integer refreshDirRemain) {
        this.refreshDirRemain = refreshDirRemain;
        return this;
    }
    public Integer getRefreshDirRemain() {
        return this.refreshDirRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setRefreshUrlQuota(Integer refreshUrlQuota) {
        this.refreshUrlQuota = refreshUrlQuota;
        return this;
    }
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setRefreshUrlRemain(Integer refreshUrlRemain) {
        this.refreshUrlRemain = refreshUrlRemain;
        return this;
    }
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
