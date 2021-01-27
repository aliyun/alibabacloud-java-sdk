// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("BusinessType")
    public String businessType;

    public static SetResellerUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserStatusRequest self = new SetResellerUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserStatusRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetResellerUserStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetResellerUserStatusRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
