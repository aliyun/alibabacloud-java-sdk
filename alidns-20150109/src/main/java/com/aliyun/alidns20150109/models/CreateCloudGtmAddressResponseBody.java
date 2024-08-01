// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>addr-8951821811436**192</p>
     */
    @NameInMap("AddressId")
    public String addressId;

    /**
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCloudGtmAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmAddressResponseBody self = new CreateCloudGtmAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmAddressResponseBody setAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }
    public String getAddressId() {
        return this.addressId;
    }

    public CreateCloudGtmAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudGtmAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
