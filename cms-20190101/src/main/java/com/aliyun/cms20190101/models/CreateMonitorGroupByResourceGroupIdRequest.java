// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdRequest extends TeaModel {
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static CreateMonitorGroupByResourceGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupByResourceGroupIdRequest self = new CreateMonitorGroupByResourceGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupByResourceGroupIdRequest setContactGroupList(java.util.List<String> contactGroupList) {
        this.contactGroupList = contactGroupList;
        return this;
    }
    public java.util.List<String> getContactGroupList() {
        return this.contactGroupList;
    }

    public CreateMonitorGroupByResourceGroupIdRequest setEnableInstallAgent(Boolean enableInstallAgent) {
        this.enableInstallAgent = enableInstallAgent;
        return this;
    }
    public Boolean getEnableInstallAgent() {
        return this.enableInstallAgent;
    }

    public CreateMonitorGroupByResourceGroupIdRequest setEnableSubscribeEvent(Boolean enableSubscribeEvent) {
        this.enableSubscribeEvent = enableSubscribeEvent;
        return this;
    }
    public Boolean getEnableSubscribeEvent() {
        return this.enableSubscribeEvent;
    }

    public CreateMonitorGroupByResourceGroupIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMonitorGroupByResourceGroupIdRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateMonitorGroupByResourceGroupIdRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
