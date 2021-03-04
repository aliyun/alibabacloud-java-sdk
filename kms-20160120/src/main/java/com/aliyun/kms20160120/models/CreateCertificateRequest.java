// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateRequest extends TeaModel {
    @NameInMap("Subject")
    public String subject;

    @NameInMap("SubjectAlternativeNames")
    public java.util.Map<String, ?> subjectAlternativeNames;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    public static CreateCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequest self = new CreateCertificateRequest();
        return TeaModel.build(map, self);
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

    public CreateCertificateRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public CreateCertificateRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

}
