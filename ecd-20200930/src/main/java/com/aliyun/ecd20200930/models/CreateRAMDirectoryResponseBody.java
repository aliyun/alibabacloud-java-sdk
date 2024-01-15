// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the RAM directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRAMDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRAMDirectoryResponseBody self = new CreateRAMDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRAMDirectoryResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateRAMDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
