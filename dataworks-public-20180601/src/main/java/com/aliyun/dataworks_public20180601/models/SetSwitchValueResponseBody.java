// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SetSwitchValueResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static SetSwitchValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSwitchValueResponseBody self = new SetSwitchValueResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSwitchValueResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetSwitchValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
