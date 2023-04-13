// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ResumeInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ResumeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeInstanceRequest self = new ResumeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
