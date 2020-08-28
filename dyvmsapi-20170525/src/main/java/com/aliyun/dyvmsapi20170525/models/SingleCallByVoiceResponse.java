// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceResponse extends TeaModel {
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

    public static SingleCallByVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceResponse self = new SingleCallByVoiceResponse();
        return TeaModel.build(map, self);
    }

}
