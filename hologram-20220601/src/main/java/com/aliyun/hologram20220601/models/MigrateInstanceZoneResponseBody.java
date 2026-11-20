// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class MigrateInstanceZoneResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true: The operation is successful.</li>
     * <li>false: The operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static MigrateInstanceZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateInstanceZoneResponseBody self = new MigrateInstanceZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateInstanceZoneResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public MigrateInstanceZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
