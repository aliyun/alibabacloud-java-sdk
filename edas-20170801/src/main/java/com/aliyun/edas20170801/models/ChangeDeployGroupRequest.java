// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ChangeDeployGroupRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the elastic compute component (ECC) that corresponds to the ECS instance for which you want to change the application instance group. You can call the ListApplicationEcc operation to query the ECC ID. For more information, see [ListApplicationEcc](~~199277~~).</p>
     * <br>
     * <p>> You can change the application instance group for only one ECS instance at a time.</p>
     */
    @NameInMap("EccInfo")
    public String eccInfo;

    /**
     * <p>Specifies whether to forcibly change the application instance group if the deployment package version of the ECC is different from that of the application instance group.</p>
     */
    @NameInMap("ForceStatus")
    public Boolean forceStatus;

    /**
     * <p>The name of the application instance group. Examples: group_a and group_b. The parameter value for the default application instance group is `_DEFAULT_GROUP`. The name can be up to 64 characters in length.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static ChangeDeployGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDeployGroupRequest self = new ChangeDeployGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDeployGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ChangeDeployGroupRequest setEccInfo(String eccInfo) {
        this.eccInfo = eccInfo;
        return this;
    }
    public String getEccInfo() {
        return this.eccInfo;
    }

    public ChangeDeployGroupRequest setForceStatus(Boolean forceStatus) {
        this.forceStatus = forceStatus;
        return this;
    }
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

    public ChangeDeployGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
