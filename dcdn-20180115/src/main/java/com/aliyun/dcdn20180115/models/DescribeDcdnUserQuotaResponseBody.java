// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserQuotaResponseBody extends TeaModel {
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

    public DescribeDcdnUserQuotaResponseBody setRefreshUrlRemain(Integer refreshUrlRemain) {
        this.refreshUrlRemain = refreshUrlRemain;
        return this;
    }
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setDomainQuota(Integer domainQuota) {
        this.domainQuota = domainQuota;
        return this;
    }
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setBlockRemain(Integer blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setPreloadRemain(Integer preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeDcdnUserQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserQuotaResponseBody setRefreshUrlQuota(Integer refreshUrlQuota) {
        this.refreshUrlQuota = refreshUrlQuota;
        return this;
    }
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    public DescribeDcdnUserQuotaResponseBody setPreloadQuota(Integer preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public Integer getPreloadQuota() {
        return this.preloadQuota;
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

}
