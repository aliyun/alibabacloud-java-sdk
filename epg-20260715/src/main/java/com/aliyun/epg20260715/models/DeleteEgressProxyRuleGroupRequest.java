// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRuleGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p><strong>Note</strong>: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a check request and does not delete the rule group. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a regular request. If the check succeeds, the HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy rule group that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    public static DeleteEgressProxyRuleGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRuleGroupRequest self = new DeleteEgressProxyRuleGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRuleGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEgressProxyRuleGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteEgressProxyRuleGroupRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

}
