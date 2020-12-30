// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveOssServeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveOssServeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOssServeResponseBody self = new SaveOssServeResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOssServeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
