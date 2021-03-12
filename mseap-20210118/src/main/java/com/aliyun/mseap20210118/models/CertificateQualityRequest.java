// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class CertificateQualityRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("FileInfo")
    public String fileInfo;

    @NameInMap("FileStoreType")
    public String fileStoreType;

    @NameInMap("CertificateType")
    public String certificateType;

    public static CertificateQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        CertificateQualityRequest self = new CertificateQualityRequest();
        return TeaModel.build(map, self);
    }

    public CertificateQualityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CertificateQualityRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CertificateQualityRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public CertificateQualityRequest setFileStoreType(String fileStoreType) {
        this.fileStoreType = fileStoreType;
        return this;
    }
    public String getFileStoreType() {
        return this.fileStoreType;
    }

    public CertificateQualityRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

}
