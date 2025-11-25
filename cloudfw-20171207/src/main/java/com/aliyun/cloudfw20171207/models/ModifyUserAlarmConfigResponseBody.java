// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserAlarmConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3B168A0F-A43D-5FD0-8059-B51BDD6E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserAlarmConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserAlarmConfigResponseBody self = new ModifyUserAlarmConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserAlarmConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
