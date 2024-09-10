// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupByResourceGroupIdRequest extends TeaModel {
    /**
     * <p>The alert contact groups. The alert notifications of the application group are sent to the alert contacts that belong to the specified alert contact groups.</p>
     * <p>An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>. For information about how to obtain alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_Group</p>
     */
    @NameInMap("ContactGroupList")
    public java.util.List<String> contactGroupList;

    /**
     * <p>Specifies whether the CloudMonitor agent is automatically installed for the application group. CloudMonitor determines whether to automatically install the CloudMonitor agent for the hosts in an application group based on the value of this parameter. Valid values:</p>
     * <ul>
     * <li>true: The CloudMonitor agent is automatically installed.</li>
     * <li>false (default): The CloudMonitor agent is not automatically installed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstallAgent")
    public Boolean enableInstallAgent;

    /**
     * <p>Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:</p>
     * <ul>
     * <li>true: The application group automatically subscribes to event notifications.</li>
     * <li>false (default): The application group does not automatically subscribe to event notifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSubscribeEvent")
    public Boolean enableSubscribeEvent;

    /**
     * <p>The ID of the region where the resource group resides.</p>
     * <p>For information about how to obtain the ID of the region where a resource group resides, see <a href="https://help.aliyun.com/document_detail/158866.html">GetResourceGroup</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>For information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw3ty5y7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the resource group.</p>
     * <p>For information about how to obtain the name of a resource group, see <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudMonitor</p>
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
