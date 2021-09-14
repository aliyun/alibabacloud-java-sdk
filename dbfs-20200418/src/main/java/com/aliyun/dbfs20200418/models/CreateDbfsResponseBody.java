// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FsId")
    public String fsId;

    public static CreateDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDbfsResponseBody self = new CreateDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDbfsResponseBody setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

}
