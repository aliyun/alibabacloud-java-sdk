// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CallId")
    @Validation(required = true)
    public String callId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static SingleCallByTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByTtsResponse self = new SingleCallByTtsResponse();
        return TeaModel.build(map, self);
    }

}
