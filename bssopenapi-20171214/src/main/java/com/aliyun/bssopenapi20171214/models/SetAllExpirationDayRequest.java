// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetAllExpirationDayRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The expiration date. You can set an expiration date only for ECS instances that have not expired. The expiration date that you specify do not take effect on expired ECS instances. After the expiration date is set, the expiration date is used when you renew ECS instances.</p>
     * <p>You can set the expiration date to a day from the 1st to the 28th of each month.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
