// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateClusterVolumesRequest extends TeaModel {
    @NameInMap("AdditionalVolumes")
    public java.util.List<UpdateClusterVolumesRequestAdditionalVolumes> additionalVolumes;

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
        @NameInMap("JobQueue")
        public String jobQueue;

        @NameInMap("LocalDirectory")
        public String localDirectory;

        @NameInMap("Location")
        public String location;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("Roles")
        public java.util.List<UpdateClusterVolumesRequestAdditionalVolumesRoles> roles;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

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
