// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeWarehouseCertResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The status of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertStatus")
    public String certStatus;

    /**
     * <p>The type of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>OV</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The common name of the certificate subject. This field is empty if the certificate subject does not include a common name (CN).</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The content of the certificate, including the certificate chain.</p>
     * 
     * <strong>example:</strong>
     * <p>---BEGIN CERTIFICATE----- MIIF...... -----END CERTIFICATE-----</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The fingerprint of the certificate content.</p>
     * 
     * <strong>example:</strong>
     * <p>C1291AF83F48170E48140FDFE5DADC19FE51F261</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The common name (or organization name) of the issuer.</p>
     * 
     * <strong>example:</strong>
     * <p>Digicert</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The unique identifier of the issuer certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("IssuerIdentifier")
    public String issuerIdentifier;

    /**
     * <p>The instance ID of the private CA instance associated with the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
     */
    @NameInMap("PrivateCaInstanceId")
    public String privateCaInstanceId;

    /**
     * <p>The region ID of the private CA instance associated with the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("PrivateCaRegionId")
    public String privateCaRegionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The instance ID of the certificate warehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("WarehouseInstanceId")
    public String warehouseInstanceId;

    public static DescribeWarehouseCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarehouseCertResponseBody self = new DescribeWarehouseCertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWarehouseCertResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DescribeWarehouseCertResponseBody setCertStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public String getCertStatus() {
        return this.certStatus;
    }

    public DescribeWarehouseCertResponseBody setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public DescribeWarehouseCertResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public DescribeWarehouseCertResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeWarehouseCertResponseBody setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public DescribeWarehouseCertResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public DescribeWarehouseCertResponseBody setIssuerIdentifier(String issuerIdentifier) {
        this.issuerIdentifier = issuerIdentifier;
        return this;
    }
    public String getIssuerIdentifier() {
        return this.issuerIdentifier;
    }

    public DescribeWarehouseCertResponseBody setPrivateCaInstanceId(String privateCaInstanceId) {
        this.privateCaInstanceId = privateCaInstanceId;
        return this;
    }
    public String getPrivateCaInstanceId() {
        return this.privateCaInstanceId;
    }

    public DescribeWarehouseCertResponseBody setPrivateCaRegionId(String privateCaRegionId) {
        this.privateCaRegionId = privateCaRegionId;
        return this;
    }
    public String getPrivateCaRegionId() {
        return this.privateCaRegionId;
    }

    public DescribeWarehouseCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWarehouseCertResponseBody setWarehouseInstanceId(String warehouseInstanceId) {
        this.warehouseInstanceId = warehouseInstanceId;
        return this;
    }
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

}
