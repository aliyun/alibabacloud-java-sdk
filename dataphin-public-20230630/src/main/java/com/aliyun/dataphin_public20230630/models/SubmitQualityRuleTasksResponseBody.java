// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityRuleTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubmitResult")
    public SubmitQualityRuleTasksResponseBodySubmitResult submitResult;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitQualityRuleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityRuleTasksResponseBody self = new SubmitQualityRuleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitQualityRuleTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitQualityRuleTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitQualityRuleTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitQualityRuleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitQualityRuleTasksResponseBody setSubmitResult(SubmitQualityRuleTasksResponseBodySubmitResult submitResult) {
        this.submitResult = submitResult;
        return this;
    }
    public SubmitQualityRuleTasksResponseBodySubmitResult getSubmitResult() {
        return this.submitResult;
    }

    public SubmitQualityRuleTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitQualityRuleTasksResponseBodySubmitResult extends TeaModel {
        @NameInMap("RuleTaskIdList")
        public java.util.List<Long> ruleTaskIdList;

        @NameInMap("WatchTaskIdList")
        public java.util.List<Long> watchTaskIdList;

        public static SubmitQualityRuleTasksResponseBodySubmitResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitQualityRuleTasksResponseBodySubmitResult self = new SubmitQualityRuleTasksResponseBodySubmitResult();
            return TeaModel.build(map, self);
        }

        public SubmitQualityRuleTasksResponseBodySubmitResult setRuleTaskIdList(java.util.List<Long> ruleTaskIdList) {
            this.ruleTaskIdList = ruleTaskIdList;
            return this;
        }
        public java.util.List<Long> getRuleTaskIdList() {
            return this.ruleTaskIdList;
        }

        public SubmitQualityRuleTasksResponseBodySubmitResult setWatchTaskIdList(java.util.List<Long> watchTaskIdList) {
            this.watchTaskIdList = watchTaskIdList;
            return this;
        }
        public java.util.List<Long> getWatchTaskIdList() {
            return this.watchTaskIdList;
        }

    }

}
