// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class TransportEncryptionInfo extends TeaModel {
    @NameInMap("certificates")
    public java.util.List<TransportCertificateInfo> certificates;

    @NameInMap("deployError")
    public String deployError;

    @NameInMap("deployStatus")
    public String deployStatus;

    @NameInMap("http2Enabled")
    public Boolean http2Enabled;

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
