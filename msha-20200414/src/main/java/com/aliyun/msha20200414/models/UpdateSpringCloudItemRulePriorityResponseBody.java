// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudItemRulePriorityResponseBody extends TeaModel {
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

    public static UpdateSpringCloudItemRulePriorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudItemRulePriorityResponseBody self = new UpdateSpringCloudItemRulePriorityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public UpdateSpringCloudItemRulePriorityResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

}
