// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageResponseBody extends TeaModel {
    /**
     * <p>The name of the secret.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version to which you want to apply the specified stage label.</p>
     * <br>
     * <p>> * You must specify at least one of the RemoveFromVersion and MoveToVersion parameters.</p>
     * <p>> * If the VersionStage parameter is set to ACSCurrent or ACSPrevious, this parameter is required.</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretVersionStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageResponseBody self = new UpdateSecretVersionStageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretVersionStageResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
