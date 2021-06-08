// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    public String blockQuota;

    @NameInMap("PreloadRemain")
    public String preloadRemain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("blockRemain")
    public String blockRemain;

    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("UrlRemain")
    public String urlRemain;

    @NameInMap("DirQuota")
    public String dirQuota;

    @NameInMap("UrlQuota")
    public String urlQuota;

    @NameInMap("PreloadQuota")
    public String preloadQuota;

    public static DescribeDcdnRefreshQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshQuotaResponseBody self = new DescribeDcdnRefreshQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshQuotaResponseBody setBlockQuota(String blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public String getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setPreloadRemain(String preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnRefreshQuotaResponseBody setBlockRemain(String blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setDirRemain(String dirRemain) {
        this.dirRemain = dirRemain;
        return this;
    }
    public String getDirRemain() {
        return this.dirRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setUrlRemain(String urlRemain) {
        this.urlRemain = urlRemain;
        return this;
    }
    public String getUrlRemain() {
        return this.urlRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setDirQuota(String dirQuota) {
        this.dirQuota = dirQuota;
        return this;
    }
    public String getDirQuota() {
        return this.dirQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setUrlQuota(String urlQuota) {
        this.urlQuota = urlQuota;
        return this;
    }
    public String getUrlQuota() {
        return this.urlQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setPreloadQuota(String preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

}
