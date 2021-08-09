// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowRulesResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    // 推送计划的ID
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

    public static CloseSpringCloudFlowRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowRulesResponseBody self = new CloseSpringCloudFlowRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public CloseSpringCloudFlowRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloseSpringCloudFlowRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseSpringCloudFlowRulesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CloseSpringCloudFlowRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CloseSpringCloudFlowRulesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CloseSpringCloudFlowRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CloseSpringCloudFlowRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloseSpringCloudFlowRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public CloseSpringCloudFlowRulesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

}
