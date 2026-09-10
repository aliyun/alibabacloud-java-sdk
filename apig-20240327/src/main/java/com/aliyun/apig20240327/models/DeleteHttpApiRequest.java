// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteHttpApiRequest extends TeaModel {
    /**
     * <p>The idempotence token. If you call this operation multiple times for the same HTTP API by using the same clientToken value and the same delete request parameters, the result of the first successful call is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>delete-http-api-client-token-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. If set to true, all synchronous validations identical to an actual deletion are executed (including admission checks such as whether a published API can be deleted), but the API is not deleted, no associated configurations are cleaned up, and no side effects are produced. If this parameter is not specified or is set to false, the behavior is the same as the existing version.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static DeleteHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpApiRequest self = new DeleteHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHttpApiRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteHttpApiRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
