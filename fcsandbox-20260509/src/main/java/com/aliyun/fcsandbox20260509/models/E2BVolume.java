// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BVolume extends TeaModel {
    /**
     * <p>The AgenticFS configuration.</p>
     */
    @NameInMap("agenticFSVolumeConfig")
    public AgenticFSVolumeConfig agenticFSVolumeConfig;

    /**
     * <p>The time when the volume was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-10T11:05:55Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The mount configuration.</p>
     */
    @NameInMap("mountConfig")
    public E2BVolumeMountConfig mountConfig;

    /**
     * <p>The OSS configuration.</p>
     */
    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwxqyrgwabcd</p>
     */
    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>CREATING</li>
     * <li>AVAILABLE</li>
     * <li>ERROR</li>
     * <li>DELETING</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The reason for the status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>OSS</li>
     * <li>AGENTIC_FS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("storageClass")
    public String storageClass;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The time when the volume was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-10T11:05:55Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>2190856988355929</p>
     */
    @NameInMap("userID")
    public String userID;

    /**
     * <p>The unique identifier of the volume.</p>
     * 
     * <strong>example:</strong>
     * <p>82c8c42e-cf7a-46d0-8b58-9024409c1579</p>
     */
    @NameInMap("volumeID")
    public String volumeID;

    /**
     * <p>The name, which is unique within the team.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static E2BVolume build(java.util.Map<String, ?> map) throws Exception {
        E2BVolume self = new E2BVolume();
        return TeaModel.build(map, self);
    }

    public E2BVolume setAgenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public E2BVolume setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BVolume setMountConfig(E2BVolumeMountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }
    public E2BVolumeMountConfig getMountConfig() {
        return this.mountConfig;
    }

    public E2BVolume setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public E2BVolume setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BVolume setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BVolume setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BVolume setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public E2BVolume setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BVolume setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public E2BVolume setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public E2BVolume setVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }
    public String getVolumeID() {
        return this.volumeID;
    }

    public E2BVolume setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

    public static class E2BVolumeMountConfigVpcConfig extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The list of vSwitches.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze4l2vyhej6a6dwapm4q</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static E2BVolumeMountConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            E2BVolumeMountConfigVpcConfig self = new E2BVolumeMountConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public E2BVolumeMountConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public E2BVolumeMountConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public E2BVolumeMountConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class E2BVolumeMountConfig extends TeaModel {
        /**
         * <p>The RAM role that the user grants to the sandboxed container. After this role is set, the sandboxed container assumes the role to generate temporary access credentials. You can use the temporary access credentials of this role to mount storage in the sandboxed container, such as OSS and AgenticFS.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1673427197867277:role/aliyunfcdefaultrole</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         */
        @NameInMap("vpcConfig")
        public E2BVolumeMountConfigVpcConfig vpcConfig;

        public static E2BVolumeMountConfig build(java.util.Map<String, ?> map) throws Exception {
            E2BVolumeMountConfig self = new E2BVolumeMountConfig();
            return TeaModel.build(map, self);
        }

        public E2BVolumeMountConfig setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public E2BVolumeMountConfig setVpcConfig(E2BVolumeMountConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public E2BVolumeMountConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
