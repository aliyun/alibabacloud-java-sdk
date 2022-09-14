// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ListVolumesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public static class ListVolumesResponseBodyVolumesVolumeInfo extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        @NameInMap("VolumeType")
        public String volumeType;

        public static ListVolumesResponseBodyVolumesVolumeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVolumesResponseBodyVolumesVolumeInfo self = new ListVolumesResponseBodyVolumesVolumeInfo();
            return TeaModel.build(map, self);
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
