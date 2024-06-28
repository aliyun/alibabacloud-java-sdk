// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetCustomerAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoRequest self = new GetCustomerAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerAccountInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
