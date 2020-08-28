// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static CreateResellerUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResellerUserQuotaResponse self = new CreateResellerUserQuotaResponse();
        return TeaModel.build(map, self);
    }

}
