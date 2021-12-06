// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddExternalSAMLIdPCertificateRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static AddExternalSAMLIdPCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddExternalSAMLIdPCertificateRequest self = new AddExternalSAMLIdPCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AddExternalSAMLIdPCertificateRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public AddExternalSAMLIdPCertificateRequest setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
