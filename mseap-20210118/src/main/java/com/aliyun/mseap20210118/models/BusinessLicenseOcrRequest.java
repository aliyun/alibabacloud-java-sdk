// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class BusinessLicenseOcrRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("FileInfo")
    public String fileInfo;

    @NameInMap("FileStoreType")
    public String fileStoreType;

    @NameInMap("Lang")
    public String lang;

    public static BusinessLicenseOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        BusinessLicenseOcrRequest self = new BusinessLicenseOcrRequest();
        return TeaModel.build(map, self);
    }

    public BusinessLicenseOcrRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public BusinessLicenseOcrRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public BusinessLicenseOcrRequest setFileStoreType(String fileStoreType) {
        this.fileStoreType = fileStoreType;
        return this;
    }
    public String getFileStoreType() {
        return this.fileStoreType;
    }

    public BusinessLicenseOcrRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
