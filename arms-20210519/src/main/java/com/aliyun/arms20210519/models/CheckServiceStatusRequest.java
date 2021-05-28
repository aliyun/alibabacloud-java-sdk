// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CheckServiceStatusRequest extends TeaModel {
    @NameInMap("SvcCode")
    public String svcCode;

    @NameInMap("RegionId")
    public String regionId;

    public static CheckServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceStatusRequest self = new CheckServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceStatusRequest setSvcCode(String svcCode) {
        this.svcCode = svcCode;
        return this;
    }
    public String getSvcCode() {
        return this.svcCode;
    }

    public CheckServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
