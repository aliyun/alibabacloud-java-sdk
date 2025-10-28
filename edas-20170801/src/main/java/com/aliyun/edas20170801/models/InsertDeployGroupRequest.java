// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-***********</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the instance group. The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The version of the initial deployment package associated with the instance group. You can call the ListHistoryDeployVersion operation to query the version. For more information, see <a href="https://help.aliyun.com/document_detail/149392.html">ListHistoryDeployVersion</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>441beb18-da42-44dc-<strong><strong>-</strong></strong></p>
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
