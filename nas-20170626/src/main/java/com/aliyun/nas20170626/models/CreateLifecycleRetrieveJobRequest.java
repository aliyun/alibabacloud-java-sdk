// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecycleRetrieveJobRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Paths")
    public java.util.List<String> paths;

    public static CreateLifecycleRetrieveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleRetrieveJobRequest self = new CreateLifecycleRetrieveJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleRetrieveJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateLifecycleRetrieveJobRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

}
