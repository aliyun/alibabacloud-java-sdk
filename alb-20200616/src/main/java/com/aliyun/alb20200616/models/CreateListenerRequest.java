// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    @NameInMap("CaCertificates")
    public java.util.List<CreateListenerRequestCaCertificates> caCertificates;

    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DefaultActions")
    public java.util.List<CreateListenerRequestDefaultActions> defaultActions;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("ListenerDescription")
    public String listenerDescription;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("QuicConfig")
    public CreateListenerRequestQuicConfig quicConfig;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    @NameInMap("XForwardedForConfig")
    public CreateListenerRequestXForwardedForConfig XForwardedForConfig;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setCaCertificates(java.util.List<CreateListenerRequestCaCertificates> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCaCertificates> getCaCertificates() {
        return this.caCertificates;
    }

    public CreateListenerRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public CreateListenerRequest setCertificates(java.util.List<CreateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setDefaultActions(java.util.List<CreateListenerRequestDefaultActions> defaultActions) {
        this.defaultActions = defaultActions;
        return this;
    }
    public java.util.List<CreateListenerRequestDefaultActions> getDefaultActions() {
        return this.defaultActions;
    }

    public CreateListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateListenerRequest setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
        return this;
    }
    public Boolean getGzipEnabled() {
        return this.gzipEnabled;
    }

    public CreateListenerRequest setHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
        return this;
    }
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    public CreateListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateListenerRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public CreateListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateListenerRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateListenerRequest setQuicConfig(CreateListenerRequestQuicConfig quicConfig) {
        this.quicConfig = quicConfig;
        return this;
    }
    public CreateListenerRequestQuicConfig getQuicConfig() {
        return this.quicConfig;
    }

    public CreateListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateListenerRequest setXForwardedForConfig(CreateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public CreateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class CreateListenerRequestCaCertificates extends TeaModel {
        public static CreateListenerRequestCaCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCaCertificates self = new CreateListenerRequestCaCertificates();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateListenerRequestCertificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        public static CreateListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCertificates self = new CreateListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples self = new CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class CreateListenerRequestDefaultActionsForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateListenerRequestDefaultActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActionsForwardGroupConfig self = new CreateListenerRequestDefaultActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateListenerRequestDefaultActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        public CreateListenerRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        @NameInMap("Type")
        public String type;

        public static CreateListenerRequestDefaultActions build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActions self = new CreateListenerRequestDefaultActions();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActions setForwardGroupConfig(CreateListenerRequestDefaultActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateListenerRequestDefaultActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public CreateListenerRequestDefaultActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateListenerRequestQuicConfig extends TeaModel {
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        @NameInMap("QuicUpgradeEnabled")
        public Boolean quicUpgradeEnabled;

        public static CreateListenerRequestQuicConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestQuicConfig self = new CreateListenerRequestQuicConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestQuicConfig setQuicListenerId(String quicListenerId) {
            this.quicListenerId = quicListenerId;
            return this;
        }
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        public CreateListenerRequestQuicConfig setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = quicUpgradeEnabled;
            return this;
        }
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

    }

    public static class CreateListenerRequestXForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        @NameInMap("XForwardedForSLBPortEnabled")
        public Boolean XForwardedForSLBPortEnabled;

        public static CreateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestXForwardedForConfig self = new CreateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
            this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
            return this;
        }
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
            this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
            this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
            return this;
        }
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
            this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
            this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
            return this;
        }
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
            this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
            this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
            return this;
        }
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
            this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSourceIpsEnabled(Boolean XForwardedForClientSourceIpsEnabled) {
            this.XForwardedForClientSourceIpsEnabled = XForwardedForClientSourceIpsEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.XForwardedForClientSourceIpsEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSourceIpsTrusted(String XForwardedForClientSourceIpsTrusted) {
            this.XForwardedForClientSourceIpsTrusted = XForwardedForClientSourceIpsTrusted;
            return this;
        }
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.XForwardedForClientSourceIpsTrusted;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
            this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForEnabled(Boolean XForwardedForEnabled) {
            this.XForwardedForEnabled = XForwardedForEnabled;
            return this;
        }
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
            this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
            this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

    }

}
