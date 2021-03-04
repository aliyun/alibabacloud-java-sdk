// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteSecretResponseBody extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PlannedDeleteTime")
    public String plannedDeleteTime;

    public static DeleteSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponseBody self = new DeleteSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public DeleteSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecretResponseBody setPlannedDeleteTime(String plannedDeleteTime) {
        this.plannedDeleteTime = plannedDeleteTime;
        return this;
    }
    public String getPlannedDeleteTime() {
        return this.plannedDeleteTime;
    }

}
