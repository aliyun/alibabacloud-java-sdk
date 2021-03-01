// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteLogPathRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Path")
    public String path;

    public static DeleteLogPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogPathRequest self = new DeleteLogPathRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogPathRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLogPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
