// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadSdkFileResponseBody extends TeaModel {
    @NameInMap("DownloadFileResult")
    public DownloadSdkFileResponseBodyDownloadFileResult downloadFileResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DownloadSdkFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSdkFileResponseBody self = new DownloadSdkFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSdkFileResponseBody setDownloadFileResult(DownloadSdkFileResponseBodyDownloadFileResult downloadFileResult) {
        this.downloadFileResult = downloadFileResult;
        return this;
    }
    public DownloadSdkFileResponseBodyDownloadFileResult getDownloadFileResult() {
        return this.downloadFileResult;
    }

    public DownloadSdkFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSdkFileResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DownloadSdkFileResponseBodyDownloadFileResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadSdkFileResponseBodyDownloadFileResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadSdkFileResponseBodyDownloadFileResult self = new DownloadSdkFileResponseBodyDownloadFileResult();
            return TeaModel.build(map, self);
        }

        public DownloadSdkFileResponseBodyDownloadFileResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
