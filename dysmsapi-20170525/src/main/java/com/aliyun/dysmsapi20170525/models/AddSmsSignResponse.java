// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SignName")
    @Validation(required = true)
    public String signName;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static AddSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmsSignResponse self = new AddSmsSignResponse();
        return TeaModel.build(map, self);
    }

}
