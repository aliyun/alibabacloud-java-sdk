// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class CheckBusinessRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    public static CheckBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBusinessRequest self = new CheckBusinessRequest();
        return TeaModel.build(map, self);
    }

    public CheckBusinessRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

}
