// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class Id3MetaVerifyWithOCRRequest extends TeaModel {
    /**
     * <p>The input stream of the portrait side image of the ID card. Specify either CertUrl or CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("CertFile")
    public String certFile;

    /**
     * <p>The image of the national emblem side of the ID card. Specify either CertNationalUrl or CertNationalFile, or leave both empty.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("CertNationalFile")
    public String certNationalFile;

    /**
     * <p>The URL of the national emblem side image of the ID card. Specify a publicly accessible HTTP or HTTPS URL. Specify either CertNationalUrl or CertNationalFile, or leave both empty.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertNationalUrl")
    public String certNationalUrl;

    /**
     * <p>The image of the portrait side of the ID card. Specify a publicly accessible HTTP or HTTPS URL. Specify either CertUrl or CertFile.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com/cert.jpeg">https://www.aliyun.com/cert.jpeg</a></p>
     */
    @NameInMap("CertUrl")
    public String certUrl;

    public static Id3MetaVerifyWithOCRRequest build(java.util.Map<String, ?> map) throws Exception {
        Id3MetaVerifyWithOCRRequest self = new Id3MetaVerifyWithOCRRequest();
        return TeaModel.build(map, self);
    }

    public Id3MetaVerifyWithOCRRequest setCertFile(String certFile) {
        this.certFile = certFile;
        return this;
    }
    public String getCertFile() {
        return this.certFile;
    }

    public Id3MetaVerifyWithOCRRequest setCertNationalFile(String certNationalFile) {
        this.certNationalFile = certNationalFile;
        return this;
    }
    public String getCertNationalFile() {
        return this.certNationalFile;
    }

    public Id3MetaVerifyWithOCRRequest setCertNationalUrl(String certNationalUrl) {
        this.certNationalUrl = certNationalUrl;
        return this;
    }
    public String getCertNationalUrl() {
        return this.certNationalUrl;
    }

    public Id3MetaVerifyWithOCRRequest setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

}
