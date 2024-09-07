// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemsResponseBody extends TeaModel {
    @NameInMap("FileSystemList")
    public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemList> fileSystemList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>BF4E8AB1-02A3-5ECF-87CC-3AB7BE98**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>c0967****.cn-hangzhou.cpfs.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-2ze0c41hwu7lc29ris***</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
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
         * <strong>example:</strong>
         * <p>2024-7-29 15:43:53</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2fa0248***</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>cpfs</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("MountTargetList")
        public java.util.List<ListAvailableFileSystemsResponseBodyFileSystemListMountTargetList> mountTargetList;

        /**
         * <strong>example:</strong>
         * <p>cpfs</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
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
