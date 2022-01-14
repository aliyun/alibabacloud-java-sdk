// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMcubeUpgradePackageResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeUpgradePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradePackageResponseBody self = new CreateMcubeUpgradePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeUpgradePackageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeUpgradePackageResponseBody setResultContent(CreateMcubeUpgradePackageResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMcubeUpgradePackageResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMcubeUpgradePackageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeUpgradePackageResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeUpgradePackageResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeUpgradePackageResponseBodyResultContent self = new CreateMcubeUpgradePackageResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMcubeUpgradePackageResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMcubeUpgradePackageResponseBodyResultContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeUpgradePackageResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeUpgradePackageResponseBodyResultContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeUpgradePackageResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
