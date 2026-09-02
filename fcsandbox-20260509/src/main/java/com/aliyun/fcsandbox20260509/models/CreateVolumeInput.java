// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateVolumeInput extends TeaModel {
    /**
     * <p>The AgenticFS configuration.</p>
     */
    @NameInMap("agenticFSVolumeConfig")
    public AgenticFSVolumeConfig agenticFSVolumeConfig;

    /**
     * <p>The mount configuration.</p>
     */
    @NameInMap("mountConfig")
    public CreateVolumeInputMountConfig mountConfig;

    /**
     * <p>The OSS configuration.</p>
     */
    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The name, which must be unique within the team.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static CreateVolumeInput build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumeInput self = new CreateVolumeInput();
        return TeaModel.build(map, self);
    }

    public CreateVolumeInput setAgenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public CreateVolumeInput setMountConfig(CreateVolumeInputMountConfig mountConfig) {
        this.mountConfig = mountConfig;
        return this;
    }
    public CreateVolumeInputMountConfig getMountConfig() {
        return this.mountConfig;
    }

    public CreateVolumeInput setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public CreateVolumeInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public CreateVolumeInput setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

    public static class CreateVolumeInputMountConfigVpcConfig extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The list of vSwitches.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbq8hbepimf6lr7uyqub</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateVolumeInputMountConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVolumeInputMountConfigVpcConfig self = new CreateVolumeInputMountConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public CreateVolumeInputMountConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateVolumeInputMountConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateVolumeInputMountConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateVolumeInputMountConfig extends TeaModel {
        /**
         * <p>The RAM role that the user grants to the cloud sandbox. After this role is set, the cloud sandbox assumes the role to generate temporary access credentials. You can use the temporary access credentials of this role to mount storage in the cloud sandbox, such as OSS and AgenticFS.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1338904783509062:role/aliyunfcdefaultrole</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The VPC configuration.</p>
         */
        @NameInMap("vpcConfig")
        public CreateVolumeInputMountConfigVpcConfig vpcConfig;

        public static CreateVolumeInputMountConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVolumeInputMountConfig self = new CreateVolumeInputMountConfig();
            return TeaModel.build(map, self);
        }

        public CreateVolumeInputMountConfig setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateVolumeInputMountConfig setVpcConfig(CreateVolumeInputMountConfigVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public CreateVolumeInputMountConfigVpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
