// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DataStorageItem extends TeaModel {
    @NameInMap("dataType")
    public String dataType;

    @NameInMap("project")
    public String project;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("storeName")
    public String storeName;

    @NameInMap("storeType")
    public String storeType;

    public static DataStorageItem build(java.util.Map<String, ?> map) throws Exception {
        DataStorageItem self = new DataStorageItem();
        return TeaModel.build(map, self);
    }

    public DataStorageItem setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DataStorageItem setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DataStorageItem setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DataStorageItem setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public DataStorageItem setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
