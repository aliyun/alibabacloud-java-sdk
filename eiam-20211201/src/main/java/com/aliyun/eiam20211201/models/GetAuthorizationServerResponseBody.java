// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetAuthorizationServerResponseBody extends TeaModel {
    @NameInMap("AuthorizationServer")
    public GetAuthorizationServerResponseBodyAuthorizationServer authorizationServer;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthorizationServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationServerResponseBody self = new GetAuthorizationServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationServerResponseBody setAuthorizationServer(GetAuthorizationServerResponseBodyAuthorizationServer authorizationServer) {
        this.authorizationServer = authorizationServer;
        return this;
    }
    public GetAuthorizationServerResponseBodyAuthorizationServer getAuthorizationServer() {
        return this.authorizationServer;
    }

    public GetAuthorizationServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/token</a></p>
         */
        @NameInMap("Oauth2TokenEndpoint")
        public String oauth2TokenEndpoint;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks</a></p>
         */
        @NameInMap("OidcJwksEndpoint")
        public String oidcJwksEndpoint;

        public static GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint self = new GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint setOauth2TokenEndpoint(String oauth2TokenEndpoint) {
            this.oauth2TokenEndpoint = oauth2TokenEndpoint;
            return this;
        }
        public String getOauth2TokenEndpoint() {
            return this.oauth2TokenEndpoint;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint setOidcJwksEndpoint(String oidcJwksEndpoint) {
            this.oidcJwksEndpoint = oidcJwksEndpoint;
            return this;
        }
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

    }

    public static class GetAuthorizationServerResponseBodyAuthorizationServer extends TeaModel {
        /**
         * <p>IDaaS EIAM 授权服务器ID</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        @NameInMap("AuthorizationServerId")
        public String authorizationServerId;

        /**
         * <p>IDaaS EIAM 授权服务器名称</p>
         * 
         * <strong>example:</strong>
         * <p>System_Default</p>
         */
        @NameInMap("AuthorizationServerName")
        public String authorizationServerName;

        /**
         * <p>IDaaS EIAM 授权服务器创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1754620108295</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>创建类型：system_init-系统默认创建，jwt_credential_provider-JWT凭据提供商创建，user_custom-用户创建</p>
         * 
         * <strong>example:</strong>
         * <p>system_init</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>授权服务器描述</p>
         * 
         * <strong>example:</strong>
         * <p>description of authorization server</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qzljgbhtwnnsywtdbz7yzy2any</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM 授权token颁发者</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2">https://xxxx.aliyunidaas.com/api/v2/iauths_system/oauth2</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Issuer使用的域名，可为初始化域名或已添加的自定义域名</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.aliyunidaas.com</p>
         */
        @NameInMap("IssuerDomain")
        public String issuerDomain;

        /**
         * <p>Issuer模式：dynamic-动态基于请求域名，static-使用固定域名</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("IssuerMode")
        public String issuerMode;

        /**
         * <p>IDaaS EIAM 授权服务器最近更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1781608572164</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        @NameInMap("ProtocolEndpoint")
        public GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint protocolEndpoint;

        /**
         * <p>IDaaS EIAM 授权服务器状态，enabled启用，disabled禁用</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAuthorizationServerResponseBodyAuthorizationServer build(java.util.Map<String, ?> map) throws Exception {
            GetAuthorizationServerResponseBodyAuthorizationServer self = new GetAuthorizationServerResponseBodyAuthorizationServer();
            return TeaModel.build(map, self);
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setAuthorizationServerId(String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setAuthorizationServerName(String authorizationServerName) {
            this.authorizationServerName = authorizationServerName;
            return this;
        }
        public String getAuthorizationServerName() {
            return this.authorizationServerName;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setIssuerDomain(String issuerDomain) {
            this.issuerDomain = issuerDomain;
            return this;
        }
        public String getIssuerDomain() {
            return this.issuerDomain;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setIssuerMode(String issuerMode) {
            this.issuerMode = issuerMode;
            return this;
        }
        public String getIssuerMode() {
            return this.issuerMode;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setProtocolEndpoint(GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint protocolEndpoint) {
            this.protocolEndpoint = protocolEndpoint;
            return this;
        }
        public GetAuthorizationServerResponseBodyAuthorizationServerProtocolEndpoint getProtocolEndpoint() {
            return this.protocolEndpoint;
        }

        public GetAuthorizationServerResponseBodyAuthorizationServer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
