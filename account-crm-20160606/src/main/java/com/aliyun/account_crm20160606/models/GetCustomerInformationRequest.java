// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerInformationRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    public static GetCustomerInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInformationRequest self = new GetCustomerInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerInformationRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
