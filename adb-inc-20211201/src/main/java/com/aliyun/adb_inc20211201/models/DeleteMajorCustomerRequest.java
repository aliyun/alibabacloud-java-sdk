// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteMajorCustomerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomerId")
    public Long customerId;

    public static DeleteMajorCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMajorCustomerRequest self = new DeleteMajorCustomerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMajorCustomerRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

}
