// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the instance group. The name can be up to 64 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The version of the initial deployment package associated with the instance group. You can call the ListHistoryDeployVersion operation to query the version. For more information, see [ListHistoryDeployVersion](https://help.aliyun.com/document_detail/149392.html).</p>
     */
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
