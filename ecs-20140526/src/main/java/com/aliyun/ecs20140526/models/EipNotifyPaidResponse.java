// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipNotifyPaidResponse extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    public static EipNotifyPaidResponse build(java.util.Map<String, ?> map) throws Exception {
        EipNotifyPaidResponse self = new EipNotifyPaidResponse();
        return TeaModel.build(map, self);
    }

}
