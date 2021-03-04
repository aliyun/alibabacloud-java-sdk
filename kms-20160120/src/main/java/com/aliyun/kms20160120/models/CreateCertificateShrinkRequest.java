// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateShrinkRequest extends TeaModel {
    @NameInMap("Subject")
    public String subject;

    @NameInMap("SubjectAlternativeNames")
    public String subjectAlternativeNamesShrink;

    @NameInMap("KeySpec")
    public String keySpec;

    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    public static CreateCertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateShrinkRequest self = new CreateCertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateCertificateShrinkRequest setSubjectAlternativeNamesShrink(String subjectAlternativeNamesShrink) {
        this.subjectAlternativeNamesShrink = subjectAlternativeNamesShrink;
        return this;
    }
    public String getSubjectAlternativeNamesShrink() {
        return this.subjectAlternativeNamesShrink;
    }

    public CreateCertificateShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public CreateCertificateShrinkRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

}
