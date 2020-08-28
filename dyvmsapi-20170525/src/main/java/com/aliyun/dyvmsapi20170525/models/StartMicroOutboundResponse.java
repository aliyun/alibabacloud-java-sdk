// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartMicroOutboundResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("CustomerInfo")
    @Validation(required = true)
    public String customerInfo;

    @NameInMap("InvokeCmdId")
    @Validation(required = true)
    public String invokeCmdId;

    @NameInMap("InvokeCreateTime")
    @Validation(required = true)
    public String invokeCreateTime;

    public static StartMicroOutboundResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundResponse self = new StartMicroOutboundResponse();
        return TeaModel.build(map, self);
    }

}
