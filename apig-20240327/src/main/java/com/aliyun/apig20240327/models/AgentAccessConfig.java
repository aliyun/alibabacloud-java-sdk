// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentAccessConfig extends TeaModel {
    @NameInMap("aiRequestLogEnabled")
    public Boolean aiRequestLogEnabled;

    @NameInMap("authorization")
    public AgentAccessConfigAuthorization authorization;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("basePath")
    public String basePath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

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
        @NameInMap("authType")
        public String authType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

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
