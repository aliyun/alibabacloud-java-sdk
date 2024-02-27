// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadCsrRequest extends TeaModel {
    @NameInMap("Csr")
    public String csr;

    @NameInMap("Key")
    public String key;

    @NameInMap("Name")
    public String name;

    public static UploadCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCsrRequest self = new UploadCsrRequest();
        return TeaModel.build(map, self);
    }

    public UploadCsrRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public UploadCsrRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UploadCsrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
