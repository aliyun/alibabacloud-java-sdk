// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceMapResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<String> result;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static BatchUpdateFormDataByInstanceMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceMapResponseBody self = new BatchUpdateFormDataByInstanceMapResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateFormDataByInstanceMapResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public BatchUpdateFormDataByInstanceMapResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public BatchUpdateFormDataByInstanceMapResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
