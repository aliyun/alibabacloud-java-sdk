// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AllocationId")
    @Validation(required = true)
    public String allocationId;

    @NameInMap("EipAddress")
    @Validation(required = true)
    public String eipAddress;

    public static AllocateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressResponse self = new AllocateEipAddressResponse();
        return TeaModel.build(map, self);
    }

}
