// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecursionZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>169783221000012</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRecursionZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecursionZoneRequest self = new DescribeRecursionZoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecursionZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
