// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinTablesRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRecycleBinTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinTablesRequest self = new DescribeRecycleBinTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeRecycleBinTablesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRecycleBinTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
