// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CustomerSensitiveInfoLogicalDeleteRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static CustomerSensitiveInfoLogicalDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerSensitiveInfoLogicalDeleteRequest self = new CustomerSensitiveInfoLogicalDeleteRequest();
        return TeaModel.build(map, self);
    }

    public CustomerSensitiveInfoLogicalDeleteRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
