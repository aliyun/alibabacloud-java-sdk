// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillParamsResponse extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static EipFillParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        EipFillParamsResponse self = new EipFillParamsResponse();
        return TeaModel.build(map, self);
    }

}
