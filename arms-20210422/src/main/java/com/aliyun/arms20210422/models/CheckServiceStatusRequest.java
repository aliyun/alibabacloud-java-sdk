// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckServiceStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SvcCode")
    public String svcCode;

    public static CheckServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceStatusRequest self = new CheckServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckServiceStatusRequest setSvcCode(String svcCode) {
        this.svcCode = svcCode;
        return this;
    }
    public String getSvcCode() {
        return this.svcCode;
    }

}
