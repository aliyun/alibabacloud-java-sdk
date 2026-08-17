// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolRequest extends TeaModel {
    /**
     * <p>The name of the resource pool.</p>
     * <ul>
     * <li><p>The name can be up to 15 characters long.</p>
     * </li>
     * <li><p>The name can contain letters, digits, underscores (_), and periods (.).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PoolTest</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    public static GetPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPoolRequest self = new GetPoolRequest();
        return TeaModel.build(map, self);
    }

    public GetPoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

}
