// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteAScriptsRequest extends TeaModel {
    /**
     * <p>The IDs of the programmable scripts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AScriptIds")
    public java.util.List<String> AScriptIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client and ensure that the value is unique among different requests. The client token can contain only ASCII characters. If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>f516e84e-fc0c-4c2d-a461-6cd77******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not delete the programmable scripts. The system checks whether required parameters are specified, the request format, and service limits. If the check fails, the system returns an error. If the check succeeds, the system returns the <code>DryRunOperation</code> error code.</li>
     * <li><strong>false</strong> (default): performs a regular request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</li>
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
