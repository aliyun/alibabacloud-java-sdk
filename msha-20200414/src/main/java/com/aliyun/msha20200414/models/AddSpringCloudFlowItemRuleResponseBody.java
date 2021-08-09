// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class AddSpringCloudFlowItemRuleResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public AddSpringCloudFlowItemRuleResponseBodyData data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static AddSpringCloudFlowItemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSpringCloudFlowItemRuleResponseBody self = new AddSpringCloudFlowItemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSpringCloudFlowItemRuleResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public AddSpringCloudFlowItemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSpringCloudFlowItemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSpringCloudFlowItemRuleResponseBody setData(AddSpringCloudFlowItemRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddSpringCloudFlowItemRuleResponseBodyData getData() {
        return this.data;
    }

    public AddSpringCloudFlowItemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddSpringCloudFlowItemRuleResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AddSpringCloudFlowItemRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AddSpringCloudFlowItemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSpringCloudFlowItemRuleResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public AddSpringCloudFlowItemRuleResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class AddSpringCloudFlowItemRuleResponseBodyData extends TeaModel {
        @NameInMap("pushPlanId")
        public Long pushPlanId;

        @NameInMap("ruleItemId")
        public Long ruleItemId;

        public static AddSpringCloudFlowItemRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddSpringCloudFlowItemRuleResponseBodyData self = new AddSpringCloudFlowItemRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddSpringCloudFlowItemRuleResponseBodyData setPushPlanId(Long pushPlanId) {
            this.pushPlanId = pushPlanId;
            return this;
        }
        public Long getPushPlanId() {
            return this.pushPlanId;
        }

        public AddSpringCloudFlowItemRuleResponseBodyData setRuleItemId(Long ruleItemId) {
            this.ruleItemId = ruleItemId;
            return this;
        }
        public Long getRuleItemId() {
            return this.ruleItemId;
        }

    }

}
