// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetGWSInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGWSInstanceNameResponseBody self = new SetGWSInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGWSInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
