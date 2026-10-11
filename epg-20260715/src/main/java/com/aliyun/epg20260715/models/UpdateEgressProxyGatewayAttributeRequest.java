// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyGatewayAttributeRequest extends TeaModel {
    @NameInMap("AddListenerProperties")
    public java.util.List<UpdateEgressProxyGatewayAttributeRequestAddListenerProperties> addListenerProperties;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("DefaultEgressProxyIpPoolId")
    public String defaultEgressProxyIpPoolId;

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
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyGatewayName")
    public String egressProxyGatewayName;

    @NameInMap("RemoveListenerProperties")
    public java.util.List<UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties> removeListenerProperties;

    @NameInMap("TlsInterceptProperties")
    public UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties tlsInterceptProperties;

    public static UpdateEgressProxyGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyGatewayAttributeRequest self = new UpdateEgressProxyGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyGatewayAttributeRequest setAddListenerProperties(java.util.List<UpdateEgressProxyGatewayAttributeRequestAddListenerProperties> addListenerProperties) {
        this.addListenerProperties = addListenerProperties;
        return this;
    }
    public java.util.List<UpdateEgressProxyGatewayAttributeRequestAddListenerProperties> getAddListenerProperties() {
        return this.addListenerProperties;
    }

    public UpdateEgressProxyGatewayAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEgressProxyGatewayAttributeRequest setDefaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
        this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
        return this;
    }
    public String getDefaultEgressProxyIpPoolId() {
        return this.defaultEgressProxyIpPoolId;
    }

    public UpdateEgressProxyGatewayAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEgressProxyGatewayAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateEgressProxyGatewayAttributeRequest setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    public UpdateEgressProxyGatewayAttributeRequest setEgressProxyGatewayName(String egressProxyGatewayName) {
        this.egressProxyGatewayName = egressProxyGatewayName;
        return this;
    }
    public String getEgressProxyGatewayName() {
        return this.egressProxyGatewayName;
    }

    public UpdateEgressProxyGatewayAttributeRequest setRemoveListenerProperties(java.util.List<UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties> removeListenerProperties) {
        this.removeListenerProperties = removeListenerProperties;
        return this;
    }
    public java.util.List<UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties> getRemoveListenerProperties() {
        return this.removeListenerProperties;
    }

    public UpdateEgressProxyGatewayAttributeRequest setTlsInterceptProperties(UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties tlsInterceptProperties) {
        this.tlsInterceptProperties = tlsInterceptProperties;
        return this;
    }
    public UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties getTlsInterceptProperties() {
        return this.tlsInterceptProperties;
    }

    public static class UpdateEgressProxyGatewayAttributeRequestAddListenerProperties extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17486</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static UpdateEgressProxyGatewayAttributeRequestAddListenerProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyGatewayAttributeRequestAddListenerProperties self = new UpdateEgressProxyGatewayAttributeRequestAddListenerProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyGatewayAttributeRequestAddListenerProperties setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateEgressProxyGatewayAttributeRequestAddListenerProperties setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32720</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties self = new UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateEgressProxyGatewayAttributeRequestRemoveListenerProperties setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1f01a6f9-a0e7-64e5-9d3c-29c056****</p>
         */
        @NameInMap("PrivateCaCertificateId")
        public String privateCaCertificateId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("TlsInterceptMode")
        public String tlsInterceptMode;

        public static UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties self = new UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties();
            return TeaModel.build(map, self);
        }

        public UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties setPrivateCaCertificateId(String privateCaCertificateId) {
            this.privateCaCertificateId = privateCaCertificateId;
            return this;
        }
        public String getPrivateCaCertificateId() {
            return this.privateCaCertificateId;
        }

        public UpdateEgressProxyGatewayAttributeRequestTlsInterceptProperties setTlsInterceptMode(String tlsInterceptMode) {
            this.tlsInterceptMode = tlsInterceptMode;
            return this;
        }
        public String getTlsInterceptMode() {
            return this.tlsInterceptMode;
        }

    }

}
