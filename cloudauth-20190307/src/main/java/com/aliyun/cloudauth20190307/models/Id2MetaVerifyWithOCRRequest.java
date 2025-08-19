// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id2MetaVerifyWithOCRRequest extends TeaModel {
    /**
     * <p>Input stream for the portrait side of the ID card image.
     * Choose one between CertUrl and CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("CertFile")
    public String certFile;

    /**
     * <p>National emblem side of the ID card image address.
     * Choose one between CertNationalUrl and CertNationalFile, or omit both.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("CertNationalFile")
    public String certNationalFile;

    /**
     * <p>National emblem side of the ID card image URL. National emblem side
     * A publicly accessible HTTP or HTTPS link.
     * Choose one between CertNationalUrl and CertNationalFile, or omit both.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertNationalUrl")
    public String certNationalUrl;

    /**
     * <p>Portrait side of the ID card image.
     * A publicly accessible HTTP or HTTPS link.
     * Choose one between CertUrl and CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertUrl")
    public String certUrl;

    public static Id2MetaVerifyWithOCRRequest build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaVerifyWithOCRRequest self = new Id2MetaVerifyWithOCRRequest();
        return TeaModel.build(map, self);
    }

    public Id2MetaVerifyWithOCRRequest setCertFile(String certFile) {
        this.certFile = certFile;
        return this;
    }
    public String getCertFile() {
        return this.certFile;
    }

    public Id2MetaVerifyWithOCRRequest setCertNationalFile(String certNationalFile) {
        this.certNationalFile = certNationalFile;
        return this;
    }
    public String getCertNationalFile() {
        return this.certNationalFile;
    }

    public Id2MetaVerifyWithOCRRequest setCertNationalUrl(String certNationalUrl) {
        this.certNationalUrl = certNationalUrl;
        return this;
    }
    public String getCertNationalUrl() {
        return this.certNationalUrl;
    }

    public Id2MetaVerifyWithOCRRequest setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

}
