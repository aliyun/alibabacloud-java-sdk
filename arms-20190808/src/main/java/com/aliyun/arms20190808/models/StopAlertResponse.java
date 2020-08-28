// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopAlertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static StopAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAlertResponse self = new StopAlertResponse();
        return TeaModel.build(map, self);
    }

}
