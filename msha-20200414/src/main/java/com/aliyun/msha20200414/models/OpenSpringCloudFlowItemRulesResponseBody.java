// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class OpenSpringCloudFlowItemRulesResponseBody extends TeaModel {
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

    public static OpenSpringCloudFlowItemRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenSpringCloudFlowItemRulesResponseBody self = new OpenSpringCloudFlowItemRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenSpringCloudFlowItemRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public OpenSpringCloudFlowItemRulesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

}
