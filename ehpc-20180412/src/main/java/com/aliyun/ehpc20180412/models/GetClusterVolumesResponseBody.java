// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesResponseBody extends TeaModel {
    @NameInMap("Volumes")
    public java.util.List<GetClusterVolumesResponseBodyVolumes> volumes;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetClusterVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterVolumesResponseBody self = new GetClusterVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterVolumesResponseBody setVolumes(java.util.List<GetClusterVolumesResponseBodyVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<GetClusterVolumesResponseBodyVolumes> getVolumes() {
        return this.volumes;
    }

    public GetClusterVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterVolumesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class GetClusterVolumesResponseBodyVolumesRoles extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetClusterVolumesResponseBodyVolumesRoles build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumesRoles self = new GetClusterVolumesResponseBodyVolumesRoles();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumesRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetClusterVolumesResponseBodyVolumes extends TeaModel {
        @NameInMap("JobQueue")
        public String jobQueue;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("Roles")
        public java.util.List<GetClusterVolumesResponseBodyVolumesRoles> roles;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("LocalDirectory")
        public String localDirectory;

        @NameInMap("VolumeType")
        public String volumeType;

        @NameInMap("MustKeep")
        public Boolean mustKeep;

        @NameInMap("Location")
        public String location;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        public static GetClusterVolumesResponseBodyVolumes build(java.util.Map<String, ?> map) throws Exception {
            GetClusterVolumesResponseBodyVolumes self = new GetClusterVolumesResponseBodyVolumes();
            return TeaModel.build(map, self);
        }

        public GetClusterVolumesResponseBodyVolumes setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public GetClusterVolumesResponseBodyVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public GetClusterVolumesResponseBodyVolumes setRoles(java.util.List<GetClusterVolumesResponseBodyVolumesRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetClusterVolumesResponseBodyVolumesRoles> getRoles() {
            return this.roles;
        }

        public GetClusterVolumesResponseBodyVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public GetClusterVolumesResponseBodyVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public GetClusterVolumesResponseBodyVolumes setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public GetClusterVolumesResponseBodyVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public GetClusterVolumesResponseBodyVolumes setMustKeep(Boolean mustKeep) {
            this.mustKeep = mustKeep;
            return this;
        }
        public Boolean getMustKeep() {
            return this.mustKeep;
        }

        public GetClusterVolumesResponseBodyVolumes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetClusterVolumesResponseBodyVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

    }

}
