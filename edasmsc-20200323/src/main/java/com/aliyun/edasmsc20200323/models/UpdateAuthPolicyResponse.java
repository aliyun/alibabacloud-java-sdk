// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class UpdateAuthPolicyResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static UpdateAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthPolicyResponse self = new UpdateAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

}
