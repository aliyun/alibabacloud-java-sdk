// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateLakeStorageShrinkRequest extends TeaModel {
    /**
     * <p>The ADB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-*******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>adb-lake-cn-hangzhou-1a1aaaa11a</p>
     */
    @NameInMap("LakeStorageId")
    public String lakeStorageId;

    /**
     * <p>The permissions of the lake storage.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Account&quot;:&quot;1234567890123456&quot;,&quot;Read&quot;:true,&quot;Type&quot;:&quot;User&quot;,&quot;Write&quot;:true}]</p>
     */
    @NameInMap("Permissions")
    public String permissionsShrink;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateLakeStorageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLakeStorageShrinkRequest self = new UpdateLakeStorageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLakeStorageShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateLakeStorageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLakeStorageShrinkRequest setLakeStorageId(String lakeStorageId) {
        this.lakeStorageId = lakeStorageId;
        return this;
    }
    public String getLakeStorageId() {
        return this.lakeStorageId;
    }

    public UpdateLakeStorageShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

    public UpdateLakeStorageShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
