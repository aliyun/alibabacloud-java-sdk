// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateRequest extends TeaModel {
    @NameInMap("ExportablePrivateKey")
    public Boolean exportablePrivateKey;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("SubjectAlternativeNames")
    public java.util.Map<String, ?> subjectAlternativeNames;

    public static CreateCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequest self = new CreateCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequest setExportablePrivateKey(Boolean exportablePrivateKey) {
        this.exportablePrivateKey = exportablePrivateKey;
        return this;
    }
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    public CreateCertificateRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public CreateCertificateRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateCertificateRequest setSubjectAlternativeNames(java.util.Map<String, ?> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public java.util.Map<String, ?> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

}
