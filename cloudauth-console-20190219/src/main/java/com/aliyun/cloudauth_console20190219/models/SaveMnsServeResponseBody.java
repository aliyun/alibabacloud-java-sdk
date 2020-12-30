// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveMnsServeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveMnsServeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveMnsServeResponseBody self = new SaveMnsServeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveMnsServeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
