// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InitPackageVersionId")
    public String initPackageVersionId;

    public static InsertDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertDeployGroupRequest self = new InsertDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public InsertDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InsertDeployGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public InsertDeployGroupRequest setInitPackageVersionId(String initPackageVersionId) {
        this.initPackageVersionId = initPackageVersionId;
        return this;
    }
    public String getInitPackageVersionId() {
        return this.initPackageVersionId;
    }

}
