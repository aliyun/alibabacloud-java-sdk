// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static StartAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAlertResponse self = new StartAlertResponse();
        return TeaModel.build(map, self);
    }

}
