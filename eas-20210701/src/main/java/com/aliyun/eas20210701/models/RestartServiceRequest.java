// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class RestartServiceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: Performs a dry run without executing the actual operation. If the request fails the dry run, an error is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false: Sends a normal request.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static RestartServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartServiceRequest self = new RestartServiceRequest();
        return TeaModel.build(map, self);
    }

    public RestartServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
