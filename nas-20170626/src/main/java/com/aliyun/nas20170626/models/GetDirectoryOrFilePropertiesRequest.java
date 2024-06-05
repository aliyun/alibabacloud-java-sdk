// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetDirectoryOrFilePropertiesRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of the directory.</p>
     * <br>
     * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Path")
    public String path;

    public static GetDirectoryOrFilePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryOrFilePropertiesRequest self = new GetDirectoryOrFilePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectoryOrFilePropertiesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public GetDirectoryOrFilePropertiesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
