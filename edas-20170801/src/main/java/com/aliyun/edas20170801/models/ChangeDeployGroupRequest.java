// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ChangeDeployGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EccInfo")
    public String eccInfo;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ForceStatus")
    public Boolean forceStatus;

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

    public ChangeDeployGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ChangeDeployGroupRequest setForceStatus(Boolean forceStatus) {
        this.forceStatus = forceStatus;
        return this;
    }
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

}
