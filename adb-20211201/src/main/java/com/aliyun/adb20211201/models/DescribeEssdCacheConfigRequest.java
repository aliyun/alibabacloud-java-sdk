// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEssdCacheConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf685u1o987hj6rn</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DescribeEssdCacheConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEssdCacheConfigRequest self = new DescribeEssdCacheConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEssdCacheConfigRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
