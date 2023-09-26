// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePushRuleResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreatePushRuleResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreatePushRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePushRuleResponseBody self = new CreatePushRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePushRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreatePushRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreatePushRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePushRuleResponseBody setResult(CreatePushRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePushRuleResponseBodyResult getResult() {
        return this.result;
    }

    public CreatePushRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePushRuleResponseBodyResultRuleInfos extends TeaModel {
        @NameInMap("checkerName")
        public String checkerName;

        @NameInMap("checkerType")
        public String checkerType;

        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static CreatePushRuleResponseBodyResultRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            CreatePushRuleResponseBodyResultRuleInfos self = new CreatePushRuleResponseBodyResultRuleInfos();
            return TeaModel.build(map, self);
        }

        public CreatePushRuleResponseBodyResultRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public CreatePushRuleResponseBodyResultRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public CreatePushRuleResponseBodyResultRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public CreatePushRuleResponseBodyResultRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

    public static class CreatePushRuleResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("ruleInfos")
        public java.util.List<CreatePushRuleResponseBodyResultRuleInfos> ruleInfos;

        public static CreatePushRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePushRuleResponseBodyResult self = new CreatePushRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePushRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreatePushRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreatePushRuleResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreatePushRuleResponseBodyResult setRuleInfos(java.util.List<CreatePushRuleResponseBodyResultRuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }
        public java.util.List<CreatePushRuleResponseBodyResultRuleInfos> getRuleInfos() {
            return this.ruleInfos;
        }

    }

}
