// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ExportMappCenterAppConfigResponseBody extends TeaModel {
    @NameInMap("ExportMappCenterAppConfigResult")
    public ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult exportMappCenterAppConfigResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ExportMappCenterAppConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportMappCenterAppConfigResponseBody self = new ExportMappCenterAppConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportMappCenterAppConfigResponseBody setExportMappCenterAppConfigResult(ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult exportMappCenterAppConfigResult) {
        this.exportMappCenterAppConfigResult = exportMappCenterAppConfigResult;
        return this;
    }
    public ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult getExportMappCenterAppConfigResult() {
        return this.exportMappCenterAppConfigResult;
    }

    public ExportMappCenterAppConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportMappCenterAppConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExportMappCenterAppConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult extends TeaModel {
        @NameInMap("ConfigDownloadUrl")
        public String configDownloadUrl;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult build(java.util.Map<String, ?> map) throws Exception {
            ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult self = new ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult();
            return TeaModel.build(map, self);
        }

        public ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult setConfigDownloadUrl(String configDownloadUrl) {
            this.configDownloadUrl = configDownloadUrl;
            return this;
        }
        public String getConfigDownloadUrl() {
            return this.configDownloadUrl;
        }

        public ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ExportMappCenterAppConfigResponseBodyExportMappCenterAppConfigResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
