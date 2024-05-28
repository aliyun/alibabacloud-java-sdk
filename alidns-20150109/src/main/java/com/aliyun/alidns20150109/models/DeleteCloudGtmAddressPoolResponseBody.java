// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmAddressPoolResponseBody extends TeaModel {
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteCloudGtmAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmAddressPoolResponseBody self = new DeleteCloudGtmAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmAddressPoolResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public DeleteCloudGtmAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCloudGtmAddressPoolResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
