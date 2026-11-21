// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpsertUmodelDataRequest extends TeaModel {
    /**
     * <p>The content of the elements.</p>
     */
    @NameInMap("elements")
    public java.util.List<?> elements;

    /**
     * <p>Specifies whether to perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li>true: sends a check request without performing actual changes.</li>
     * <li>false: sends a normal request.
     * Default value: false.</li>
     * </ul>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The method.</p>
     * 
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

    public UpsertUmodelDataRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpsertUmodelDataRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
