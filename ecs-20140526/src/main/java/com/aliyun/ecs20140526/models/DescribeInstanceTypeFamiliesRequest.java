// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesRequest extends TeaModel {
    /**
     * <p>The generation of the instance family. For more information, see [Overview of instance families](~~25378~~). Valid values:</p>
     * <br>
     * <p>*   ecs-1: Generation I, which consists of the earliest and cost-effective instance types</p>
     * <p>*   ecs-2: Generation II, which provides upgraded software and hardware and higher performance than Generation I</p>
     * <p>*   ecs-3: Generation III, which consists of high-performance instance families and is suitable for different business scenarios</p>
     * <p>*   ecs-4: Generation IV, which consists of enterprise-level instance families (such as g5, c5, and r5), ECS Bare Metal Instance families (such as ebmc5s, ebmg5s, and ebmr5s), and burstable instance families (such as t5) and can meet a wide variety of business requirements with lower latency</p>
     * <p>*   ecs-5: Generation V, which consists of enterprise-level instance families (such as g6, c6, and r6), ECS Bare Metal Instance families (such as ebmg6, ebmg6e, and ebmc6), and storage-enhanced instance families (such as g6e) and delivers quick response times and higher performance</p>
     * <p>*   ecs-6: Generation VI, which consists of enterprise-level instance families (such as hfc7, hfg7, and hfr7) and ECS Bare Metal Instance families (such as ebmhfg7) and is in invitational preview</p>
     */
    @NameInMap("Generation")
    public String generation;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance family. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeInstanceTypeFamiliesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesRequest self = new DescribeInstanceTypeFamiliesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesRequest setGeneration(String generation) {
        this.generation = generation;
        return this;
    }
    public String getGeneration() {
        return this.generation;
    }

    public DescribeInstanceTypeFamiliesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstanceTypeFamiliesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceTypeFamiliesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceTypeFamiliesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstanceTypeFamiliesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
