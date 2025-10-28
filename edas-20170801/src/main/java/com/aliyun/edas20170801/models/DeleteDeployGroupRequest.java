// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteDeployGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413-b31*************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the instance group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static DeleteDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeployGroupRequest self = new DeleteDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteDeployGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
