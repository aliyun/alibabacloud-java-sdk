// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class UpdateMcubeWhitelistResponseBody extends TeaModel {
    @NameInMap("AddWhitelistResult")
    public UpdateMcubeWhitelistResponseBodyAddWhitelistResult addWhitelistResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateMcubeWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeWhitelistResponseBody self = new UpdateMcubeWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeWhitelistResponseBody setAddWhitelistResult(UpdateMcubeWhitelistResponseBodyAddWhitelistResult addWhitelistResult) {
        this.addWhitelistResult = addWhitelistResult;
        return this;
    }
    public UpdateMcubeWhitelistResponseBodyAddWhitelistResult getAddWhitelistResult() {
        return this.addWhitelistResult;
    }

    public UpdateMcubeWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMcubeWhitelistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMcubeWhitelistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo extends TeaModel {
        @NameInMap("FailNum")
        public Long failNum;

        @NameInMap("FailUserIds")
        public String failUserIds;

        @NameInMap("SuccessNum")
        public Long successNum;

        public static UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo self = new UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo();
            return TeaModel.build(map, self);
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo setFailNum(Long failNum) {
            this.failNum = failNum;
            return this;
        }
        public Long getFailNum() {
            return this.failNum;
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo setFailUserIds(String failUserIds) {
            this.failUserIds = failUserIds;
            return this;
        }
        public String getFailUserIds() {
            return this.failUserIds;
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo setSuccessNum(Long successNum) {
            this.successNum = successNum;
            return this;
        }
        public Long getSuccessNum() {
            return this.successNum;
        }

    }

    public static class UpdateMcubeWhitelistResponseBodyAddWhitelistResult extends TeaModel {
        @NameInMap("AddWhitelistInfo")
        public UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo addWhitelistInfo;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static UpdateMcubeWhitelistResponseBodyAddWhitelistResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcubeWhitelistResponseBodyAddWhitelistResult self = new UpdateMcubeWhitelistResponseBodyAddWhitelistResult();
            return TeaModel.build(map, self);
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResult setAddWhitelistInfo(UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo addWhitelistInfo) {
            this.addWhitelistInfo = addWhitelistInfo;
            return this;
        }
        public UpdateMcubeWhitelistResponseBodyAddWhitelistResultAddWhitelistInfo getAddWhitelistInfo() {
            return this.addWhitelistInfo;
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public UpdateMcubeWhitelistResponseBodyAddWhitelistResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
