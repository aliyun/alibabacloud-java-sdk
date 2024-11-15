// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DeleteAccountFactoryBaselineRequest extends TeaModel {
    /**
     * <p>The baseline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>afb-bp1durvn3lgqe28v****</p>
     */
    @NameInMap("BaselineId")
    public String baselineId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAccountFactoryBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountFactoryBaselineRequest self = new DeleteAccountFactoryBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountFactoryBaselineRequest setBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public String getBaselineId() {
        return this.baselineId;
    }

    public DeleteAccountFactoryBaselineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
