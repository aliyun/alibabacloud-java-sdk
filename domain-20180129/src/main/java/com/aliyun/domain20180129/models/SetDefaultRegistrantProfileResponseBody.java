// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetDefaultRegistrantProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultRegistrantProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultRegistrantProfileResponseBody self = new SetDefaultRegistrantProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultRegistrantProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
