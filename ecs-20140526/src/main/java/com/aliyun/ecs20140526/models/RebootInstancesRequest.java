// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Valid values:</p>
     * <br>
     * <p>*   AllTogether: In this mode, if all instances are restarted, a success message is returned. If an instance fails the verification, all instances fail to be restarted, and an error message is returned.</p>
     * <p>*   SuccessFirst: In this mode, each instance is restarted separately. The response contains the operation results of each instance.</p>
     * <br>
     * <p>Default value: AllTogether.</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks the required parameters, request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, `DRYRUN.SUCCESS` is returned.</p>
     * <br>
     * <p>> If you set `BatchOptimization` to `SuccessFirst` and `DryRun` to true, only `DRYRUN.SUCCESS` is returned regardless of whether the request passes the dry run.</p>
     * <br>
     * <p>*   false: performs a dry run and performs the actual request.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully restart the instance. Valid values:</p>
     * <br>
     * <p>*   true: forcefully restarts the instance. This operation is equivalent to the typical power-off operation. Cache data that is not written to storage devices on the instance will be lost.</p>
     * <p>*   false: normally restarts the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceReboot")
    public Boolean forceReboot;

    /**
     * <p>The instance IDs. You can specify up to 100 instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RebootInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesRequest self = new RebootInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RebootInstancesRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public RebootInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RebootInstancesRequest setForceReboot(Boolean forceReboot) {
        this.forceReboot = forceReboot;
        return this;
    }
    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    public RebootInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public RebootInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RebootInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RebootInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebootInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RebootInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
