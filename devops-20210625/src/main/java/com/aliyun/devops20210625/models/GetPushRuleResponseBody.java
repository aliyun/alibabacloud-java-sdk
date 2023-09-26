// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPushRuleResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetPushRuleResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetPushRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPushRuleResponseBody self = new GetPushRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPushRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPushRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPushRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPushRuleResponseBody setResult(GetPushRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetPushRuleResponseBodyResult getResult() {
        return this.result;
    }

    public GetPushRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPushRuleResponseBodyResultRuleInfos extends TeaModel {
        @NameInMap("checkerName")
        public String checkerName;

        @NameInMap("checkerType")
        public String checkerType;

        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static GetPushRuleResponseBodyResultRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            GetPushRuleResponseBodyResultRuleInfos self = new GetPushRuleResponseBodyResultRuleInfos();
            return TeaModel.build(map, self);
        }

        public GetPushRuleResponseBodyResultRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public GetPushRuleResponseBodyResultRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public GetPushRuleResponseBodyResultRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public GetPushRuleResponseBodyResultRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

    public static class GetPushRuleResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("ruleInfos")
        public java.util.List<GetPushRuleResponseBodyResultRuleInfos> ruleInfos;

        public static GetPushRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetPushRuleResponseBodyResult self = new GetPushRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetPushRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetPushRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetPushRuleResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPushRuleResponseBodyResult setRuleInfos(java.util.List<GetPushRuleResponseBodyResultRuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }
        public java.util.List<GetPushRuleResponseBodyResultRuleInfos> getRuleInfos() {
            return this.ruleInfos;
        }

    }

}
