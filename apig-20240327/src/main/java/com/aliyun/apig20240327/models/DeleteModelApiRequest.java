// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteModelApiRequest extends TeaModel {
    /**
     * <p>The idempotency token. Using the original clientToken for the same tenant, model API, and parameters allows you to retry the deletion if a background deletion fails. A conflict is returned if an active operation is still in progress or if the configuration has been replaced by a newer operation. A replay of a fully completed deletion returns a successful response with empty content, but using the same token for a different target is still rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>delete-model-api-client-token-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. If you set this parameter to true, the system performs the same synchronous validation checks as a real deletion, but does not create a deletion execution or idempotent record, stop the service, or delete the API or associated configurations. If you set this parameter to false or leave it empty, the actual deletion is accepted.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static DeleteModelApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelApiRequest self = new DeleteModelApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelApiRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteModelApiRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
