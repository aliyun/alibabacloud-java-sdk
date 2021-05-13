// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsEipAddressAttributeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEnsEipAddressAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsEipAddressAttributeResponseBody self = new ModifyEnsEipAddressAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEnsEipAddressAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
