// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceConfigUnified extends TeaModel {
    /**
     * <p>The unique instance ID.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The raw string value of the legacy configuration, used for backward compatibility.</p>
     */
    @NameInMap("legacyRaw")
    public String legacyRaw;

    /**
     * <p>The legacy type of the data source, used for backward compatibility.</p>
     */
    @NameInMap("legacyType")
    public String legacyType;

    /**
     * <p>The product category of the data source.</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The type of the data source.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static DatasourceConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        DatasourceConfigUnified self = new DatasourceConfigUnified();
        return TeaModel.build(map, self);
    }

    public DatasourceConfigUnified setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DatasourceConfigUnified setLegacyRaw(String legacyRaw) {
        this.legacyRaw = legacyRaw;
        return this;
    }
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    public DatasourceConfigUnified setLegacyType(String legacyType) {
        this.legacyType = legacyType;
        return this;
    }
    public String getLegacyType() {
        return this.legacyType;
    }

    public DatasourceConfigUnified setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public DatasourceConfigUnified setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DatasourceConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
