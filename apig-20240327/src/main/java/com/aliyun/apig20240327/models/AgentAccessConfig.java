// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentAccessConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable AI request logging. Default value if omitted: true.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("aiRequestLogEnabled")
    public Boolean aiRequestLogEnabled;

    /**
     * <p>The consumer authorization configuration for Agent access. If omitted, consumer authorization is not enabled.</p>
     */
    @NameInMap("authorization")
    public AgentAccessConfigAuthorization authorization;

    /**
     * <p>The base path of the Agent access entry. The path must start with a forward slash (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/agent</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>The list of domain name IDs bound to the Agent access entry. At least one domain name must be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>Specifies whether to remove the base path when forwarding requests to the backend. Default value if omitted: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("removeBasePathOnForward")
    public Boolean removeBasePathOnForward;

    public static AgentAccessConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentAccessConfig self = new AgentAccessConfig();
        return TeaModel.build(map, self);
    }

    public AgentAccessConfig setAiRequestLogEnabled(Boolean aiRequestLogEnabled) {
        this.aiRequestLogEnabled = aiRequestLogEnabled;
        return this;
    }
    public Boolean getAiRequestLogEnabled() {
        return this.aiRequestLogEnabled;
    }

    public AgentAccessConfig setAuthorization(AgentAccessConfigAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
    public AgentAccessConfigAuthorization getAuthorization() {
        return this.authorization;
    }

    public AgentAccessConfig setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public AgentAccessConfig setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public AgentAccessConfig setRemoveBasePathOnForward(Boolean removeBasePathOnForward) {
        this.removeBasePathOnForward = removeBasePathOnForward;
        return this;
    }
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
    }

    public static class AgentAccessConfigAuthorization extends TeaModel {
        /**
         * <p>The authentication type of the Agent access entry. Specify this parameter only when enabled is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Apikey</p>
         */
        @NameInMap("authType")
        public String authType;

        /**
         * <p>Specifies whether to enable consumer authorization. If set to true, authType must be specified and at least one principal must be provided. If set to false, no principals can be specified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of consumers or consumer groups that are granted Agent access permissions. At least one principal must be specified when enabled is set to true.</p>
         */
        @NameInMap("principals")
        public java.util.List<AgentAuthorizationPrincipal> principals;

        public static AgentAccessConfigAuthorization build(java.util.Map<String, ?> map) throws Exception {
            AgentAccessConfigAuthorization self = new AgentAccessConfigAuthorization();
            return TeaModel.build(map, self);
        }

        public AgentAccessConfigAuthorization setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public AgentAccessConfigAuthorization setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AgentAccessConfigAuthorization setPrincipals(java.util.List<AgentAuthorizationPrincipal> principals) {
            this.principals = principals;
            return this;
        }
        public java.util.List<AgentAuthorizationPrincipal> getPrincipals() {
            return this.principals;
        }

    }

}
