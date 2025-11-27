// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeletePoolRequest extends TeaModel {
    /**
     * <p>The name of the resource pool.</p>
     * <ul>
     * <li>The value can be up to 15 characters in length.</li>
     * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PoolTest</p>
     */
    @NameInMap("PoolName")
    public String poolName;

    public static DeletePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePoolRequest self = new DeletePoolRequest();
        return TeaModel.build(map, self);
    }

    public DeletePoolRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

}
