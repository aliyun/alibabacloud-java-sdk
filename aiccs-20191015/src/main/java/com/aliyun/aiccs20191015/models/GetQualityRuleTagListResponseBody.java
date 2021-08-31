// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleTagListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<GetQualityRuleTagListResponseBodyData> data;

    public static GetQualityRuleTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTagListResponseBody self = new GetQualityRuleTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTagListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityRuleTagListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityRuleTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleTagListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityRuleTagListResponseBody setData(java.util.List<GetQualityRuleTagListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityRuleTagListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetQualityRuleTagListResponseBodyData extends TeaModel {
        @NameInMap("RuleTagName")
        public String ruleTagName;

        @NameInMap("RuleTagId")
        public Long ruleTagId;

        public static GetQualityRuleTagListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleTagListResponseBodyData self = new GetQualityRuleTagListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleTagListResponseBodyData setRuleTagName(String ruleTagName) {
            this.ruleTagName = ruleTagName;
            return this;
        }
        public String getRuleTagName() {
            return this.ruleTagName;
        }

        public GetQualityRuleTagListResponseBodyData setRuleTagId(Long ruleTagId) {
            this.ruleTagId = ruleTagId;
            return this;
        }
        public Long getRuleTagId() {
            return this.ruleTagId;
        }

    }

}
