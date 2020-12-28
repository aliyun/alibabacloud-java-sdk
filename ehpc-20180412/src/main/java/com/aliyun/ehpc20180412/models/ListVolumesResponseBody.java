// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListVolumesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Volumes")
    public java.util.List<ListVolumesResponseBodyVolumes> volumes;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVolumesResponseBody self = new ListVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVolumesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVolumesResponseBody setVolumes(java.util.List<ListVolumesResponseBodyVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<ListVolumesResponseBodyVolumes> getVolumes() {
        return this.volumes;
    }

    public ListVolumesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVolumesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListVolumesResponseBodyVolumesAdditionalVolumes extends TeaModel {
        @NameInMap("JobQueue")
        public String jobQueue;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("Role")
        public String role;

        @NameInMap("LocalDirectory")
        public String localDirectory;

        @NameInMap("VolumeType")
        public String volumeType;

        @NameInMap("Location")
        public String location;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        public static ListVolumesResponseBodyVolumesAdditionalVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumesAdditionalVolumes self = new ListVolumesResponseBodyVolumesAdditionalVolumes();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListVolumesResponseBodyVolumesAdditionalVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

    }

    public static class ListVolumesResponseBodyVolumes extends TeaModel {
        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("AdditionalVolumes")
        public java.util.List<ListVolumesResponseBodyVolumesAdditionalVolumes> additionalVolumes;

        @NameInMap("VolumeType")
        public String volumeType;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListVolumesResponseBodyVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumes self = new ListVolumesResponseBodyVolumes();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public ListVolumesResponseBodyVolumes setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListVolumesResponseBodyVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public ListVolumesResponseBodyVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public ListVolumesResponseBodyVolumes setAdditionalVolumes(java.util.List<ListVolumesResponseBodyVolumesAdditionalVolumes> additionalVolumes) {
            this.additionalVolumes = additionalVolumes;
            return this;
        }
        public java.util.List<ListVolumesResponseBodyVolumesAdditionalVolumes> getAdditionalVolumes() {
            return this.additionalVolumes;
        }

        public ListVolumesResponseBodyVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public ListVolumesResponseBodyVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public ListVolumesResponseBodyVolumes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVolumesResponseBodyVolumes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
