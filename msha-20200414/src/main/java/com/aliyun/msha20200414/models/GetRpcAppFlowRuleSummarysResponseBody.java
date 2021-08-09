// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetRpcAppFlowRuleSummarysResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetRpcAppFlowRuleSummarysResponseBodyData> data;

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

    public static GetRpcAppFlowRuleSummarysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRpcAppFlowRuleSummarysResponseBody self = new GetRpcAppFlowRuleSummarysResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRpcAppFlowRuleSummarysResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setData(java.util.List<GetRpcAppFlowRuleSummarysResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRpcAppFlowRuleSummarysResponseBodyData> getData() {
        return this.data;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRpcAppFlowRuleSummarysResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetRpcAppFlowRuleSummarysResponseBodyData extends TeaModel {
        // SpringCloud应用规则状态。未配置,创建未生效,修改未生效,删除未生效,推送中,生效中,生效失败
        @NameInMap("status")
        public String status;

        // 推送计划的ID，可以查询推送计划
        @NameInMap("pushPlanId")
        public String pushPlanId;

        // 应用名称
        @NameInMap("appName")
        public String appName;

        // 生效的ItemRule的数量
        @NameInMap("activeCount")
        public Long activeCount;

        // 引流的单元格列表
        @NameInMap("cellFlags")
        public java.util.List<String> cellFlags;

        public static GetRpcAppFlowRuleSummarysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRpcAppFlowRuleSummarysResponseBodyData self = new GetRpcAppFlowRuleSummarysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRpcAppFlowRuleSummarysResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRpcAppFlowRuleSummarysResponseBodyData setPushPlanId(String pushPlanId) {
            this.pushPlanId = pushPlanId;
            return this;
        }
        public String getPushPlanId() {
            return this.pushPlanId;
        }

        public GetRpcAppFlowRuleSummarysResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetRpcAppFlowRuleSummarysResponseBodyData setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public GetRpcAppFlowRuleSummarysResponseBodyData setCellFlags(java.util.List<String> cellFlags) {
            this.cellFlags = cellFlags;
            return this;
        }
        public java.util.List<String> getCellFlags() {
            return this.cellFlags;
        }

    }

}
