// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFileSystemRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DeleteFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemRequest self = new DeleteFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
