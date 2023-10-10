// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByURLResponseBody extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("requestId")
    public String requestId;

    public static UploadFileByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByURLResponseBody self = new UploadFileByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileByURLResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadFileByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
