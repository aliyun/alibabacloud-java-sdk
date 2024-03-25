// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAndBindNasFileSystemResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAndBindNasFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindNasFileSystemResponseBody self = new CreateAndBindNasFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndBindNasFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
