// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UpdateAnycastEipAddressAssociationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
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
