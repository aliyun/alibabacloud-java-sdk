// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-hahhfskfkseig****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description.</p>
     * <p>The description must be 1 to 256 characters in length and cannot start with <code>http:// </code>or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time interval at which probe packets are sent during a health check. Unit: seconds. Default value: 2. Valid values: <strong>2</strong> to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>Specifies whether to enable only the detection feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * <pre><code>  If you enable only the detection feature, the system performs a health check but does not switch routes when the Express Connect circuit is down.
     * 
     *   &gt; Make sure that you have another way to ensure link redundancy. Otherwise, network interruptions may occur.
     * </code></pre>
     * </li>
     * <li><p><strong>false</strong> (default): No.</p>
     * <pre><code>  This feature is disabled by default. If the health check detects a link failure and a redundant route is available in the CEN instance, the system immediately switches to the available route.
     * </code></pre>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HealthCheckOnly")
    public Boolean healthCheckOnly;

    /**
     * <p>The source IP address for the health check. You can configure the source IP address in one of the following ways:</p>
     * <ul>
     * <li><p><strong>Automatic IP address</strong> (recommended): The system automatically assigns an IP address from the 100.96.0.0/16 CIDR block.</p>
     * </li>
     * <li><p><strong>Custom IP address</strong>: You can specify an unused IP address from the 10.0.0.0/8, 192.168.0.0/16, or 172.16.0.0/12 CIDR block. The specified IP address cannot conflict with an IP address that is used for communication in the CEN instance. The specified IP address also cannot conflict with the Alibaba Cloud-side or client-side IP address of the VBR instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address for the health check.</p>
     * <p>The destination IP address is the client-side IP address of the VBR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XX.XX.1</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The number of probe packets that are sent during a health check. Unit: packets. Valid values: 3 to <strong>8</strong>. Default value: <strong>8</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
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
     * <p>The ID of the VBR instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-wz95o9aylj181n5mzk****</p>
     */
    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VBR instance belongs.</p>
     * <blockquote>
     * <p>This parameter is required if the VBR instance and the CEN instance belong to different Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("VbrInstanceOwnerId")
    public Long vbrInstanceOwnerId;

    /**
     * <p>The ID of the region where the VBR instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
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
