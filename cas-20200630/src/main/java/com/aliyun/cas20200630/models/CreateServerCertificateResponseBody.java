// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateResponseBody extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("ParentX509Certificate")
    public String parentX509Certificate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootX509Certificate")
    public String rootX509Certificate;

    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static CreateServerCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateResponseBody self = new CreateServerCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateServerCertificateResponseBody setParentX509Certificate(String parentX509Certificate) {
        this.parentX509Certificate = parentX509Certificate;
        return this;
    }
    public String getParentX509Certificate() {
        return this.parentX509Certificate;
    }

    public CreateServerCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServerCertificateResponseBody setRootX509Certificate(String rootX509Certificate) {
        this.rootX509Certificate = rootX509Certificate;
        return this;
    }
    public String getRootX509Certificate() {
        return this.rootX509Certificate;
    }

    public CreateServerCertificateResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
