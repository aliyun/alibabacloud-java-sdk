// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    public static AddUserToDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopGroupRequest self = new AddUserToDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserToDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public AddUserToDesktopGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddUserToDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

}
