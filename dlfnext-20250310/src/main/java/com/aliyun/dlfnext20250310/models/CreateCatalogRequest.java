// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CreateCatalogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>catalog_demo</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("optimizationConfig")
    public java.util.Map<String, String> optimizationConfig;

    @NameInMap("options")
    public java.util.Map<String, String> options;

    public static CreateCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCatalogRequest self = new CreateCatalogRequest();
        return TeaModel.build(map, self);
    }

    public CreateCatalogRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCatalogRequest setOptimizationConfig(java.util.Map<String, String> optimizationConfig) {
        this.optimizationConfig = optimizationConfig;
        return this;
    }
    public java.util.Map<String, String> getOptimizationConfig() {
        return this.optimizationConfig;
    }

    public CreateCatalogRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

}
