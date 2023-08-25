// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UpdateAnycastEipAddressAssociationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAnycastEipAddressAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnycastEipAddressAssociationsResponseBody self = new UpdateAnycastEipAddressAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAnycastEipAddressAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
