// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetIdentityRegistrationByCustomerRequest extends TeaModel {
    @NameInMap("CustomerId")
    public String customerId;

    public static GetIdentityRegistrationByCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityRegistrationByCustomerRequest self = new GetIdentityRegistrationByCustomerRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityRegistrationByCustomerRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

}
