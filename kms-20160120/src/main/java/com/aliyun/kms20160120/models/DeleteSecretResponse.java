// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("PlannedDeleteTime")
    @Validation(required = true)
    public String plannedDeleteTime;

    public static DeleteSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponse self = new DeleteSecretResponse();
        return TeaModel.build(map, self);
    }

}
