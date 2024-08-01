// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class MigrateAvailableZoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FDDC511-7252-4A4A-ADDA-5CB1BF63****</p>
     */
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
