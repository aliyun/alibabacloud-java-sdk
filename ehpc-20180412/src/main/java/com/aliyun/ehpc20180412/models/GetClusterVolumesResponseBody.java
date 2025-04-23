// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesResponseBody extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BCFD52E-0336-4490-AE7D-F560F106****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The array of the file system mounted to the E-HPC cluster.</p>
     */
    @NameInMap("Volumes")
    public GetClusterVolumesResponseBodyVolumes volumes;

    public static GetClusterVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterVolumesResponseBody self = new GetClusterVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterVolumesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetClusterVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterVolumesResponseBody setVolumes(GetClusterVolumesResponseBodyVolumes volumes) {
        this.volumes = volumes;
        return this;
    }
    public GetClusterVolumesResponseBodyVolumes getVolumes() {
        return this.volumes;
    }

    public static class GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo extends TeaModel {
        /**
         * <p>The type of the node on which the file system is mounted. Valid values:</p>
         * <ul>
         * <li>Compute: compute node</li>
         * <li>Manager: management node</li>
         * <li>Login: logon node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Compute</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo self = new GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetClusterVolumesResponseBodyVolumesVolumeInfoRoles extends TeaModel {
        @NameInMap("RoleInfo")
        public java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo> roleInfo;

        public static GetClusterVolumesResponseBodyVolumesVolumeInfoRoles build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumesVolumeInfoRoles self = new GetClusterVolumesResponseBodyVolumesVolumeInfoRoles();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfoRoles setRoleInfo(java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo> roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfoRolesRoleInfo> getRoleInfo() {
            return this.roleInfo;
        }

    }

    public static class GetClusterVolumesResponseBodyVolumesVolumeInfo extends TeaModel {
        /**
         * <p>The queue of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>workq</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/ehpcdata</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>The type of cluster. Valid values:</p>
         * <ul>
         * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>Indicates whether the resource can be unmounted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MustKeep")
        public Boolean mustKeep;

        /**
         * <p>The remote mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The array of the node on which the file system is mounted.</p>
         */
        @NameInMap("Roles")
        public GetClusterVolumesResponseBodyVolumesVolumeInfoRoles roles;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>0e754****</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The address of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>0e754****-kal90.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The storage protocol type of the file system. Valid values:</p>
         * <ul>
         * <li>NFS</li>
         * <li>SMB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the file system. Valid values:</p>
         * <ul>
         * <li>NAS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        public static GetClusterVolumesResponseBodyVolumesVolumeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumesVolumeInfo self = new GetClusterVolumesResponseBodyVolumesVolumeInfo();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setMustKeep(Boolean mustKeep) {
            this.mustKeep = mustKeep;
            return this;
        }
        public Boolean getMustKeep() {
            return this.mustKeep;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setRoles(GetClusterVolumesResponseBodyVolumesVolumeInfoRoles roles) {
            this.roles = roles;
            return this;
        }
        public GetClusterVolumesResponseBodyVolumesVolumeInfoRoles getRoles() {
            return this.roles;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public GetClusterVolumesResponseBodyVolumesVolumeInfo setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

    public static class GetClusterVolumesResponseBodyVolumes extends TeaModel {
        @NameInMap("VolumeInfo")
        public java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfo> volumeInfo;

        public static GetClusterVolumesResponseBodyVolumes build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumes self = new GetClusterVolumesResponseBodyVolumes();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumes setVolumeInfo(java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfo> volumeInfo) {
            this.volumeInfo = volumeInfo;
            return this;
        }
        public java.util.List<GetClusterVolumesResponseBodyVolumesVolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

    }

}
