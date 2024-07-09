// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserQuotaResponseBody extends TeaModel {
    /**
     * <p>The maximum number of URLs and directories that can be blocked.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BlockQuota")
    public Integer blockQuota;

    /**
     * <p>The remaining number of URLs and directories that can be blocked.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BlockRemain")
    public Integer blockRemain;

    /**
     * <p>The maximum number of accelerated domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DomainQuota")
    public Integer domainQuota;

    /**
     * <p>The maximum number of ignore params that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("IgnoreParamsQuota")
    public Integer ignoreParamsQuota;

    /**
     * <p>The remaining number of ignore params that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IgnoreParamsRemain")
    public Integer ignoreParamsRemain;

    /**
     * <p>The maximum number of URLs that can be prefetched.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PreloadQuota")
    public Integer preloadQuota;

    /**
     * <p>The remaining number of URLs that can be prefetched.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PreloadRemain")
    public Integer preloadRemain;

    /**
     * <p>The maximum number of directories that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RefreshDirQuota")
    public Integer refreshDirQuota;

    /**
     * <p>The remaining number of directories that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("RefreshDirRemain")
    public Integer refreshDirRemain;

    /**
     * <p>The maximum number of URLs that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RefreshUrlQuota")
    public Integer refreshUrlQuota;

    /**
     * <p>The remaining number of URLs that can be refreshed.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RefreshUrlRemain")
    public Integer refreshUrlRemain;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF4F084A-2F49-4E1C-9CA0-DC85BCE7F391</p>
     */
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

    public DescribeCdnUserQuotaResponseBody setIgnoreParamsQuota(Integer ignoreParamsQuota) {
        this.ignoreParamsQuota = ignoreParamsQuota;
        return this;
    }
    public Integer getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    public DescribeCdnUserQuotaResponseBody setIgnoreParamsRemain(Integer ignoreParamsRemain) {
        this.ignoreParamsRemain = ignoreParamsRemain;
        return this;
    }
    public Integer getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
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
