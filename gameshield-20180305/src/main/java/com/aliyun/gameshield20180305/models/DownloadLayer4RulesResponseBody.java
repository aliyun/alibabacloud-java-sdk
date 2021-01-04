// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadLayer4RulesResponseBody extends TeaModel {
    @NameInMap("DownloadFileResult")
    public DownloadLayer4RulesResponseBodyDownloadFileResult downloadFileResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DownloadLayer4RulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadLayer4RulesResponseBody self = new DownloadLayer4RulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadLayer4RulesResponseBody setDownloadFileResult(DownloadLayer4RulesResponseBodyDownloadFileResult downloadFileResult) {
        this.downloadFileResult = downloadFileResult;
        return this;
    }
    public DownloadLayer4RulesResponseBodyDownloadFileResult getDownloadFileResult() {
        return this.downloadFileResult;
    }

    public DownloadLayer4RulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadLayer4RulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DownloadLayer4RulesResponseBodyDownloadFileResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadLayer4RulesResponseBodyDownloadFileResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadLayer4RulesResponseBodyDownloadFileResult self = new DownloadLayer4RulesResponseBodyDownloadFileResult();
            return TeaModel.build(map, self);
        }

        public DownloadLayer4RulesResponseBodyDownloadFileResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
