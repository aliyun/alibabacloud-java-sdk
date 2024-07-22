// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetRegionConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static GetRegionConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegionConfigurationRequest self = new GetRegionConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetRegionConfigurationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
