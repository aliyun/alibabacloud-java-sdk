// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBIpWhiteListRequest extends TeaModel {
    /**
     * <p>The database name.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The name of the whitelist group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDrdsDBIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBIpWhiteListRequest self = new DescribeDrdsDBIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBIpWhiteListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsDBIpWhiteListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsDBIpWhiteListRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDrdsDBIpWhiteListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
