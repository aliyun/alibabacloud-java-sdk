// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetAllExpirationDayRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current unified expiration date settings only support unexpired ECS instances. Expired instances cannot be aligned to the unified expiration date. After the settings are complete, you can align the renewal time with the configured unified expiration time.</p>
     * <p>Valid values: 1 to 28, representing the 1st to the 28th day of each month.</p>
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
