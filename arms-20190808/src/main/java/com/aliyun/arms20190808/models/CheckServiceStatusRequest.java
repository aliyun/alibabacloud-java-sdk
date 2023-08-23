// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckServiceStatusRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service code of an Alibaba Cloud service. The service code of Managed Service for Prometheus is prometheus.</p>
     */
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
