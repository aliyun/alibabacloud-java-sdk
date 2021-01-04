// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadFlexAccRulesFileResponseBody extends TeaModel {
    @NameInMap("DownloadFileResult")
    public DownloadFlexAccRulesFileResponseBodyDownloadFileResult downloadFileResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DownloadFlexAccRulesFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadFlexAccRulesFileResponseBody self = new DownloadFlexAccRulesFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadFlexAccRulesFileResponseBody setDownloadFileResult(DownloadFlexAccRulesFileResponseBodyDownloadFileResult downloadFileResult) {
        this.downloadFileResult = downloadFileResult;
        return this;
    }
    public DownloadFlexAccRulesFileResponseBodyDownloadFileResult getDownloadFileResult() {
        return this.downloadFileResult;
    }

    public DownloadFlexAccRulesFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadFlexAccRulesFileResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DownloadFlexAccRulesFileResponseBodyDownloadFileResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadFlexAccRulesFileResponseBodyDownloadFileResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadFlexAccRulesFileResponseBodyDownloadFileResult self = new DownloadFlexAccRulesFileResponseBodyDownloadFileResult();
            return TeaModel.build(map, self);
        }

        public DownloadFlexAccRulesFileResponseBodyDownloadFileResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
