// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadPCACertRequest extends TeaModel {
    /**
     * <p>The content of the certificate and its chain, in PEM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- MIIEJDCCAwygAwIBAgIQITRHItTLTQizTyd3K7AMRTANBgkqhkiG9w0BAQsFADBe **************** 5/akmr2GK/Y= -----END CERTIFICATE----- -----BEGIN CERTIFICATE----- MIIDuzCCAqOgAwIBAgIQSEIWDPfWTDKZcWNyL2O+fjANBgkqhkiG9w0BAQsFADBf **************** URUHyMW5Qd5Q9g6Y4sDOIm6It9TF7EjpwMs42R30agcRYzuUsN72ZFBYFJwnBX8= -----END CERTIFICATE----- -----BEGIN CERTIFICATE----- MIIDizCCAnOgAwIBAgIRAMfjPkDKfELTo07l3A3cUSYwDQYJKoZIhvcNAQELBQAw ********* CjWTnYPhCcO2uIcnqMt7zCVs5LXBK/XSwlAXKMvKT0uuzw9VxeMfEabflKu0By8= -----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>A custom name for the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cert_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The private key of the certificate, in PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- MIIEowIBAAKCAQEA5SIfpNCBoiDrZhX1H39CHwQMVD0kBNeBTWfP9xkeesvfzbOz ******* POVNFfDf9h7pJtQ5fRZNTYTDs/d+cH62Z3+nS74mNnEfff0nkvne -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The ID of the certificate warehouse.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> to obtain this ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static UploadPCACertRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPCACertRequest self = new UploadPCACertRequest();
        return TeaModel.build(map, self);
    }

    public UploadPCACertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public UploadPCACertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadPCACertRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadPCACertRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
