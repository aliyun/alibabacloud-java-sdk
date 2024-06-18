// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteAScriptsRequest extends TeaModel {
    /**
     * <p>The AScript rule IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AScriptIds")
    public java.util.List<String> AScriptIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>f516e84e-fc0c-4c2d-a461-6cd774a84dbd</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DeleteAScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAScriptsRequest self = new DeleteAScriptsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAScriptsRequest setAScriptIds(java.util.List<String> AScriptIds) {
        this.AScriptIds = AScriptIds;
        return this;
    }
    public java.util.List<String> getAScriptIds() {
        return this.AScriptIds;
    }

    public DeleteAScriptsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAScriptsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
