// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static UpdateAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactResponse self = new UpdateAlertContactResponse();
        return TeaModel.build(map, self);
    }

}
