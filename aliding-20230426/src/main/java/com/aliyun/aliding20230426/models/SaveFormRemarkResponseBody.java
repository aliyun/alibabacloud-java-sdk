// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveFormRemarkResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Long result;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static SaveFormRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveFormRemarkResponseBody self = new SaveFormRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveFormRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveFormRemarkResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public SaveFormRemarkResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public SaveFormRemarkResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
