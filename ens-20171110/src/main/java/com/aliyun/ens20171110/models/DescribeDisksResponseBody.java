// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the disks.</p>
     */
    @NameInMap("Disks")
    public DescribeDisksResponseBodyDisks disks;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned pages.</p>
     */
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
        /**
         * <p>The category of the disk.</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk.</p>
         * <p>*   cloud_ssd: all-flash disk.</p>
         * <p>*   local_hdd: local HDD.</p>
         * <p>*   local_ssd: local SSD.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The billing method of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>*   **prepaid**: subscription.</p>
         * <p>*   **postpaid**: pay-as-you-go.</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the cloud disk is encrypted. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used for the cloud disk.</p>
         */
        @NameInMap("EncryptedKeyId")
        public String encryptedKeyId;

        /**
         * <p>The ID of the edge node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the cloud disk or local disk is removable. Valid values:</p>
         * <br>
         * <p>*   true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.</p>
         * <p>*   false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.</p>
         * <br>
         * <p>If disks are of the following categories or types, the **Portable** value is **false** and the disks have the same lifecycle as their attached instances:</p>
         * <br>
         * <p>*   Local HDDs</p>
         * <p>*   Local SSDs</p>
         * <p>*   Data disks that use the subscription billing method</p>
         */
        @NameInMap("Portable")
        public Boolean portable;

        /**
         * <p>The serial number.</p>
         */
        @NameInMap("SerialId")
        public String serialId;

        /**
         * <p>The size of the disk. Unit: MiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The status of the disk. Valid values:</p>
         * <br>
         * <p>*   In-use: The disk is in use.</p>
         * <p>*   Available: The disk can be attached.</p>
         * <p>*   Attaching: The disk is being attached.</p>
         * <p>*   Detaching: The disk is being detached.</p>
         * <p>*   Creating: The disk is being created.</p>
         * <p>*   ReIniting: The disk is being reset.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>*   1: system disk.</p>
         * <p>*   2: data disk.</p>
         */
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

        public DescribeDisksResponseBodyDisksDisks setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyDisksDisks setEncryptedKeyId(String encryptedKeyId) {
            this.encryptedKeyId = encryptedKeyId;
            return this;
        }
        public String getEncryptedKeyId() {
            return this.encryptedKeyId;
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
