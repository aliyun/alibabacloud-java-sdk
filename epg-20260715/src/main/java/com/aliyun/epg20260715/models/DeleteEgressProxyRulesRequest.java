// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRulesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note: If you do not specify this parameter, the system automatically uses the request ID of the API request as the client token. The request ID of each API request is unique.</p>
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
     * <li><p><strong>true</strong>: performs only a dry run and does not delete the rules. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy rule group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <p>The IDs of the egress proxy rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EgressProxyRuleIds")
    public java.util.List<String> egressProxyRuleIds;

    public static DeleteEgressProxyRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRulesRequest self = new DeleteEgressProxyRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEgressProxyRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteEgressProxyRulesRequest setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public DeleteEgressProxyRulesRequest setEgressProxyRuleIds(java.util.List<String> egressProxyRuleIds) {
        this.egressProxyRuleIds = egressProxyRuleIds;
        return this;
    }
    public java.util.List<String> getEgressProxyRuleIds() {
        return this.egressProxyRuleIds;
    }

}
