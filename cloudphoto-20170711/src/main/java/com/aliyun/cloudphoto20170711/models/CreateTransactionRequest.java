// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class CreateTransactionRequest extends TeaModel {
    @NameInMap("Size")
    public Long size;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("Force")
    public String force;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("LibraryId")
    public String libraryId;

    public static CreateTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionRequest self = new CreateTransactionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransactionRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CreateTransactionRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public CreateTransactionRequest setForce(String force) {
        this.force = force;
        return this;
    }
    public String getForce() {
        return this.force;
    }

    public CreateTransactionRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public CreateTransactionRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public CreateTransactionRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
