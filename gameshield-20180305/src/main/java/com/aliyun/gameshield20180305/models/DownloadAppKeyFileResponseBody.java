// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadAppKeyFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("DownloadLinkResult")
    public DownloadAppKeyFileResponseBodyDownloadLinkResult downloadLinkResult;

    public static DownloadAppKeyFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadAppKeyFileResponseBody self = new DownloadAppKeyFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadAppKeyFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadAppKeyFileResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DownloadAppKeyFileResponseBody setDownloadLinkResult(DownloadAppKeyFileResponseBodyDownloadLinkResult downloadLinkResult) {
        this.downloadLinkResult = downloadLinkResult;
        return this;
    }
    public DownloadAppKeyFileResponseBodyDownloadLinkResult getDownloadLinkResult() {
        return this.downloadLinkResult;
    }

    public static class DownloadAppKeyFileResponseBodyDownloadLinkResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadAppKeyFileResponseBodyDownloadLinkResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadAppKeyFileResponseBodyDownloadLinkResult self = new DownloadAppKeyFileResponseBodyDownloadLinkResult();
            return TeaModel.build(map, self);
        }

        public DownloadAppKeyFileResponseBodyDownloadLinkResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
