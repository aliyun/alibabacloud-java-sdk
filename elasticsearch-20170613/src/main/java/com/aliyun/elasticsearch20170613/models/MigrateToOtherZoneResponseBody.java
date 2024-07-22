// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <ul>
     * <li>true: migration succeeded</li>
     * <li>false: The migration fails</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static MigrateToOtherZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneResponseBody self = new MigrateToOtherZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateToOtherZoneResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
