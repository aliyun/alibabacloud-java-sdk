// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLDAPConfigRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DescribeLDAPConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDAPConfigRequest self = new DescribeLDAPConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLDAPConfigRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
