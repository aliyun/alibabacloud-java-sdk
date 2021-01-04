// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlsForAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("UrlResult")
    public DescribeDownloadUrlsForAppKeyResponseBodyUrlResult urlResult;

    public static DescribeDownloadUrlsForAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlsForAppKeyResponseBody self = new DescribeDownloadUrlsForAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlsForAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadUrlsForAppKeyResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeDownloadUrlsForAppKeyResponseBody setUrlResult(DescribeDownloadUrlsForAppKeyResponseBodyUrlResult urlResult) {
        this.urlResult = urlResult;
        return this;
    }
    public DescribeDownloadUrlsForAppKeyResponseBodyUrlResult getUrlResult() {
        return this.urlResult;
    }

    public static class DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls extends TeaModel {
        @NameInMap("Android")
        public String android;

        @NameInMap("Wins")
        public String wins;

        @NameInMap("IOS")
        public String IOS;

        public static DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls self = new DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls setWins(String wins) {
            this.wins = wins;
            return this;
        }
        public String getWins() {
            return this.wins;
        }

        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls setIOS(String IOS) {
            this.IOS = IOS;
            return this;
        }
        public String getIOS() {
            return this.IOS;
        }

    }

    public static class DescribeDownloadUrlsForAppKeyResponseBodyUrlResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Urls")
        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls urls;

        public static DescribeDownloadUrlsForAppKeyResponseBodyUrlResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadUrlsForAppKeyResponseBodyUrlResult self = new DescribeDownloadUrlsForAppKeyResponseBodyUrlResult();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResult setUrls(DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls urls) {
            this.urls = urls;
            return this;
        }
        public DescribeDownloadUrlsForAppKeyResponseBodyUrlResultUrls getUrls() {
            return this.urls;
        }

    }

}
