// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableSmbAclRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DisableSmbAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSmbAclRequest self = new DisableSmbAclRequest();
        return TeaModel.build(map, self);
    }

    public DisableSmbAclRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
