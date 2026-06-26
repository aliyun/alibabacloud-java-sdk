// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListSAMLIdentityProviderCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("X509Certificates")
    public java.util.List<ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates> x509Certificates;

    public static ListSAMLIdentityProviderCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSAMLIdentityProviderCertificatesResponseBody self = new ListSAMLIdentityProviderCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSAMLIdentityProviderCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSAMLIdentityProviderCertificatesResponseBody setX509Certificates(java.util.List<ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates> x509Certificates) {
        this.x509Certificates = x509Certificates;
        return this;
    }
    public java.util.List<ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates> getX509Certificates() {
        return this.x509Certificates;
    }

    public static class ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        @NameInMap("X509Certificate")
        public String x509Certificate;

        public static ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates build(java.util.Map<String, ?> map) throws Exception {
            ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates self = new ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates();
            return TeaModel.build(map, self);
        }

        public ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListSAMLIdentityProviderCertificatesResponseBodyX509Certificates setX509Certificate(String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public String getX509Certificate() {
            return this.x509Certificate;
        }

    }

}
