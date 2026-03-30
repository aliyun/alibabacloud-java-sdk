// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CloneDisksRequest extends TeaModel {
    @NameInMap("Arn")
    public java.util.List<CloneDisksRequestArn> arn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <strong>example:</strong>
     * <p>MyDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <strong>example:</strong>
     * <p>key-szz67b2f696f4wh9yeg5d</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("MultiAttach")
    public String multiAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProvisionedIops")
    public Long provisionedIops;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-bp199lyny9b3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1d6tsvznfghy7y****</p>
     */
    @NameInMap("SourceDiskId")
    public String sourceDiskId;

    @NameInMap("Tag")
    public java.util.List<CloneDisksRequestTag> tag;

    public static CloneDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDisksRequest self = new CloneDisksRequest();
        return TeaModel.build(map, self);
    }

    public CloneDisksRequest setArn(java.util.List<CloneDisksRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CloneDisksRequestArn> getArn() {
        return this.arn;
    }

    public CloneDisksRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CloneDisksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloneDisksRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public CloneDisksRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public CloneDisksRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public CloneDisksRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CloneDisksRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CloneDisksRequest setMultiAttach(String multiAttach) {
        this.multiAttach = multiAttach;
        return this;
    }
    public String getMultiAttach() {
        return this.multiAttach;
    }

    public CloneDisksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloneDisksRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public CloneDisksRequest setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public CloneDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloneDisksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CloneDisksRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloneDisksRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public CloneDisksRequest setSourceDiskId(String sourceDiskId) {
        this.sourceDiskId = sourceDiskId;
        return this;
    }
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }

    public CloneDisksRequest setTag(java.util.List<CloneDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CloneDisksRequestTag> getTag() {
        return this.tag;
    }

    public static class CloneDisksRequestArn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CloneDisksRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CloneDisksRequestArn self = new CloneDisksRequestArn();
            return TeaModel.build(map, self);
        }

        public CloneDisksRequestArn setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CloneDisksRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CloneDisksRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CloneDisksRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CloneDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CloneDisksRequestTag self = new CloneDisksRequestTag();
            return TeaModel.build(map, self);
        }

        public CloneDisksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CloneDisksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
