// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolEnableStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <strong>example:</strong>
     * <p>89184F33-48A1-4401-9C0F-40E45DB091AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressPoolEnableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolEnableStatusResponseBody self = new UpdateCloudGtmAddressPoolEnableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressPoolEnableStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
