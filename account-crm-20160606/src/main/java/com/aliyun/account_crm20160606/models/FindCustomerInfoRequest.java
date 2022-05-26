// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerInfoRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    public static FindCustomerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerInfoRequest self = new FindCustomerInfoRequest();
        return TeaModel.build(map, self);
    }

    public FindCustomerInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
