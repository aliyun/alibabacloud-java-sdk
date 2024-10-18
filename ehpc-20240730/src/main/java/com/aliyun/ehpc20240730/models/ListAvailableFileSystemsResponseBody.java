// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The file systems.</p>
     */
    @NameInMap("FileSystemList")
    public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemList> fileSystemList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF4E8AB1-02A3-5ECF-87CC-3AB7BE98**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>65</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAvailableFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableFileSystemsResponseBody self = new ListAvailableFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableFileSystemsResponseBody setFileSystemList(java.util.List<ListAvailableFileSystemsResponseBodyFileSystemList> fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemList> getFileSystemList() {
        return this.fileSystemList;
    }

    public ListAvailableFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableFileSystemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAvailableFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList extends TeaModel {
        /**
         * <p>The address of the mount target.</p>
         * 
         * <strong>example:</strong>
         * <p>c0967****.cn-hangzhou.cpfs.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type. Valid values: Valid values:</p>
         * <ul>
         * <li>vpc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The state of the mount target. Valid values:</p>
         * <ul>
         * <li>Active: The mount target is available.</li>
         * <li>Inactive: The mount target is unavailable.</li>
         * <li>Pending: The mount target is being mounted.</li>
         * <li>Deleting: The mount target is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze0c41hwu7lc29ris***</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbvb34rtyh6xb3zrehs1****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList self = new ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList();
            return TeaModel.build(map, self);
        }

        public ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListAvailableFileSystemsResponseBodyFileSystemList extends TeaModel {
        /**
         * <p>The time when the file system was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-7-29 15:43:53</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>2fa0248***</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The type of the file system. Valid values:</p>
         * <ul>
         * <li>standard: general-purpose network-attached storage (NAS) file system</li>
         * <li>extreme: extreme NAS file system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpfs</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The mount targets of the file system.</p>
         */
        @NameInMap("MountTargetList")
        public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList> mountTargetList;

        /**
         * <p>The protocol type of the file system. Valid values:</p>
         * <ul>
         * <li>nfs</li>
         * <li>smb</li>
         * <li>cpfs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpfs</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The state of the file system. Valid values:</p>
         * <ul>
         * <li>Pending: The file system is processing a task.</li>
         * <li>Running: The file system is available. You can perform subsequent operations, such as creating a mount target, only when the file system is in the Running state.</li>
         * <li>Stopped: The file system is unavailable.</li>
         * <li>Extending: The file system is being scaled out.</li>
         * <li>Stopping: The file system is being stopped.</li>
         * <li>Deleting: The file system is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type of the file system.</p>
         * <ul>
         * <li>Valid values if FileSystemType is set to standard: Capacity and Performance.</li>
         * <li>Valid values if FileSystemType is set to extreme: standard and advance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp132kgui8n0targb****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListAvailableFileSystemsResponseBodyFileSystemList build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableFileSystemsResponseBodyFileSystemList self = new ListAvailableFileSystemsResponseBodyFileSystemList();
            return TeaModel.build(map, self);
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setMountTargetList(java.util.List<ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList> mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList> getMountTargetList() {
            return this.mountTargetList;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListAvailableFileSystemsResponseBodyFileSystemList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
