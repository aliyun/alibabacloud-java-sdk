// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlsForSDKResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("UrlResult")
    public DescribeDownloadUrlsForSDKResponseBodyUrlResult urlResult;

    public static DescribeDownloadUrlsForSDKResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlsForSDKResponseBody self = new DescribeDownloadUrlsForSDKResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlsForSDKResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadUrlsForSDKResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeDownloadUrlsForSDKResponseBody setUrlResult(DescribeDownloadUrlsForSDKResponseBodyUrlResult urlResult) {
        this.urlResult = urlResult;
        return this;
    }
    public DescribeDownloadUrlsForSDKResponseBodyUrlResult getUrlResult() {
        return this.urlResult;
    }

    public static class DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls extends TeaModel {
        @NameInMap("Android")
        public String android;

        @NameInMap("Wins")
        public String wins;

        @NameInMap("IOS")
        public String IOS;

        public static DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls self = new DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls setAndroid(String android) {
            this.android = android;
            return this;
        }
        public String getAndroid() {
            return this.android;
        }

        public DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls setWins(String wins) {
            this.wins = wins;
            return this;
        }
        public String getWins() {
            return this.wins;
        }

        public DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls setIOS(String IOS) {
            this.IOS = IOS;
            return this;
        }
        public String getIOS() {
            return this.IOS;
        }

    }

    public static class DescribeDownloadUrlsForSDKResponseBodyUrlResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Urls")
        public DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls urls;

        public static DescribeDownloadUrlsForSDKResponseBodyUrlResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadUrlsForSDKResponseBodyUrlResult self = new DescribeDownloadUrlsForSDKResponseBodyUrlResult();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadUrlsForSDKResponseBodyUrlResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeDownloadUrlsForSDKResponseBodyUrlResult setUrls(DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls urls) {
            this.urls = urls;
            return this;
        }
        public DescribeDownloadUrlsForSDKResponseBodyUrlResultUrls getUrls() {
            return this.urls;
        }

    }

}
