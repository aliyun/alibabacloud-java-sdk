// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("annotations")
    public String annotations;

    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("description")
    public String description;

    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    @NameInMap("productName")
    public String productName;

    @NameInMap("prometheusUID")
    public String prometheusUID;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateProductRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateProductRequest setPrometheusUID(String prometheusUID) {
        this.prometheusUID = prometheusUID;
        return this;
    }
    public String getPrometheusUID() {
        return this.prometheusUID;
    }

}
