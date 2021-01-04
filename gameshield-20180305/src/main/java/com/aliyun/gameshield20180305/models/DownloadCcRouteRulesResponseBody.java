// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadCcRouteRulesResponseBody extends TeaModel {
    @NameInMap("DownloadFileResult")
    public DownloadCcRouteRulesResponseBodyDownloadFileResult downloadFileResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DownloadCcRouteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadCcRouteRulesResponseBody self = new DownloadCcRouteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadCcRouteRulesResponseBody setDownloadFileResult(DownloadCcRouteRulesResponseBodyDownloadFileResult downloadFileResult) {
        this.downloadFileResult = downloadFileResult;
        return this;
    }
    public DownloadCcRouteRulesResponseBodyDownloadFileResult getDownloadFileResult() {
        return this.downloadFileResult;
    }

    public DownloadCcRouteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadCcRouteRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DownloadCcRouteRulesResponseBodyDownloadFileResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadCcRouteRulesResponseBodyDownloadFileResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadCcRouteRulesResponseBodyDownloadFileResult self = new DownloadCcRouteRulesResponseBodyDownloadFileResult();
            return TeaModel.build(map, self);
        }

        public DownloadCcRouteRulesResponseBodyDownloadFileResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
