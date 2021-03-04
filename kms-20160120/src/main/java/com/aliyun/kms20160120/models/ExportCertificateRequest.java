// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public String certificateId;

    @NameInMap("Passphrase")
    public String passphrase;

    @NameInMap("ExportFormat")
    public String exportFormat;

    public static ExportCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCertificateRequest self = new ExportCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ExportCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public ExportCertificateRequest setPassphrase(String passphrase) {
        this.passphrase = passphrase;
        return this;
    }
    public String getPassphrase() {
        return this.passphrase;
    }

    public ExportCertificateRequest setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
        return this;
    }
    public String getExportFormat() {
        return this.exportFormat;
    }

}
