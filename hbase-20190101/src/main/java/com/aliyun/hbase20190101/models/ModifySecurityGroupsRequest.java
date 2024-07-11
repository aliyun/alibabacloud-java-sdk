// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16f1441y6p2kv**</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-t4ng4yyc916o81nu****,sg-x4gg4dyc9d6w********</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    public static ModifySecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupsRequest self = new ModifySecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifySecurityGroupsRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
