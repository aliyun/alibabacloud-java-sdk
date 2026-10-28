// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartSynchronizationJobRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1689726061829****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the region where the data synchronization instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><strong>Forward</strong>: Forward.</li>
     * <li><strong>Reverse</strong>: Reverse.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>Forward</strong>.</li>
     * <li>You can set this parameter to <strong>Reverse</strong> to start the reverse synchronization link only when the topology of the data synchronization instance is two-way.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>Instance ID of the data synchronization instance. You can call the <strong>DescribeSynchronizationJobs</strong> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsf19100l2186****</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    public static StartSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSynchronizationJobRequest self = new StartSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public StartSynchronizationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StartSynchronizationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartSynchronizationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public StartSynchronizationJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public StartSynchronizationJobRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

}
