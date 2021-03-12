// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentityCardOcrRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("FileInfo")
    public String fileInfo;

    @NameInMap("FileStoreType")
    public String fileStoreType;

    public static IdentityCardOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        IdentityCardOcrRequest self = new IdentityCardOcrRequest();
        return TeaModel.build(map, self);
    }

    public IdentityCardOcrRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public IdentityCardOcrRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public IdentityCardOcrRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public IdentityCardOcrRequest setFileStoreType(String fileStoreType) {
        this.fileStoreType = fileStoreType;
        return this;
    }
    public String getFileStoreType() {
        return this.fileStoreType;
    }

}
