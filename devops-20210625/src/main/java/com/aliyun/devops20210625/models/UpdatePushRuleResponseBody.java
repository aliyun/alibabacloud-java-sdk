// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushRuleResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdatePushRuleResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static UpdatePushRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushRuleResponseBody self = new UpdatePushRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePushRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdatePushRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdatePushRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePushRuleResponseBody setResult(UpdatePushRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePushRuleResponseBodyResult getResult() {
        return this.result;
    }

    public UpdatePushRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePushRuleResponseBodyResultRuleInfos extends TeaModel {
        @NameInMap("checkerName")
        public String checkerName;

        @NameInMap("checkerType")
        public String checkerType;

        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static UpdatePushRuleResponseBodyResultRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            UpdatePushRuleResponseBodyResultRuleInfos self = new UpdatePushRuleResponseBodyResultRuleInfos();
            return TeaModel.build(map, self);
        }

        public UpdatePushRuleResponseBodyResultRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public UpdatePushRuleResponseBodyResultRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public UpdatePushRuleResponseBodyResultRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public UpdatePushRuleResponseBodyResultRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

    public static class UpdatePushRuleResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("ruleInfos")
        public java.util.List<UpdatePushRuleResponseBodyResultRuleInfos> ruleInfos;

        public static UpdatePushRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePushRuleResponseBodyResult self = new UpdatePushRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePushRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdatePushRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdatePushRuleResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdatePushRuleResponseBodyResult setRuleInfos(java.util.List<UpdatePushRuleResponseBodyResultRuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }
        public java.util.List<UpdatePushRuleResponseBodyResultRuleInfos> getRuleInfos() {
            return this.ruleInfos;
        }

    }

}
