// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTemplateResponseBody body;

    public static CreateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponse self = new CreateTemplateResponse();
        return TeaModel.build(map, self);
    }

}
