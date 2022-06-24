// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeUpgradeTaskResponseBody extends TeaModel {
    @NameInMap("CreateTaskResult")
    public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult createTaskResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeUpgradeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeUpgradeTaskResponseBody self = new CreateMcubeUpgradeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeUpgradeTaskResponseBody setCreateTaskResult(CreateMcubeUpgradeTaskResponseBodyCreateTaskResult createTaskResult) {
        this.createTaskResult = createTaskResult;
        return this;
    }
    public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult getCreateTaskResult() {
        return this.createTaskResult;
    }

    public CreateMcubeUpgradeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeUpgradeTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeUpgradeTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeUpgradeTaskResponseBodyCreateTaskResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("UpgradeTaskId")
        public String upgradeTaskId;

        public static CreateMcubeUpgradeTaskResponseBodyCreateTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeUpgradeTaskResponseBodyCreateTaskResult self = new CreateMcubeUpgradeTaskResponseBodyCreateTaskResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateMcubeUpgradeTaskResponseBodyCreateTaskResult setUpgradeTaskId(String upgradeTaskId) {
            this.upgradeTaskId = upgradeTaskId;
            return this;
        }
        public String getUpgradeTaskId() {
            return this.upgradeTaskId;
        }

    }

}
