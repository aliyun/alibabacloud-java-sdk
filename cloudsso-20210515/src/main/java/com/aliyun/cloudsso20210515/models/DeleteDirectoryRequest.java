// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteDirectoryRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static DeleteDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoryRequest self = new DeleteDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
