// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDeliveryPlanResponseBody extends TeaModel {
    @NameInMap("arguments")
    public java.util.List<?> arguments;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static CreateDeliveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPlanResponseBody self = new CreateDeliveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPlanResponseBody setArguments(java.util.List<?> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<?> getArguments() {
        return this.arguments;
    }

    public CreateDeliveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeliveryPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDeliveryPlanResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CreateDeliveryPlanResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
