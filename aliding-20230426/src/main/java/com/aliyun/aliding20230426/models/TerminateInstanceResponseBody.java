// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TerminateInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static TerminateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateInstanceResponseBody self = new TerminateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateInstanceResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public TerminateInstanceResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
