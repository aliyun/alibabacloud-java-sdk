// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBClusterRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB cluster.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The name of the DRDS database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of a DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeDrdsDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBClusterRequest self = new DescribeDrdsDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBClusterRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DescribeDrdsDBClusterRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsDBClusterRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
