// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshQuotaResponseBody extends TeaModel {
    /**
     * <p>The maximum number of URLs that can be blocked.</p>
     */
    @NameInMap("BlockQuota")
    public String blockQuota;

    /**
     * <p>The remaining number of URLs that can be blocked each day.</p>
     */
    @NameInMap("BlockRemain")
    public String blockRemain;

    /**
     * <p>The maximum number of directories that can be refreshed each day.</p>
     */
    @NameInMap("DirQuota")
    public String dirQuota;

    /**
     * <p>The remaining number of directories that can be refreshed each day.</p>
     */
    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("IgnoreParamsQuota")
    public String ignoreParamsQuota;

    @NameInMap("IgnoreParamsRemain")
    public String ignoreParamsRemain;

    /**
     * <p>The maximum number of URLs that can be prefetched each day.</p>
     */
    @NameInMap("PreloadQuota")
    public String preloadQuota;

    /**
     * <p>The remaining number of URLs that can be prefetched each day.</p>
     */
    @NameInMap("PreloadRemain")
    public String preloadRemain;

    /**
     * <p>The maximum number of URLs or directories that can be refreshed by using regular expressions each day.</p>
     */
    @NameInMap("RegexQuota")
    public String regexQuota;

    /**
     * <p>The remaining number of URLs or directories that can be refreshed by using regular expressions each day.</p>
     */
    @NameInMap("RegexRemain")
    public String regexRemain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of URLs that can be refreshed each day.</p>
     */
    @NameInMap("UrlQuota")
    public String urlQuota;

    /**
     * <p>The remaining number of URLs that can be refreshed each day.</p>
     */
    @NameInMap("UrlRemain")
    public String urlRemain;

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

    public DescribeDcdnRefreshQuotaResponseBody setBlockRemain(String blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setDirQuota(String dirQuota) {
        this.dirQuota = dirQuota;
        return this;
    }
    public String getDirQuota() {
        return this.dirQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setDirRemain(String dirRemain) {
        this.dirRemain = dirRemain;
        return this;
    }
    public String getDirRemain() {
        return this.dirRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setIgnoreParamsQuota(String ignoreParamsQuota) {
        this.ignoreParamsQuota = ignoreParamsQuota;
        return this;
    }
    public String getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setIgnoreParamsRemain(String ignoreParamsRemain) {
        this.ignoreParamsRemain = ignoreParamsRemain;
        return this;
    }
    public String getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setPreloadQuota(String preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setPreloadRemain(String preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setRegexQuota(String regexQuota) {
        this.regexQuota = regexQuota;
        return this;
    }
    public String getRegexQuota() {
        return this.regexQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setRegexRemain(String regexRemain) {
        this.regexRemain = regexRemain;
        return this;
    }
    public String getRegexRemain() {
        return this.regexRemain;
    }

    public DescribeDcdnRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnRefreshQuotaResponseBody setUrlQuota(String urlQuota) {
        this.urlQuota = urlQuota;
        return this;
    }
    public String getUrlQuota() {
        return this.urlQuota;
    }

    public DescribeDcdnRefreshQuotaResponseBody setUrlRemain(String urlRemain) {
        this.urlRemain = urlRemain;
        return this;
    }
    public String getUrlRemain() {
        return this.urlRemain;
    }

}
