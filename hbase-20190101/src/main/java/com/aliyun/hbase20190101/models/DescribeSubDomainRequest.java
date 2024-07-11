// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSubDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRequest self = new DescribeSubDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubDomainRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
