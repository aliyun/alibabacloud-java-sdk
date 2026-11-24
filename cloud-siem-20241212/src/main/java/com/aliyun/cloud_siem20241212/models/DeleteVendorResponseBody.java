// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteVendorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVendorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVendorResponseBody self = new DeleteVendorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVendorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
