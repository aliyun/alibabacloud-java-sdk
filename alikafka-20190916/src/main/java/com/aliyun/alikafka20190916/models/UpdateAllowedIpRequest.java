// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateAllowedIpRequest extends TeaModel {
    /**
     * <p>The IP addresses that you want to manage. You can specify a CIDR block. Example: **192.168.0.0/16**.</p>
     * <br>
     * <p>*   If the **UpdateType** parameter is set to **add**, specify one or more IP addresses for this parameter. Separate multiple IP addresses with commas (,).</p>
     * <p>*   If the **UpdateType** parameter is set to **delete**, specify only one IP address.</p>
     * <p>*   Exercise caution when you delete IP addresses.</p>
     */
    @NameInMap("AllowedListIp")
    public String allowedListIp;

    /**
     * <p>The type of the whitelist. Valid values:</p>
     * <br>
     * <p>*   **vpc**: a whitelist for access from a VPC.</p>
     * <p>*   **internet**: a whitelist for access from the Internet.</p>
     */
    @NameInMap("AllowedListType")
    public String allowedListType;

    /**
     * <p>The description of the whitelist.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port range. Valid values:</p>
     * <br>
     * <p>*   **9092/9092**: the port range for access from a virtual private cloud (VPC).</p>
     * <p>*   **9093/9093**: the port range for access from the Internet.</p>
     * <br>
     * <p>The value of this parameter must match the value of the **AllowdedListType** parameter.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The ID of the region where the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of configuration change. Valid values:</p>
     * <br>
     * <p>*   **add**</p>
     * <p>*   **delete**</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateAllowedIpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAllowedIpRequest self = new UpdateAllowedIpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAllowedIpRequest setAllowedListIp(String allowedListIp) {
        this.allowedListIp = allowedListIp;
        return this;
    }
    public String getAllowedListIp() {
        return this.allowedListIp;
    }

    public UpdateAllowedIpRequest setAllowedListType(String allowedListType) {
        this.allowedListType = allowedListType;
        return this;
    }
    public String getAllowedListType() {
        return this.allowedListType;
    }

    public UpdateAllowedIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAllowedIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAllowedIpRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public UpdateAllowedIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAllowedIpRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
