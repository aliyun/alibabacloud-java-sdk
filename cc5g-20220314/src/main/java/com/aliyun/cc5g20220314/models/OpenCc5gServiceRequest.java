// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class OpenCc5gServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static OpenCc5gServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCc5gServiceRequest self = new OpenCc5gServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenCc5gServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
