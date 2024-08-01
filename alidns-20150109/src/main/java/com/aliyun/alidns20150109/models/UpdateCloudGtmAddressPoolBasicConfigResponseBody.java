// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressPoolBasicConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolBasicConfigResponseBody self = new UpdateCloudGtmAddressPoolBasicConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressPoolBasicConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
