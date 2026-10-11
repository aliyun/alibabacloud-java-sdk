// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class AttachEgressProxyRuleGroupsToConfigurationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not attach the egress proxy rule groups. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, the system returns an HTTP 2xx status code and performs the operation.</p>
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
     * <p>epc-uf609a6a8fdf9f4d****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The list of egress proxy rule group references to be attached to the egress proxy configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EgressProxyRuleGroups")
    public java.util.List<AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups> egressProxyRuleGroups;

    public static AttachEgressProxyRuleGroupsToConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEgressProxyRuleGroupsToConfigurationRequest self = new AttachEgressProxyRuleGroupsToConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public AttachEgressProxyRuleGroupsToConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachEgressProxyRuleGroupsToConfigurationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachEgressProxyRuleGroupsToConfigurationRequest setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public AttachEgressProxyRuleGroupsToConfigurationRequest setEgressProxyRuleGroups(java.util.List<AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups> egressProxyRuleGroups) {
        this.egressProxyRuleGroups = egressProxyRuleGroups;
        return this;
    }
    public java.util.List<AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
    }

    public static class AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups extends TeaModel {
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
         * <p>The priority of the egress proxy rule group in the egress proxy configuration. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups self = new AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups();
            return TeaModel.build(map, self);
        }

        public AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        public AttachEgressProxyRuleGroupsToConfigurationRequestEgressProxyRuleGroups setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
