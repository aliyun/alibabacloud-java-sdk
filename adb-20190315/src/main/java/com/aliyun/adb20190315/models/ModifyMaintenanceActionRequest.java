// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyMaintenanceActionRequest extends TeaModel {
    /**
     * <p>The ID of the pending O\&amp;M event. You can specify multiple IDs to batch change the switchover time. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/271738.html">DescribeMaintenanceAction</a> operation to query the information about pending O\&amp;M events, including the event ID.</li>
     * <li>You can change the switchover time only for pending O\&amp;M events. The switchover time of historical O\&amp;M events cannot be changed. For more information about the status of pending and historical O\&amp;M events, see <a href="https://help.aliyun.com/document_detail/271738.html">DescribeMaintenanceAction</a>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("Ids")
    public String ids;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the pending O\&amp;M event occurs.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929XXXX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time when you want the system to perform operations on the pending O\&amp;M event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-09T22:00:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    public static ModifyMaintenanceActionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaintenanceActionRequest self = new ModifyMaintenanceActionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMaintenanceActionRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ModifyMaintenanceActionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyMaintenanceActionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMaintenanceActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMaintenanceActionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyMaintenanceActionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMaintenanceActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMaintenanceActionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

}
