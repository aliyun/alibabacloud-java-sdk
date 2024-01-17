// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExecuteBatchTaskResponseBody extends TeaModel {
    @NameInMap("failNumber")
    public Integer failNumber;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("successNumber")
    public Integer successNumber;

    @NameInMap("total")
    public Integer total;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static ExecuteBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteBatchTaskResponseBody self = new ExecuteBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteBatchTaskResponseBody setFailNumber(Integer failNumber) {
        this.failNumber = failNumber;
        return this;
    }
    public Integer getFailNumber() {
        return this.failNumber;
    }

    public ExecuteBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteBatchTaskResponseBody setSuccessNumber(Integer successNumber) {
        this.successNumber = successNumber;
        return this;
    }
    public Integer getSuccessNumber() {
        return this.successNumber;
    }

    public ExecuteBatchTaskResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ExecuteBatchTaskResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ExecuteBatchTaskResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
