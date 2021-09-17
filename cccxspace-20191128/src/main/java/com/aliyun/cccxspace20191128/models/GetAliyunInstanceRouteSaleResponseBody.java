// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetAliyunInstanceRouteSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public java.util.List<GetAliyunInstanceRouteSaleResponseBodyData> data;

    public static GetAliyunInstanceRouteSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunInstanceRouteSaleResponseBody self = new GetAliyunInstanceRouteSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliyunInstanceRouteSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliyunInstanceRouteSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAliyunInstanceRouteSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAliyunInstanceRouteSaleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetAliyunInstanceRouteSaleResponseBody setData(java.util.List<GetAliyunInstanceRouteSaleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAliyunInstanceRouteSaleResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAliyunInstanceRouteSaleResponseBodyData extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetAliyunInstanceRouteSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAliyunInstanceRouteSaleResponseBodyData self = new GetAliyunInstanceRouteSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAliyunInstanceRouteSaleResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetAliyunInstanceRouteSaleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
