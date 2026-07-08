// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWarehouseRequest extends TeaModel {
    /**
     * <p>The use case of the certificate warehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>The name of the certificate warehouse.</p>
     * 
     * <strong>example:</strong>
     * <p>MyCertificateWarehouse</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the certificate warehouse. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>pcaCertificate</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWarehouseRequest self = new CreateWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public CreateWarehouseRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public CreateWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWarehouseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
