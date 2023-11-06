// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeHotDbListRequest extends TeaModel {
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

    public static DescribeHotDbListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotDbListRequest self = new DescribeHotDbListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHotDbListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeHotDbListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
