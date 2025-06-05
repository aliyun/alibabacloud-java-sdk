// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CommitContainerRequest extends TeaModel {
    /**
     * <p>The access credential configurations of the Container Registry Enterprise Edition instance.</p>
     * <blockquote>
     * <p> If you use a Container Registry Personal Edition instance, you do not need to configure this parameter. If you use a Container Registry Enterprise Edition instance, you must configure this parameter.</p>
     * </blockquote>
     */
    @NameInMap("AcrRegistryInfo")
    public AcrRegistryInfo acrRegistryInfo;

    /**
     * <p>The details about the ARN that is required for authorization.</p>
     */
    @NameInMap("Arn")
    public Arn arn;

    /**
     * <p>The ID of the container group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eci-bp1do4xz75fa5sd****</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The name of the container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>container-1</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The image of the container.</p>
     */
    @NameInMap("Image")
    public Image image;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CommitContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitContainerRequest self = new CommitContainerRequest();
        return TeaModel.build(map, self);
    }

    public CommitContainerRequest setAcrRegistryInfo(AcrRegistryInfo acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public AcrRegistryInfo getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public CommitContainerRequest setArn(Arn arn) {
        this.arn = arn;
        return this;
    }
    public Arn getArn() {
        return this.arn;
    }

    public CommitContainerRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public CommitContainerRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public CommitContainerRequest setImage(Image image) {
        this.image = image;
        return this;
    }
    public Image getImage() {
        return this.image;
    }

    public CommitContainerRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CommitContainerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CommitContainerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CommitContainerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CommitContainerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class AcrRegistryInfo extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Access (ARN) of the RAM role that is assigned to the user (the authorized account) in cross-account authorization scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1609982529******:role/role-test</p>
         */
        @NameInMap("ArnService")
        public String arnService;

        /**
         * <p>The ARN of the RAM role that is assigned to the authorizer in cross-account authorization scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1298452580******:role/role-test</p>
         */
        @NameInMap("ArnUser")
        public String arnUser;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-nwj395hgf6f3****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static AcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            AcrRegistryInfo self = new AcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public AcrRegistryInfo setArnService(String arnService) {
            this.arnService = arnService;
            return this;
        }
        public String getArnService() {
            return this.arnService;
        }

        public AcrRegistryInfo setArnUser(String arnUser) {
            this.arnUser = arnUser;
            return this;
        }
        public String getArnUser() {
            return this.arnUser;
        }

        public AcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class Arn extends TeaModel {
        /**
         * <p>The ARN of the authorized role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:xxx</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The authorization type. A value of service indicates that RAM roles are used for authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static Arn build(java.util.Map<String, ?> map) throws Exception {
            Arn self = new Arn();
            return TeaModel.build(map, self);
        }

        public Arn setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public Arn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class Image extends TeaModel {
        /**
         * <p>The authorization of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>ECI</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The message about the image.</p>
         * 
         * <strong>example:</strong>
         * <p>test commit</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The image repository.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eastest/registry-test</p>
         */
        @NameInMap("Repository")
        public String repository;

        /**
         * <p>The tag of the image. This parameter is empty by default, which indicates that the tag is not modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.6</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static Image build(java.util.Map<String, ?> map) throws Exception {
            Image self = new Image();
            return TeaModel.build(map, self);
        }

        public Image setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public Image setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Image setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public Image setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
