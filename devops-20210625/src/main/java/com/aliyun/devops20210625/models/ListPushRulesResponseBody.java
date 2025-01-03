// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPushRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListPushRulesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListPushRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPushRulesResponseBody self = new ListPushRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPushRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPushRulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPushRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPushRulesResponseBody setResult(java.util.List<ListPushRulesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPushRulesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListPushRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPushRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPushRulesResponseBodyResultRuleInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CommitFilesChecker</p>
         */
        @NameInMap("checkerName")
        public String checkerName;

        /**
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("checkerType")
        public String checkerType;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("extraMessage")
        public String extraMessage;

        @NameInMap("fileRuleRegexes")
        public java.util.List<String> fileRuleRegexes;

        public static ListPushRulesResponseBodyResultRuleInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPushRulesResponseBodyResultRuleInfos self = new ListPushRulesResponseBodyResultRuleInfos();
            return TeaModel.build(map, self);
        }

        public ListPushRulesResponseBodyResultRuleInfos setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public ListPushRulesResponseBodyResultRuleInfos setCheckerType(String checkerType) {
            this.checkerType = checkerType;
            return this;
        }
        public String getCheckerType() {
            return this.checkerType;
        }

        public ListPushRulesResponseBodyResultRuleInfos setExtraMessage(String extraMessage) {
            this.extraMessage = extraMessage;
            return this;
        }
        public String getExtraMessage() {
            return this.extraMessage;
        }

        public ListPushRulesResponseBodyResultRuleInfos setFileRuleRegexes(java.util.List<String> fileRuleRegexes) {
            this.fileRuleRegexes = fileRuleRegexes;
            return this;
        }
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

    }

    public static class ListPushRulesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-09-03T18:20:06+08:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-09-03T18:20:06+08:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2077</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("ruleInfos")
        public java.util.List<ListPushRulesResponseBodyResultRuleInfos> ruleInfos;

        public static ListPushRulesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPushRulesResponseBodyResult self = new ListPushRulesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPushRulesResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListPushRulesResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListPushRulesResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPushRulesResponseBodyResult setRuleInfos(java.util.List<ListPushRulesResponseBodyResultRuleInfos> ruleInfos) {
            this.ruleInfos = ruleInfos;
            return this;
        }
        public java.util.List<ListPushRulesResponseBodyResultRuleInfos> getRuleInfos() {
            return this.ruleInfos;
        }

    }

}
