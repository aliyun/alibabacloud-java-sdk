// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeNfsAclRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DescribeNfsAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNfsAclRequest self = new DescribeNfsAclRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNfsAclRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
