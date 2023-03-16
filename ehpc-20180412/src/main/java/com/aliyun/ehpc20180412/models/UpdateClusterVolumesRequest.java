// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesRequest extends TeaModel {
    @NameInMap("AdditionalVolumes")
    public java.util.List<UpdateClusterVolumesRequestAdditionalVolumes> additionalVolumes;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UpdateClusterVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterVolumesRequest self = new UpdateClusterVolumesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterVolumesRequest setAdditionalVolumes(java.util.List<UpdateClusterVolumesRequestAdditionalVolumes> additionalVolumes) {
        this.additionalVolumes = additionalVolumes;
        return this;
    }
    public java.util.List<UpdateClusterVolumesRequestAdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    public UpdateClusterVolumesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class UpdateClusterVolumesRequestAdditionalVolumesRoles extends TeaModel {
        /**
         * <p>The node type on which the nth additional mounted file system is mounted. Valid values:</p>
         * <br>
         * <p>*   Manager: management node</p>
         * <p>*   Login: logon node</p>
         * <p>*   Compute: compute node</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateClusterVolumesRequestAdditionalVolumesRoles build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterVolumesRequestAdditionalVolumesRoles self = new UpdateClusterVolumesRequestAdditionalVolumesRoles();
            return TeaModel.build(map, self);
        }

        public UpdateClusterVolumesRequestAdditionalVolumesRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateClusterVolumesRequestAdditionalVolumes extends TeaModel {
        /**
         * <p>The queue name of the nth attached mounted filesystem.</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The on-premises mount directory for the nth additional mounted file system.</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>The storage location of the nth attached mounted file system. Valid values:</p>
         * <br>
         * <p>*   OnPremise: hybrid cloud cluster</p>
         * <p>*   PublicCloud: public cloud cluster</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The remote directory to be mounted by the nth additional mounted file system.</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("Roles")
        public java.util.List<UpdateClusterVolumesRequestAdditionalVolumesRoles> roles;

        /**
         * <p>The ID of the nth additional mounted file system.</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("VolumeMountOption")
        public String volumeMountOption;

        /**
         * <p>The domain name of the mount target for the nth additional mounted file system.</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The protocol type of the nth additional mounted file system. Valid values:</p>
         * <br>
         * <p>*   NFS</p>
         * <p>*   SMB</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the nth additional mounted file system. Currently, only NAS is supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        public static UpdateClusterVolumesRequestAdditionalVolumes build(java.util.Map<String, ?> map) throws Exception {
            UpdateClusterVolumesRequestAdditionalVolumes self = new UpdateClusterVolumesRequestAdditionalVolumes();
            return TeaModel.build(map, self);
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setRoles(java.util.List<UpdateClusterVolumesRequestAdditionalVolumesRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<UpdateClusterVolumesRequestAdditionalVolumesRoles> getRoles() {
            return this.roles;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setVolumeMountOption(String volumeMountOption) {
            this.volumeMountOption = volumeMountOption;
            return this;
        }
        public String getVolumeMountOption() {
            return this.volumeMountOption;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public UpdateClusterVolumesRequestAdditionalVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

}
