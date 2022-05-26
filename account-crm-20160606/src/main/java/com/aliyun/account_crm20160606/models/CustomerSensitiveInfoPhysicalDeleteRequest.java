// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CustomerSensitiveInfoPhysicalDeleteRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    public static CustomerSensitiveInfoPhysicalDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerSensitiveInfoPhysicalDeleteRequest self = new CustomerSensitiveInfoPhysicalDeleteRequest();
        return TeaModel.build(map, self);
    }

    public CustomerSensitiveInfoPhysicalDeleteRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
