// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateVendorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVendorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVendorResponseBody self = new UpdateVendorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVendorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
