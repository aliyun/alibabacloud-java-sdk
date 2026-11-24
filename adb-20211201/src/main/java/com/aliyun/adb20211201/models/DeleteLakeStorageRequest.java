// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteLakeStorageRequest extends TeaModel {
    /**
     * <p>The ADB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp*********</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the lake storage instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adb-lake-cn-hangzhou-1aa1a1aa11</p>
     */
    @NameInMap("LakeStorageId")
    public String lakeStorageId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLakeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakeStorageRequest self = new DeleteLakeStorageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLakeStorageRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteLakeStorageRequest setLakeStorageId(String lakeStorageId) {
        this.lakeStorageId = lakeStorageId;
        return this;
    }
    public String getLakeStorageId() {
        return this.lakeStorageId;
    }

    public DeleteLakeStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
