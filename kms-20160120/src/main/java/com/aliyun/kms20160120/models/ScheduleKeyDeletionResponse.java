// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ScheduleKeyDeletionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ScheduleKeyDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        ScheduleKeyDeletionResponse self = new ScheduleKeyDeletionResponse();
        return TeaModel.build(map, self);
    }

}
