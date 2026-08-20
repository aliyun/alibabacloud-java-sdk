// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolRequest extends TeaModel {
    /**
     * <p>The resource pool name.</p>
     * <ul>
     * <li>The name can be up to 15 characters in length.</li>
     * <li>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</li>
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
