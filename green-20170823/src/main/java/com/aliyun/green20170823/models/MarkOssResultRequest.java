// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkOssResultRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Stock")
    public Boolean stock;

    public static MarkOssResultRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkOssResultRequest self = new MarkOssResultRequest();
        return TeaModel.build(map, self);
    }

    public MarkOssResultRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public MarkOssResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MarkOssResultRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public MarkOssResultRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public MarkOssResultRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public MarkOssResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public MarkOssResultRequest setStock(Boolean stock) {
        this.stock = stock;
        return this;
    }
    public Boolean getStock() {
        return this.stock;
    }

}
