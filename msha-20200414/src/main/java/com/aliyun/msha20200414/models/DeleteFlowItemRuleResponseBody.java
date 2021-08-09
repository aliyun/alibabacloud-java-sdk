// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class DeleteFlowItemRuleResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Long data;

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

    public static DeleteFlowItemRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowItemRuleResponseBody self = new DeleteFlowItemRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowItemRuleResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DeleteFlowItemRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFlowItemRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowItemRuleResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteFlowItemRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteFlowItemRuleResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeleteFlowItemRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DeleteFlowItemRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFlowItemRuleResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DeleteFlowItemRuleResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

}
