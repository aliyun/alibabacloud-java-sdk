// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesRequest extends TeaModel {
    /**
     * <p>The file systems that you want to mount.</p>
     */
    @NameInMap("AdditionalVolumes")
    public java.util.List<UpdateClusterVolumesRequestAdditionalVolumes> additionalVolumes;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
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
         * <p>The type of the node to which the file system is mounted. Valid values:</p>
         * <ul>
         * <li>Manager: management node</li>
         * <li>Login: logon node</li>
         * <li>Compute: compute node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Compute&quot;]</p>
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
         * <p>The queue name of the file system to be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The on-premises mount directory of the file system to be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>/ff</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>The storage location of the file system to be mounted. Valid values:</p>
         * <ul>
         * <li>OnPremise: The file system is stored in a hybrid cloud.</li>
         * <li>PublicCloud: The file system cluster is stored in a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The remote directory to which the file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The array of the nodes to which the file system is mounted.</p>
         */
        @NameInMap("Roles")
        public java.util.List<UpdateClusterVolumesRequestAdditionalVolumesRoles> roles;

        /**
         * <p>The ID of the file system to be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-00b88****</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The mount option of the file system to be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>-t nfs -o vers=3,nolock,noresvport</p>
         */
        @NameInMap("VolumeMountOption")
        public String volumeMountOption;

        /**
         * <p>The endpoint of the mount target of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>0088****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The protocol type of the file system to be mounted. Valid values:</p>
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
         * <p>The type of the file system to be mounted. Set the value to NAS.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
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
