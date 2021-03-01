// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddLogPathRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Path")
    public String path;

    public static AddLogPathRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLogPathRequest self = new AddLogPathRequest();
        return TeaModel.build(map, self);
    }

    public AddLogPathRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddLogPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
