// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListVolumesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information of file systems that are mounted on E-HPC clusters.</p>
     */
    @NameInMap("Volumes")
    public ListVolumesResponseBodyVolumes volumes;

    public static ListVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVolumesResponseBody self = new ListVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVolumesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListVolumesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVolumesResponseBody setVolumes(ListVolumesResponseBodyVolumes volumes) {
        this.volumes = volumes;
        return this;
    }
    public ListVolumesResponseBodyVolumes getVolumes() {
        return this.volumes;
    }

    public static class ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo extends TeaModel {
        /**
         * <p>The queue to which the job belongs.</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The local mount directory.</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The node is deployed on a hybrid cloud.</p>
         * <p>*   PublicCloud: The cluster is deployed on a public cloud.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The remote directory on which the file system is mounted.</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The type of the node on which the file system is mounted. Valid values:</p>
         * <br>
         * <p>*   Manager: management node</p>
         * <p>*   Login: logon node</p>
         * <p>*   Compute: compute node</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The domain name of the mount target.</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The type of the storage protocol. Valid values:</p>
         * <br>
         * <p>*   NFS</p>
         * <p>*   SMB</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the additional file system. Only NAS is supported.</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        public static ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo self = new ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

    public static class ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes extends TeaModel {
        @NameInMap("VolumeInfo")
        public java.util.List<ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo> volumeInfo;

        public static ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes self = new ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes setVolumeInfo(java.util.List<ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo> volumeInfo) {
            this.volumeInfo = volumeInfo;
            return this;
        }
        public java.util.List<ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumesVolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

    }

    public static class ListVolumesResponseBodyVolumesVolumeInfo extends TeaModel {
        /**
         * <p>The information of additional file systems mounted on E-HPC clusters.</p>
         */
        @NameInMap("AdditionalVolumes")
        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes additionalVolumes;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remote directory on which the file system is mounted.</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The domain name of the mount target.</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The type of the storage protocol. Valid values:</p>
         * <br>
         * <p>*   NFS</p>
         * <p>*   SMB</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the file system that is mounted on the cluster. Only NAS is supported.</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        public static ListVolumesResponseBodyVolumesVolumeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumesVolumeInfo self = new ListVolumesResponseBodyVolumesVolumeInfo();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setAdditionalVolumes(ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes additionalVolumes) {
            this.additionalVolumes = additionalVolumes;
            return this;
        }
        public ListVolumesResponseBodyVolumesVolumeInfoAdditionalVolumes getAdditionalVolumes() {
            return this.additionalVolumes;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public ListVolumesResponseBodyVolumesVolumeInfo setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

    public static class ListVolumesResponseBodyVolumes extends TeaModel {
        @NameInMap("VolumeInfo")
        public java.util.List<ListVolumesResponseBodyVolumesVolumeInfo> volumeInfo;

        public static ListVolumesResponseBodyVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumes self = new ListVolumesResponseBodyVolumes();
            return TeaModel.build(map, self);
        }

        public ListVolumesResponseBodyVolumes setVolumeInfo(java.util.List<ListVolumesResponseBodyVolumesVolumeInfo> volumeInfo) {
            this.volumeInfo = volumeInfo;
            return this;
        }
        public java.util.List<ListVolumesResponseBodyVolumesVolumeInfo> getVolumeInfo() {
            return this.volumeInfo;
        }

    }

}
