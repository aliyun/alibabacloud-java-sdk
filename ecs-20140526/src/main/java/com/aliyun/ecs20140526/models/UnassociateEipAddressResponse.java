// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class UnassociateEipAddressResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateEipAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateEipAddressResponse self = new UnassociateEipAddressResponse();
        return TeaModel.build(map, self);
    }

}
