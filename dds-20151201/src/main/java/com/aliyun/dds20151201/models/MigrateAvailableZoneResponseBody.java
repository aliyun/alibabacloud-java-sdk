// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateAvailableZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateAvailableZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateAvailableZoneResponseBody self = new MigrateAvailableZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateAvailableZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
