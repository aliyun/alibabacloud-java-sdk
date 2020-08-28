// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindNumberAndVoipIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Module")
    @Validation(required = true)
    public String module;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static UnbindNumberAndVoipIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindNumberAndVoipIdResponse self = new UnbindNumberAndVoipIdResponse();
        return TeaModel.build(map, self);
    }

}
