// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLDAPConfigRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DeleteLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDAPConfigRequest self = new DeleteLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
