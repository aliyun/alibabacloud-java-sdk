// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdRequest extends TeaModel {
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    /**
     * <p>The name of the resource group.</p>
     * <br>
     * <p>For information about how to obtain the name of a resource group, see [ListResourceGroups](~~158855~~).</p>
     */
    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateMonitorGroupByResourceGroupId**.</p>
     */
    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:</p>
     * <br>
     * <p>*   true: The application group automatically subscribes to event notifications.</p>
     * <p>*   false (default value): The application group does not automatically subscribe to event notifications.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The alert contact group. The alert notifications of the application group are sent to the alert contacts that belong to the specified alert contact groups.</p>
     * <br>
     * <p>An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~). For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).</p>
     */
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
