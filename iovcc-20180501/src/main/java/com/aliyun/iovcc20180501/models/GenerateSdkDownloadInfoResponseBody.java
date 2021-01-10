// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSdkDownloadInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdkDownloadInfo")
    public GenerateSdkDownloadInfoResponseBodySdkDownloadInfo sdkDownloadInfo;

    public static GenerateSdkDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSdkDownloadInfoResponseBody self = new GenerateSdkDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSdkDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateSdkDownloadInfoResponseBody setSdkDownloadInfo(GenerateSdkDownloadInfoResponseBodySdkDownloadInfo sdkDownloadInfo) {
        this.sdkDownloadInfo = sdkDownloadInfo;
        return this;
    }
    public GenerateSdkDownloadInfoResponseBodySdkDownloadInfo getSdkDownloadInfo() {
        return this.sdkDownloadInfo;
    }

    public static class GenerateSdkDownloadInfoResponseBodySdkDownloadInfo extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GenerateSdkDownloadInfoResponseBodySdkDownloadInfo build(java.util.Map<String, ?> map) throws Exception {
            GenerateSdkDownloadInfoResponseBodySdkDownloadInfo self = new GenerateSdkDownloadInfoResponseBodySdkDownloadInfo();
            return TeaModel.build(map, self);
        }

        public GenerateSdkDownloadInfoResponseBodySdkDownloadInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
