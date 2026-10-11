// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyConfigurationAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DefaultRulePhaseActions")
    public UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions defaultRulePhaseActions;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-gw80d16a969933e7****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyConfigurationName")
    public String egressProxyConfigurationName;

    @NameInMap("EgressProxyRuleGroups")
    public java.util.List<UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups> egressProxyRuleGroups;

    public static UpdateEgressProxyConfigurationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyConfigurationAttributeRequest self = new UpdateEgressProxyConfigurationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyConfigurationAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setDefaultRulePhaseActions(UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions defaultRulePhaseActions) {
        this.defaultRulePhaseActions = defaultRulePhaseActions;
        return this;
    }
    public UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions getDefaultRulePhaseActions() {
        return this.defaultRulePhaseActions;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setEgressProxyConfigurationName(String egressProxyConfigurationName) {
        this.egressProxyConfigurationName = egressProxyConfigurationName;
        return this;
    }
    public String getEgressProxyConfigurationName() {
        return this.egressProxyConfigurationName;
    }

    public UpdateEgressProxyConfigurationAttributeRequest setEgressProxyRuleGroups(java.util.List<UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups> egressProxyRuleGroups) {
        this.egressProxyRuleGroups = egressProxyRuleGroups;
        return this;
    }
    public java.util.List<UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
    }

    public static class UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PostResponse")
        public String postResponse;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PreDns")
        public String preDns;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PreRequest")
        public String preRequest;

        public static UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions self = new UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions setPostResponse(String postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public String getPostResponse() {
            return this.postResponse;
        }

        public UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions setPreDns(String preDns) {
            this.preDns = preDns;
            return this;
        }
        public String getPreDns() {
            return this.preDns;
        }

        public UpdateEgressProxyConfigurationAttributeRequestDefaultRulePhaseActions setPreRequest(String preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public String getPreRequest() {
            return this.preRequest;
        }

    }

    public static class UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-gw80bb6a95380edb****</p>
         */
        @NameInMap("EgressProxyRuleGroupId")
        public String egressProxyRuleGroupId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups self = new UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        public UpdateEgressProxyConfigurationAttributeRequestEgressProxyRuleGroups setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
