// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateDirectoryRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewDirectoryName")
    public String newDirectoryName;

    public static UpdateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryRequest self = new UpdateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateDirectoryRequest setNewDirectoryName(String newDirectoryName) {
        this.newDirectoryName = newDirectoryName;
        return this;
    }
    public String getNewDirectoryName() {
        return this.newDirectoryName;
    }

}
