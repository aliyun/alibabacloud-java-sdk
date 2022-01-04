// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetMenuDataStatusResponseBody extends TeaModel {
    // 数据批次ID（根据batchId查询）-选填
    @NameInMap("BatchId")
    public String batchId;

    // 状态码
    @NameInMap("Code")
    public String code;

    // 推送失败门店数量
    @NameInMap("Failed")
    public Long failed;

    // 推送失败菜单商品容器数据id
    @NameInMap("FailedProductContainerList")
    public java.util.List<String> failedProductContainerList;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 菜单商品容器数据id-选填
    @NameInMap("ProductContainerId")
    public String productContainerId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 推送门店总数(对于门店组数据，则实时计算当前门店组中门店数)
    @NameInMap("Total")
    public Long total;

    public static GetMenuDataStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMenuDataStatusResponseBody self = new GetMenuDataStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMenuDataStatusResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public GetMenuDataStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMenuDataStatusResponseBody setFailed(Long failed) {
        this.failed = failed;
        return this;
    }
    public Long getFailed() {
        return this.failed;
    }

    public GetMenuDataStatusResponseBody setFailedProductContainerList(java.util.List<String> failedProductContainerList) {
        this.failedProductContainerList = failedProductContainerList;
        return this;
    }
    public java.util.List<String> getFailedProductContainerList() {
        return this.failedProductContainerList;
    }

    public GetMenuDataStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMenuDataStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMenuDataStatusResponseBody setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

    public GetMenuDataStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMenuDataStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMenuDataStatusResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
