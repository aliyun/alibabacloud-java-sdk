// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeShardDbConnectionInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubDbName")
    public String subDbName;

    public static DescribeShardDbConnectionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardDbConnectionInfoRequest self = new DescribeShardDbConnectionInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShardDbConnectionInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeShardDbConnectionInfoRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeShardDbConnectionInfoRequest setSubDbName(String subDbName) {
        this.subDbName = subDbName;
        return this;
    }
    public String getSubDbName() {
        return this.subDbName;
    }

}
