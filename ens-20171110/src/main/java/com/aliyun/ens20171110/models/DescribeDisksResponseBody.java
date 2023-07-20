// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Disks")
    public DescribeDisksResponseBodyDisks disks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDisksResponseBody setDisks(DescribeDisksResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDisksResponseBodyDisks getDisks() {
        return this.disks;
    }

    public DescribeDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisksResponseBodyDisksDisks extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiskChargeType")
        public String diskChargeType;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Portable")
        public Boolean portable;

        @NameInMap("SerialId")
        public String serialId;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeDisksResponseBodyDisksDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDisks self = new DescribeDisksResponseBodyDisksDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyDisksDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyDisksDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseBodyDisksDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyDisksDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyDisksDisks setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeDisksResponseBodyDisksDisks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDisksDisks setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDisksResponseBodyDisksDisks setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseBodyDisksDisks setSerialId(String serialId) {
            this.serialId = serialId;
            return this;
        }
        public String getSerialId() {
            return this.serialId;
        }

        public DescribeDisksResponseBodyDisksDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyDisksDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeDisksResponseBodyDisksDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyDisksDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeDisksResponseBodyDisks extends TeaModel {
        @NameInMap("Disks")
        public java.util.List<DescribeDisksResponseBodyDisksDisks> disks;

        public static DescribeDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisks self = new DescribeDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisks setDisks(java.util.List<DescribeDisksResponseBodyDisksDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDisks> getDisks() {
            return this.disks;
        }

    }

}
