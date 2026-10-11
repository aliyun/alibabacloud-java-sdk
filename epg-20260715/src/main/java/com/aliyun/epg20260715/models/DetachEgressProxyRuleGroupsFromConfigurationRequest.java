// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DetachEgressProxyRuleGroupsFromConfigurationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is unique.</p>
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
     * <li><p><strong>true</strong>: Sends a check request and does not disassociate the egress proxy rule groups. The check items include whether the required parameters are specified, the request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. After the check succeeds, an HTTP 2xx status code is returned and the operation is directly executed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-hn302f6a9a284c4****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The IDs of the egress proxy rule groups to be disassociated from the egress proxy configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EgressProxyRuleGroupIds")
    public java.util.List<String> egressProxyRuleGroupIds;

    public static DetachEgressProxyRuleGroupsFromConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEgressProxyRuleGroupsFromConfigurationRequest self = new DetachEgressProxyRuleGroupsFromConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DetachEgressProxyRuleGroupsFromConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachEgressProxyRuleGroupsFromConfigurationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachEgressProxyRuleGroupsFromConfigurationRequest setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public DetachEgressProxyRuleGroupsFromConfigurationRequest setEgressProxyRuleGroupIds(java.util.List<String> egressProxyRuleGroupIds) {
        this.egressProxyRuleGroupIds = egressProxyRuleGroupIds;
        return this;
    }
    public java.util.List<String> getEgressProxyRuleGroupIds() {
        return this.egressProxyRuleGroupIds;
    }

}
