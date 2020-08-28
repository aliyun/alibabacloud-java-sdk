// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateResponse extends TeaModel {
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

    public static DeleteSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateResponse self = new DeleteSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

}
