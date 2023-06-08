// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshQuotaResponseBody extends TeaModel {
    /**
     * <p>The maximum number of URLs that can be refreshed on the current day.</p>
     */
    @NameInMap("BlockQuota")
    public String blockQuota;

    /**
     * <p>The remaining number of times that you can prefetch content to L2 points of presence (POPs) on the current day.</p>
     */
    @NameInMap("BlockRemain")
    public String blockRemain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DirQuota")
    public String dirQuota;

    /**
     * <p>The remaining number of URLs that can be refreshed on the current day.</p>
     */
    @NameInMap("DirRemain")
    public String dirRemain;

    /**
     * <p>The maximum number of URLs or directories with parameters ignored that can be refreshed on the current day.</p>
     */
    @NameInMap("IgnoreParamsQuota")
    public String ignoreParamsQuota;

    /**
     * <p>The number of remaining URLs or directories that can be refreshed with parameters ignored on the current day.</p>
     */
    @NameInMap("IgnoreParamsRemain")
    public String ignoreParamsRemain;

    /**
     * <p>The maximum number of directories that can be refreshed on the current day.</p>
     */
    @NameInMap("PreloadEdgeQuota")
    public String preloadEdgeQuota;

    /**
     * <p>The maximum number of times that you can prefetch content to L1 POPs on the current day.</p>
     */
    @NameInMap("PreloadEdgeRemain")
    public String preloadEdgeRemain;

    /**
     * <p>The remaining number of times that you can prefetch content to L1 POPs on the current day.</p>
     */
    @NameInMap("PreloadQuota")
    public String preloadQuota;

    /**
     * <p>The maximum number of times that you can prefetch content to L1 nodes on the current day.</p>
     */
    @NameInMap("PreloadRemain")
    public String preloadRemain;

    /**
     * <p>The maximum number of times that you can prefetch content to L2 POPs on the current day.</p>
     */
    @NameInMap("RegexQuota")
    public String regexQuota;

    /**
     * <p>The remaining number of URLs that can be blocked on the current day.</p>
     */
    @NameInMap("RegexRemain")
    public String regexRemain;

    /**
     * <p>The maximum number of URLs and directories that can be blocked on the current day.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The remaining number of directories that can be refreshed on the current day.</p>
     */
    @NameInMap("UrlQuota")
    public String urlQuota;

    /**
     * <p>The remaining number of URLs or directories that can be refreshed by using regular expressions on the current day.</p>
     */
    @NameInMap("UrlRemain")
    public String urlRemain;

    public static DescribeRefreshQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshQuotaResponseBody self = new DescribeRefreshQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshQuotaResponseBody setBlockQuota(String blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }
    public String getBlockQuota() {
        return this.blockQuota;
    }

    public DescribeRefreshQuotaResponseBody setBlockRemain(String blockRemain) {
        this.blockRemain = blockRemain;
        return this;
    }
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public DescribeRefreshQuotaResponseBody setDirQuota(String dirQuota) {
        this.dirQuota = dirQuota;
        return this;
    }
    public String getDirQuota() {
        return this.dirQuota;
    }

    public DescribeRefreshQuotaResponseBody setDirRemain(String dirRemain) {
        this.dirRemain = dirRemain;
        return this;
    }
    public String getDirRemain() {
        return this.dirRemain;
    }

    public DescribeRefreshQuotaResponseBody setIgnoreParamsQuota(String ignoreParamsQuota) {
        this.ignoreParamsQuota = ignoreParamsQuota;
        return this;
    }
    public String getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    public DescribeRefreshQuotaResponseBody setIgnoreParamsRemain(String ignoreParamsRemain) {
        this.ignoreParamsRemain = ignoreParamsRemain;
        return this;
    }
    public String getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
    }

    public DescribeRefreshQuotaResponseBody setPreloadEdgeQuota(String preloadEdgeQuota) {
        this.preloadEdgeQuota = preloadEdgeQuota;
        return this;
    }
    public String getPreloadEdgeQuota() {
        return this.preloadEdgeQuota;
    }

    public DescribeRefreshQuotaResponseBody setPreloadEdgeRemain(String preloadEdgeRemain) {
        this.preloadEdgeRemain = preloadEdgeRemain;
        return this;
    }
    public String getPreloadEdgeRemain() {
        return this.preloadEdgeRemain;
    }

    public DescribeRefreshQuotaResponseBody setPreloadQuota(String preloadQuota) {
        this.preloadQuota = preloadQuota;
        return this;
    }
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

    public DescribeRefreshQuotaResponseBody setPreloadRemain(String preloadRemain) {
        this.preloadRemain = preloadRemain;
        return this;
    }
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    public DescribeRefreshQuotaResponseBody setRegexQuota(String regexQuota) {
        this.regexQuota = regexQuota;
        return this;
    }
    public String getRegexQuota() {
        return this.regexQuota;
    }

    public DescribeRefreshQuotaResponseBody setRegexRemain(String regexRemain) {
        this.regexRemain = regexRemain;
        return this;
    }
    public String getRegexRemain() {
        return this.regexRemain;
    }

    public DescribeRefreshQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRefreshQuotaResponseBody setUrlQuota(String urlQuota) {
        this.urlQuota = urlQuota;
        return this;
    }
    public String getUrlQuota() {
        return this.urlQuota;
    }

    public DescribeRefreshQuotaResponseBody setUrlRemain(String urlRemain) {
        this.urlRemain = urlRemain;
        return this;
    }
    public String getUrlRemain() {
        return this.urlRemain;
    }

}
