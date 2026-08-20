// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TransportEncryptionInfo extends TeaModel {
    /**
     * <p>The list of transport certificates added by the user.</p>
     */
    @NameInMap("certificates")
    public java.util.List<TransportCertificateInfo> certificates;

    /**
     * <p>The reason for the deployment failure.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("deployError")
    public String deployError;

    /**
     * <p>The submit status.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("deployStatus")
    public String deployStatus;

    /**
     * <p>Indicates whether HTTP/2 is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The TLS cipher suite policy.</p>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_2</p>
     */
    @NameInMap("tlsPolicy")
    public String tlsPolicy;

    public static TransportEncryptionInfo build(java.util.Map<String, ?> map) throws Exception {
        TransportEncryptionInfo self = new TransportEncryptionInfo();
        return TeaModel.build(map, self);
    }

    public TransportEncryptionInfo setCertificates(java.util.List<TransportCertificateInfo> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<TransportCertificateInfo> getCertificates() {
        return this.certificates;
    }

    public TransportEncryptionInfo setDeployError(String deployError) {
        this.deployError = deployError;
        return this;
    }
    public String getDeployError() {
        return this.deployError;
    }

    public TransportEncryptionInfo setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public TransportEncryptionInfo setHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
        return this;
    }
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    public TransportEncryptionInfo setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
        return this;
    }
    public String getTlsPolicy() {
        return this.tlsPolicy;
    }

}
