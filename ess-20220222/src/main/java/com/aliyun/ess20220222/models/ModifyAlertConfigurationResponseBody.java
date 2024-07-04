// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyAlertConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAlertConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAlertConfigurationResponseBody self = new ModifyAlertConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAlertConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
