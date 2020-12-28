// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InitializeEHPCRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static InitializeEHPCRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeEHPCRequest self = new InitializeEHPCRequest();
        return TeaModel.build(map, self);
    }

    public InitializeEHPCRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
