// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeStorageVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageVolumes")
    public java.util.List<DescribeStorageVolumeResponseBodyStorageVolumes> storageVolumes;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeStorageVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageVolumeResponseBody self = new DescribeStorageVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageVolumeResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeStorageVolumeResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeStorageVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStorageVolumeResponseBody setStorageVolumes(java.util.List<DescribeStorageVolumeResponseBodyStorageVolumes> storageVolumes) {
        this.storageVolumes = storageVolumes;
        return this;
    }
    public java.util.List<DescribeStorageVolumeResponseBodyStorageVolumes> getStorageVolumes() {
        return this.storageVolumes;
    }

    public DescribeStorageVolumeResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeStorageVolumeResponseBodyStorageVolumes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CHAP</p>
         */
        @NameInMap("AuthProtocol")
        public String authProtocol;

        /**
         * <strong>example:</strong>
         * <p>2024-03-14T09:35:32Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen-3</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsAuth")
        public Integer isAuth;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsEnable")
        public Integer isEnable;

        /**
         * <strong>example:</strong>
         * <p>available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>sgw-***</p>
         */
        @NameInMap("StorageGatewayId")
        public String storageGatewayId;

        /**
         * <strong>example:</strong>
         * <p>d-***</p>
         */
        @NameInMap("StorageId")
        public String storageId;

        /**
         * <strong>example:</strong>
         * <p>sv-***</p>
         */
        @NameInMap("StorageVolumeId")
        public String storageVolumeId;

        /**
         * <strong>example:</strong>
         * <p>testVolumeName</p>
         */
        @NameInMap("StorageVolumeName")
        public String storageVolumeName;

        /**
         * <strong>example:</strong>
         * <p>iqn.<em>.</em>.<em>:</em></p>
         */
        @NameInMap("TargetName")
        public String targetName;

        public static DescribeStorageVolumeResponseBodyStorageVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeStorageVolumeResponseBodyStorageVolumes self = new DescribeStorageVolumeResponseBodyStorageVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setAuthProtocol(String authProtocol) {
            this.authProtocol = authProtocol;
            return this;
        }
        public String getAuthProtocol() {
            return this.authProtocol;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setIsAuth(Integer isAuth) {
            this.isAuth = isAuth;
            return this;
        }
        public Integer getIsAuth() {
            return this.isAuth;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setIsEnable(Integer isEnable) {
            this.isEnable = isEnable;
            return this;
        }
        public Integer getIsEnable() {
            return this.isEnable;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setStorageGatewayId(String storageGatewayId) {
            this.storageGatewayId = storageGatewayId;
            return this;
        }
        public String getStorageGatewayId() {
            return this.storageGatewayId;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setStorageId(String storageId) {
            this.storageId = storageId;
            return this;
        }
        public String getStorageId() {
            return this.storageId;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setStorageVolumeId(String storageVolumeId) {
            this.storageVolumeId = storageVolumeId;
            return this;
        }
        public String getStorageVolumeId() {
            return this.storageVolumeId;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setStorageVolumeName(String storageVolumeName) {
            this.storageVolumeName = storageVolumeName;
            return this;
        }
        public String getStorageVolumeName() {
            return this.storageVolumeName;
        }

        public DescribeStorageVolumeResponseBodyStorageVolumes setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

    }

}
