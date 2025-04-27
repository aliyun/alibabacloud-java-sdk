// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyWithOCRAdvanceRequest extends TeaModel {
    @NameInMap("CertFile")
    public java.io.InputStream certFileObject;

    @NameInMap("CertNationalFile")
    public java.io.InputStream certNationalFileObject;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertNationalUrl")
    public String certNationalUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertUrl")
    public String certUrl;

    public static Id2MetaVerifyWithOCRAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyWithOCRAdvanceRequest self = new Id2MetaVerifyWithOCRAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyWithOCRAdvanceRequest setCertFileObject(java.io.InputStream certFileObject) {
        this.certFileObject = certFileObject;
        return this;
    }
    public java.io.InputStream getCertFileObject() {
        return this.certFileObject;
    }

    public Id2MetaVerifyWithOCRAdvanceRequest setCertNationalFileObject(java.io.InputStream certNationalFileObject) {
        this.certNationalFileObject = certNationalFileObject;
        return this;
    }
    public java.io.InputStream getCertNationalFileObject() {
        return this.certNationalFileObject;
    }

    public Id2MetaVerifyWithOCRAdvanceRequest setCertNationalUrl(String certNationalUrl) {
        this.certNationalUrl = certNationalUrl;
        return this;
    }
    public String getCertNationalUrl() {
        return this.certNationalUrl;
    }

    public Id2MetaVerifyWithOCRAdvanceRequest setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

}
