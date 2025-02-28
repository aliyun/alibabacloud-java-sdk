// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeClusterNetInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InsType")
    public String insType;

    public static DescribeClusterNetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetInfoRequest self = new DescribeClusterNetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetInfoRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeClusterNetInfoRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeClusterNetInfoRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

}
