// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class VerifyImageSignatureResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value &quot;OK&quot; is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. The value <code>200</code> is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The issuer information.</p>
     */
    @NameInMap("Issuer")
    public VerifyImageSignatureResponseBodyIssuer issuer;

    /**
     * <p>Indicates whether the issuer is trusted. A value of true indicates that the issuer certificate is issued by a trusted CA.</p>
     */
    @NameInMap("IssuerTrusted")
    public Boolean issuerTrusted;

    /**
     * <p>The content credentials manifest information. This parameter is returned only when the image contains a C2PA signature.</p>
     */
    @NameInMap("Manifest")
    public VerifyImageSignatureResponseBodyManifest manifest;

    /**
     * <p>The additional information. The value <code>success</code> is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The signature verification status. Valid values:</p>
     * <ul>
     * <li>Valid: The signature is valid.</li>
     * <li>Invalid: The signature is invalid or has been tampered with.</li>
     * <li>Trusted: The signature is valid and trusted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Valid</p>
     */
    @NameInMap("VerificationState")
    public String verificationState;

    public static VerifyImageSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyImageSignatureResponseBody self = new VerifyImageSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyImageSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyImageSignatureResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public VerifyImageSignatureResponseBody setIssuer(VerifyImageSignatureResponseBodyIssuer issuer) {
        this.issuer = issuer;
        return this;
    }
    public VerifyImageSignatureResponseBodyIssuer getIssuer() {
        return this.issuer;
    }

    public VerifyImageSignatureResponseBody setIssuerTrusted(Boolean issuerTrusted) {
        this.issuerTrusted = issuerTrusted;
        return this;
    }
    public Boolean getIssuerTrusted() {
        return this.issuerTrusted;
    }

    public VerifyImageSignatureResponseBody setManifest(VerifyImageSignatureResponseBodyManifest manifest) {
        this.manifest = manifest;
        return this;
    }
    public VerifyImageSignatureResponseBodyManifest getManifest() {
        return this.manifest;
    }

    public VerifyImageSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyImageSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyImageSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifyImageSignatureResponseBody setVerificationState(String verificationState) {
        this.verificationState = verificationState;
        return this;
    }
    public String getVerificationState() {
        return this.verificationState;
    }

    public static class VerifyImageSignatureResponseBodyIssuer extends TeaModel {
        /**
         * <p>The common name (CN) of the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>AIDeepSign User Certificate</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The organization name (O) of the issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        @NameInMap("Organization")
        public String organization;

        public static VerifyImageSignatureResponseBodyIssuer build(java.util.Map<String, ?> map) throws Exception {
            VerifyImageSignatureResponseBodyIssuer self = new VerifyImageSignatureResponseBodyIssuer();
            return TeaModel.build(map, self);
        }

        public VerifyImageSignatureResponseBodyIssuer setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public VerifyImageSignatureResponseBodyIssuer setOrganization(String organization) {
            this.organization = organization;
            return this;
        }
        public String getOrganization() {
            return this.organization;
        }

    }

    public static class VerifyImageSignatureResponseBodyManifestAssertions extends TeaModel {
        /**
         * <p>The assertion data, which is detailed metadata in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;actions&quot;:[{&quot;action&quot;:&quot;c2pa.created&quot;}]}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The assertion label, such as c2pa.actions or stds.exif.</p>
         * 
         * <strong>example:</strong>
         * <p>c2pa.actions</p>
         */
        @NameInMap("Label")
        public String label;

        public static VerifyImageSignatureResponseBodyManifestAssertions build(java.util.Map<String, ?> map) throws Exception {
            VerifyImageSignatureResponseBodyManifestAssertions self = new VerifyImageSignatureResponseBodyManifestAssertions();
            return TeaModel.build(map, self);
        }

        public VerifyImageSignatureResponseBodyManifestAssertions setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public VerifyImageSignatureResponseBodyManifestAssertions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class VerifyImageSignatureResponseBodyManifestSignatureInfo extends TeaModel {
        /**
         * <p>The signature algorithm, such as <code>ps256</code> or <code>es256</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ps256</p>
         */
        @NameInMap("Alg")
        public String alg;

        /**
         * <p>The distinguished name (DN) of the signing certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>CN=AIDeepSign CA,O=Alibaba Cloud</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The signing time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T10:30:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        public static VerifyImageSignatureResponseBodyManifestSignatureInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyImageSignatureResponseBodyManifestSignatureInfo self = new VerifyImageSignatureResponseBodyManifestSignatureInfo();
            return TeaModel.build(map, self);
        }

        public VerifyImageSignatureResponseBodyManifestSignatureInfo setAlg(String alg) {
            this.alg = alg;
            return this;
        }
        public String getAlg() {
            return this.alg;
        }

        public VerifyImageSignatureResponseBodyManifestSignatureInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public VerifyImageSignatureResponseBodyManifestSignatureInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class VerifyImageSignatureResponseBodyManifest extends TeaModel {
        /**
         * <p>The list of assertions, which contains metadata such as the origin and editing history of the image.</p>
         */
        @NameInMap("Assertions")
        public java.util.List<VerifyImageSignatureResponseBodyManifestAssertions> assertions;

        /**
         * <p>The signature details.</p>
         */
        @NameInMap("SignatureInfo")
        public VerifyImageSignatureResponseBodyManifestSignatureInfo signatureInfo;

        public static VerifyImageSignatureResponseBodyManifest build(java.util.Map<String, ?> map) throws Exception {
            VerifyImageSignatureResponseBodyManifest self = new VerifyImageSignatureResponseBodyManifest();
            return TeaModel.build(map, self);
        }

        public VerifyImageSignatureResponseBodyManifest setAssertions(java.util.List<VerifyImageSignatureResponseBodyManifestAssertions> assertions) {
            this.assertions = assertions;
            return this;
        }
        public java.util.List<VerifyImageSignatureResponseBodyManifestAssertions> getAssertions() {
            return this.assertions;
        }

        public VerifyImageSignatureResponseBodyManifest setSignatureInfo(VerifyImageSignatureResponseBodyManifestSignatureInfo signatureInfo) {
            this.signatureInfo = signatureInfo;
            return this;
        }
        public VerifyImageSignatureResponseBodyManifestSignatureInfo getSignatureInfo() {
            return this.signatureInfo;
        }

    }

}
