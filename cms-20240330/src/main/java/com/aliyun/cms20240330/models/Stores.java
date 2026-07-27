// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Stores extends TeaModel {
    @NameInMap("project")
    @Deprecated
    public String project;

    @NameInMap("regionId")
    @Deprecated
    public String regionId;

    @NameInMap("store")
    public String store;

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
