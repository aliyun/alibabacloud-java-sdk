// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetAliyunInstanceRouteSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAliyunInstanceRouteSaleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public GetAliyunInstanceRouteSaleResponseBody setData(GetAliyunInstanceRouteSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAliyunInstanceRouteSaleResponseBodyData getData() {
        return this.data;
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

    public GetAliyunInstanceRouteSaleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAliyunInstanceRouteSaleResponseBodyDataRoutList extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetAliyunInstanceRouteSaleResponseBodyDataRoutList build(java.util.Map<String, ?> map) throws Exception {
            GetAliyunInstanceRouteSaleResponseBodyDataRoutList self = new GetAliyunInstanceRouteSaleResponseBodyDataRoutList();
            return TeaModel.build(map, self);
        }

        public GetAliyunInstanceRouteSaleResponseBodyDataRoutList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetAliyunInstanceRouteSaleResponseBodyDataRoutList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetAliyunInstanceRouteSaleResponseBodyData extends TeaModel {
        @NameInMap("RoutList")
        public java.util.List<GetAliyunInstanceRouteSaleResponseBodyDataRoutList> routList;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetAliyunInstanceRouteSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAliyunInstanceRouteSaleResponseBodyData self = new GetAliyunInstanceRouteSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAliyunInstanceRouteSaleResponseBodyData setRoutList(java.util.List<GetAliyunInstanceRouteSaleResponseBodyDataRoutList> routList) {
            this.routList = routList;
            return this;
        }
        public java.util.List<GetAliyunInstanceRouteSaleResponseBodyDataRoutList> getRoutList() {
            return this.routList;
        }

        public GetAliyunInstanceRouteSaleResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
