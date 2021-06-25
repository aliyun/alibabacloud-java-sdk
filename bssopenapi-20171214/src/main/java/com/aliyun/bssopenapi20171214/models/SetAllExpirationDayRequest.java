// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetAllExpirationDayRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("UnifyExpireDay")
    public String unifyExpireDay;

    public static SetAllExpirationDayRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAllExpirationDayRequest self = new SetAllExpirationDayRequest();
        return TeaModel.build(map, self);
    }

    public SetAllExpirationDayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetAllExpirationDayRequest setUnifyExpireDay(String unifyExpireDay) {
        this.unifyExpireDay = unifyExpireDay;
        return this;
    }
    public String getUnifyExpireDay() {
        return this.unifyExpireDay;
    }

}
