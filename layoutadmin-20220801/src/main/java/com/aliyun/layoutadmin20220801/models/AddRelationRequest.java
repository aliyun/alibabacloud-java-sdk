// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class AddRelationRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("UserId")
    public String userId;

    public static AddRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRelationRequest self = new AddRelationRequest();
        return TeaModel.build(map, self);
    }

    public AddRelationRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public AddRelationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
