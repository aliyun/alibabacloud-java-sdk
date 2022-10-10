// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ModifyDistributorMallRequest extends TeaModel {
    @NameInMap("DistributorMallDescription")
    public String distributorMallDescription;

    @NameInMap("DistributorMallId")
    public String distributorMallId;

    @NameInMap("DistributorMallName")
    public String distributorMallName;

    public static ModifyDistributorMallRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDistributorMallRequest self = new ModifyDistributorMallRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDistributorMallRequest setDistributorMallDescription(String distributorMallDescription) {
        this.distributorMallDescription = distributorMallDescription;
        return this;
    }
    public String getDistributorMallDescription() {
        return this.distributorMallDescription;
    }

    public ModifyDistributorMallRequest setDistributorMallId(String distributorMallId) {
        this.distributorMallId = distributorMallId;
        return this;
    }
    public String getDistributorMallId() {
        return this.distributorMallId;
    }

    public ModifyDistributorMallRequest setDistributorMallName(String distributorMallName) {
        this.distributorMallName = distributorMallName;
        return this;
    }
    public String getDistributorMallName() {
        return this.distributorMallName;
    }

}
