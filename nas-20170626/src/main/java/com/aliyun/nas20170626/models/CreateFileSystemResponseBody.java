// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponseBody extends TeaModel {
    /**
     * <p>The ID of the created file system.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponseBody self = new CreateFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
