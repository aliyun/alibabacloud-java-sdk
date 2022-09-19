// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateOssSubDirectoryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Path")
    public String path;

    public static CreateOssSubDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssSubDirectoryRequest self = new CreateOssSubDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssSubDirectoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateOssSubDirectoryRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
