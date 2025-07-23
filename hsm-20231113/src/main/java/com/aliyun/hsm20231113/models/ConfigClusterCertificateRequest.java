// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterCertificateRequest extends TeaModel {
    /**
     * <p>The cluster certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIDaTCCAlECAQEwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCY24xCzAJBgNV
     * BAgMAnpqMQswCQYDVQQHDAJoejEWMBQGA1UECgwNQWxpYmFiYSBDbG91ZDEUMBIG
     * A1UECwwLU2VjQ2xvdWRIc20wHhcNMjQwNzAzM****-----END CERTIFICATE-----</p>
     */
    @NameInMap("ClusterCertificate")
    public String clusterCertificate;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-BqxX63Bsg****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The self-signed certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIDfTCCAmWgAwIBAgIJAMRqQMr5if66MA0GCSqGSIb3DQEBCwUAMFUxCzAJBgNV
     * BAYTAmNuMQswCQYDVQQIDAJ6ajELMAkGA1UEBwwCaHoxFjAUBgNVBAoMDUFsaWJh
     * YmEgQ2xvdWQxFDA****
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("IssuerCertificate")
    public String issuerCertificate;

    public static ConfigClusterCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterCertificateRequest self = new ConfigClusterCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigClusterCertificateRequest setClusterCertificate(String clusterCertificate) {
        this.clusterCertificate = clusterCertificate;
        return this;
    }
    public String getClusterCertificate() {
        return this.clusterCertificate;
    }

    public ConfigClusterCertificateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ConfigClusterCertificateRequest setIssuerCertificate(String issuerCertificate) {
        this.issuerCertificate = issuerCertificate;
        return this;
    }
    public String getIssuerCertificate() {
        return this.issuerCertificate;
    }

}
