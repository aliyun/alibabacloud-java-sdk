// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadPCACertRequest extends TeaModel {
    @NameInMap("Cert")
    public String cert;

    @NameInMap("Name")
    public String name;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static UploadPCACertRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPCACertRequest self = new UploadPCACertRequest();
        return TeaModel.build(map, self);
    }

    public UploadPCACertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public UploadPCACertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadPCACertRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public UploadPCACertRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
