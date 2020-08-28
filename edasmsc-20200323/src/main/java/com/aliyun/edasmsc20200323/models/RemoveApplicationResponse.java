// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class RemoveApplicationResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static RemoveApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApplicationResponse self = new RemoveApplicationResponse();
        return TeaModel.build(map, self);
    }

}
