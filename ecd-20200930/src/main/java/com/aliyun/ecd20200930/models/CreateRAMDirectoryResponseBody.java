// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateRAMDirectoryResponseBody extends TeaModel {
    /**
     * <p>The RAM directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dri-uf62w3qzt4aigvlcb****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
