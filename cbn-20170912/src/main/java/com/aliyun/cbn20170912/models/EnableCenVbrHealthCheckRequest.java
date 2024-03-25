// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the health check.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time interval at which probe packets are sent during a health check. Unit: seconds. Default value: **2**. Valid values: **2 to 3**.</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>Specifies whether to enable probing during the health check. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <br>
     * <p>        If you enable probing, the system does not switch to another route if the detected route is not reachable. </p>
     * <br>
     * <p>          Make sure that a redundant route is available. Otherwise, network disconnections may occur. </p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <br>
     * <p>        Probing is disabled by default. If a redundant route is specified, the system switches to the redundant route if the detected route is not reachable.</p>
     */
    @NameInMap("HealthCheckOnly")
    public Boolean healthCheckOnly;

    /**
     * <p>The source IP address for the health check. You can set the source IP address in the following ways:</p>
     * <br>
     * <p>*   **Automatic IP Address** (recommended): The system automatically assigns an IP address from the 100.96.0.0/16 CIDR block.</p>
     * <p>*   **Custom IP Address**: You must specify an idle IP address from the 10.0.0.0/8, 192.168.0.0/16, or 172.16.0.0/12 CIDR block. The specified IP address cannot be the IP address of the VBR on the Alibaba Cloud side, the IP address of the VBR on the customer side, or other IP addresses with which the VBR communicates through the CEN instance.</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address for the health check.</p>
     * <br>
     * <p>Set the destination IP address to the IP address of the VBR on the customer side.</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The number of probe packets that are sent during a health check. Unit: packets. Valid values: **3 to 8**. Default value: **8**.</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VBR.</p>
     */
    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
     * <br>
     * <p>> This parameter is required if the VBR and the CEN instance belong to different Alibaba Cloud accounts.</p>
     */
    @NameInMap("VbrInstanceOwnerId")
    public Long vbrInstanceOwnerId;

    /**
     * <p>The ID of the region where the VBR is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("VbrInstanceRegionId")
    public String vbrInstanceRegionId;

    public static EnableCenVbrHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVbrHealthCheckRequest self = new EnableCenVbrHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public EnableCenVbrHealthCheckRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public EnableCenVbrHealthCheckRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckOnly(Boolean healthCheckOnly) {
        this.healthCheckOnly = healthCheckOnly;
        return this;
    }
    public Boolean getHealthCheckOnly() {
        return this.healthCheckOnly;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public EnableCenVbrHealthCheckRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public EnableCenVbrHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableCenVbrHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableCenVbrHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableCenVbrHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceId(String vbrInstanceId) {
        this.vbrInstanceId = vbrInstanceId;
        return this;
    }
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceOwnerId(Long vbrInstanceOwnerId) {
        this.vbrInstanceOwnerId = vbrInstanceOwnerId;
        return this;
    }
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceRegionId(String vbrInstanceRegionId) {
        this.vbrInstanceRegionId = vbrInstanceRegionId;
        return this;
    }
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

}
