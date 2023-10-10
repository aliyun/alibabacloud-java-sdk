// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByOSSResponseBody extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    public static UploadFileByOSSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByOSSResponseBody self = new UploadFileByOSSResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileByOSSResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadFileByOSSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
