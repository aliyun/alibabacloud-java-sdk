// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class MVFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MVFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MVFolderResponseBody self = new MVFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public MVFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
