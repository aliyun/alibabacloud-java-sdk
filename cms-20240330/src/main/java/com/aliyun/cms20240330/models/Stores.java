// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Stores extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> The SLS project name. This field has been moved to DatasourceConfigUnified.project. Using this field in write paths returns HTTP status code 400.</p>
     * 
     * <strong>example:</strong>
     * <p>my-sls-project</p>
     */
    @NameInMap("project")
    @Deprecated
    public String project;

    /**
     * <p><strong>[Deprecated]</strong> The region ID. This field has been moved to DatasourceConfigUnified.regionId. Using this field in write paths returns HTTP status code 400.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The name of the SLS Store.</p>
     * 
     * <strong>example:</strong>
     * <p>my-log-store</p>
     */
    @NameInMap("store")
    public String store;

    /**
     * <p>The store type. Valid values:</p>
     * <ul>
     * <li>LOG: Logstore.</li>
     * <li>METRIC: Metricstore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LOG</p>
     */
    @NameInMap("storeType")
    public String storeType;

    public static Stores build(java.util.Map<String, ?> map) throws Exception {
        Stores self = new Stores();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public Stores setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    @Deprecated
    public Stores setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Stores setStore(String store) {
        this.store = store;
        return this;
    }
    public String getStore() {
        return this.store;
    }

    public Stores setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
