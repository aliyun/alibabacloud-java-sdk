// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteCloudGtmAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmAddressResponseBody self = new DeleteCloudGtmAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCloudGtmAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
