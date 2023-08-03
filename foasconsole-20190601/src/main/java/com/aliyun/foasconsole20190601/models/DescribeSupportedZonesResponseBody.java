// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeSupportedZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

    public static DescribeSupportedZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedZonesResponseBody self = new DescribeSupportedZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportedZonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSupportedZonesResponseBody setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
