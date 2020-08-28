// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class RemoveOutlierPolicyResponse extends TeaModel {
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

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static RemoveOutlierPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveOutlierPolicyResponse self = new RemoveOutlierPolicyResponse();
        return TeaModel.build(map, self);
    }

}
