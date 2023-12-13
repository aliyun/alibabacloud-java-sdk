// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CommitContainerRequest extends TeaModel {
    /**
     * <p>The access credential configurations of the Container Registry Enterprise Edition instance.\</p>
     * <p>If you use a Container Registry Personal Edition instance, you can leave this parameter empty.</p>
     */
    @NameInMap("AcrRegistryInfo")
    public CommitContainerRequestAcrRegistryInfo acrRegistryInfo;

    /**
     * <p>The ARN that is required for authorization.</p>
     */
    @NameInMap("Arn")
    public CommitContainerRequestArn arn;

    /**
     * <p>The ID of the container group.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The name of the container.</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The image of the container.</p>
     */
    @NameInMap("Image")
    public CommitContainerRequestImage image;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
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

    public CommitContainerRequest setAcrRegistryInfo(CommitContainerRequestAcrRegistryInfo acrRegistryInfo) {
        this.acrRegistryInfo = acrRegistryInfo;
        return this;
    }
    public CommitContainerRequestAcrRegistryInfo getAcrRegistryInfo() {
        return this.acrRegistryInfo;
    }

    public CommitContainerRequest setArn(CommitContainerRequestArn arn) {
        this.arn = arn;
        return this;
    }
    public CommitContainerRequestArn getArn() {
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

    public CommitContainerRequest setImage(CommitContainerRequestImage image) {
        this.image = image;
        return this;
    }
    public CommitContainerRequestImage getImage() {
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

    public static class CommitContainerRequestAcrRegistryInfo extends TeaModel {
        /**
         * <p>The RAM role ARN of the account to which permissions are granted during a cross-account authorization.</p>
         */
        @NameInMap("ArnService")
        public String arnService;

        /**
         * <p>The RAM role ARN of the account that is used to grant permissions during a cross-account authorization.</p>
         */
        @NameInMap("ArnUser")
        public String arnUser;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region where the Container Registry Enterprise Edition instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CommitContainerRequestAcrRegistryInfo build(java.util.Map<String, ?> map) throws Exception {
            CommitContainerRequestAcrRegistryInfo self = new CommitContainerRequestAcrRegistryInfo();
            return TeaModel.build(map, self);
        }

        public CommitContainerRequestAcrRegistryInfo setArnService(String arnService) {
            this.arnService = arnService;
            return this;
        }
        public String getArnService() {
            return this.arnService;
        }

        public CommitContainerRequestAcrRegistryInfo setArnUser(String arnUser) {
            this.arnUser = arnUser;
            return this;
        }
        public String getArnUser() {
            return this.arnUser;
        }

        public CommitContainerRequestAcrRegistryInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CommitContainerRequestAcrRegistryInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CommitContainerRequestArn extends TeaModel {
        /**
         * <p>The ARN of the RAM role of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The type of the authorization.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static CommitContainerRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CommitContainerRequestArn self = new CommitContainerRequestArn();
            return TeaModel.build(map, self);
        }

        public CommitContainerRequestArn setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CommitContainerRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class CommitContainerRequestImage extends TeaModel {
        /**
         * <p>The authorization of the image.</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The message about the image.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The image repository.</p>
         */
        @NameInMap("Repository")
        public String repository;

        /**
         * <p>The tag of the image. This parameter is empty by default, which indicates that the tag is not modified.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static CommitContainerRequestImage build(java.util.Map<String, ?> map) throws Exception {
            CommitContainerRequestImage self = new CommitContainerRequestImage();
            return TeaModel.build(map, self);
        }

        public CommitContainerRequestImage setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CommitContainerRequestImage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CommitContainerRequestImage setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public CommitContainerRequestImage setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
