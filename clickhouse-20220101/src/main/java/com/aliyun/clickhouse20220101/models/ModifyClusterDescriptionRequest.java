// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyClusterDescriptionRequest extends TeaModel {
    // 实例描述信息
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyClusterDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescriptionRequest self = new ModifyClusterDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescriptionRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public ModifyClusterDescriptionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyClusterDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
