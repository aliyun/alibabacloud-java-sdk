// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    public String blockQuota;

    @NameInMap("BlockRemain")
    public String blockRemain;

    @NameInMap("DirQuota")
    public String dirQuota;

    @NameInMap("DirRemain")
    public String dirRemain;

    @NameInMap("PreloadEdgeQuota")
    public String preloadEdgeQuota;

    @NameInMap("PreloadEdgeRemain")
    public String preloadEdgeRemain;

    @NameInMap("PreloadQuota")
    public String preloadQuota;

    @NameInMap("PreloadRemain")
    public String preloadRemain;

    @NameInMap("RegexQuota")
    public String regexQuota;

    @NameInMap("RegexRemain")
    public String regexRemain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlQuota")
    public String urlQuota;

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
