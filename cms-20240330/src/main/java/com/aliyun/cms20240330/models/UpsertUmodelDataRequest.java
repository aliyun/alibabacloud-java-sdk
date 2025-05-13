// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelDataRequest extends TeaModel {
    @NameInMap("elements")
    public java.util.List<?> elements;

    /**
     * <strong>example:</strong>
     * <p>Upsert</p>
     */
    @NameInMap("method")
    public String method;

    public static UpsertUmodelDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertUmodelDataRequest self = new UpsertUmodelDataRequest();
        return TeaModel.build(map, self);
    }

    public UpsertUmodelDataRequest setElements(java.util.List<?> elements) {
        this.elements = elements;
        return this;
    }
    public java.util.List<?> getElements() {
        return this.elements;
    }

    public UpsertUmodelDataRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
