// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static AddSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmsTemplateResponse self = new AddSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

}
