// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradePackageResponseBody extends TeaModel {
    @NameInMap("CreateUpgradePackageResult")
    public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult createUpgradePackageResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeUpgradePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradePackageResponseBody self = new CreateMcubeUpgradePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradePackageResponseBody setCreateUpgradePackageResult(CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult createUpgradePackageResult) {
        this.createUpgradePackageResult = createUpgradePackageResult;
        return this;
    }
    public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult getCreateUpgradePackageResult() {
        return this.createUpgradePackageResult;
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

    public CreateMcubeUpgradePackageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("UpgradePackageId")
        public String upgradePackageId;

        public static CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult self = new CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateMcubeUpgradePackageResponseBodyCreateUpgradePackageResult setUpgradePackageId(String upgradePackageId) {
            this.upgradePackageId = upgradePackageId;
            return this;
        }
        public String getUpgradePackageId() {
            return this.upgradePackageId;
        }

    }

}
