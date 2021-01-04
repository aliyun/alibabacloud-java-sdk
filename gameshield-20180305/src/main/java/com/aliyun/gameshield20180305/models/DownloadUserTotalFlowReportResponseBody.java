// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadUserTotalFlowReportResponseBody extends TeaModel {
    @NameInMap("DownloadFileResult")
    public DownloadUserTotalFlowReportResponseBodyDownloadFileResult downloadFileResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DownloadUserTotalFlowReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadUserTotalFlowReportResponseBody self = new DownloadUserTotalFlowReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadUserTotalFlowReportResponseBody setDownloadFileResult(DownloadUserTotalFlowReportResponseBodyDownloadFileResult downloadFileResult) {
        this.downloadFileResult = downloadFileResult;
        return this;
    }
    public DownloadUserTotalFlowReportResponseBodyDownloadFileResult getDownloadFileResult() {
        return this.downloadFileResult;
    }

    public DownloadUserTotalFlowReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadUserTotalFlowReportResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DownloadUserTotalFlowReportResponseBodyDownloadFileResult extends TeaModel {
        @NameInMap("DownloadLink")
        public String downloadLink;

        public static DownloadUserTotalFlowReportResponseBodyDownloadFileResult build(java.util.Map<String, ?> map) throws Exception {
            DownloadUserTotalFlowReportResponseBodyDownloadFileResult self = new DownloadUserTotalFlowReportResponseBodyDownloadFileResult();
            return TeaModel.build(map, self);
        }

        public DownloadUserTotalFlowReportResponseBodyDownloadFileResult setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

}
