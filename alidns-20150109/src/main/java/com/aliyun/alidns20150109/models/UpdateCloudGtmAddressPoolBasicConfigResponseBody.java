// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolBasicConfigResponseBody extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("RequestId")
    public String requestId;

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
