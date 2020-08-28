// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ScheduleKeyDeletionRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("PendingWindowInDays")
    public Integer pendingWindowInDays;

    public static ScheduleKeyDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        ScheduleKeyDeletionRequest self = new ScheduleKeyDeletionRequest();
        return TeaModel.build(map, self);
    }

}
