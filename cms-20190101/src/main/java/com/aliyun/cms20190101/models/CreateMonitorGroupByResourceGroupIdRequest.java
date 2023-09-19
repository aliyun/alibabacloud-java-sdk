// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdRequest extends TeaModel {
    /**
     * <p>The alert contact groups. The alert notifications of the application group are sent to the alert contacts that belong to the specified alert contact groups.</p>
     * <br>
     * <p>An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~). For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).</p>
     */
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    /**
     * <p>Specifies whether the CloudMonitor agent is automatically installed for the application group. CloudMonitor determines whether to automatically install the CloudMonitor agent for the hosts in an application group based on the value of this parameter. Valid values:</p>
     * <br>
     * <p>*   true: The CloudMonitor agent is automatically installed.</p>
     * <p>*   false (default): The CloudMonitor agent is not automatically installed.</p>
     */
    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    /**
     * <p>Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:</p>
     * <br>
     * <p>*   true: The application group automatically subscribes to event notifications.</p>
     * <p>*   false (default): The application group does not automatically subscribe to event notifications.</p>
     */
    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    /**
     * <p>The ID of the region where the resource group resides.</p>
     * <br>
     * <p>For information about how to obtain the ID of the region where a resource group resides, see [GetResourceGroup](~~158866~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For information about how to obtain the ID of a resource group, see [ListResourceGroups](~~158855~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the resource group.</p>
     * <br>
     * <p>For information about how to obtain the name of a resource group, see [ListResourceGroups](~~158855~~).</p>
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
