// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeProtocolServiceResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>aBcdeg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about protocol service list.</p>
     */
    @NameInMap("ProtocolServices")
    public java.util.List<DescribeProtocolServiceResponseBodyProtocolServices> protocolServices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProtocolServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtocolServiceResponseBody self = new DescribeProtocolServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtocolServiceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProtocolServiceResponseBody setProtocolServices(java.util.List<DescribeProtocolServiceResponseBodyProtocolServices> protocolServices) {
        this.protocolServices = protocolServices;
        return this;
    }
    public java.util.List<DescribeProtocolServiceResponseBodyProtocolServices> getProtocolServices() {
        return this.protocolServices;
    }

    public DescribeProtocolServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeProtocolServiceResponseBodyProtocolServices extends TeaModel {
        /**
         * <p>The time when the protocol service was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T07:28:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the protocol service.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The base throughput of the protocol service. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceBaseThroughput")
        public Integer instanceBaseThroughput;

        /**
         * <p>The burst throughput of the protocol service. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceBurstThroughput")
        public Integer instanceBurstThroughput;

        /**
         * <p>The memory cache size of the protocol service. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceRAM")
        public Integer instanceRAM;

        /**
         * <p>The time when the protocol service was modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T07:28:38Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The total number of CPFS directories and filesets exported in the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MountTargetCount")
        public Integer mountTargetCount;

        /**
         * <p>The ID of the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-197ed6a00f2b****</p>
         */
        @NameInMap("ProtocolServiceId")
        public String protocolServiceId;

        /**
         * <p>The specification of the protocol service.</p>
         * <ul>
         * <li>Valid value: General.</li>
         * <li>Default value: General.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("ProtocolSpec")
        public String protocolSpec;

        /**
         * <p>The throughput of the protocol service. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ProtocolThroughput")
        public Integer protocolThroughput;

        /**
         * <p>The protocol type supported by the protocol service.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NFS: The protocol service supports access over the Network File System (NFS) protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The status of the protocol service.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating: The protocol service is being created.</li>
         * <li>Starting: The protocol service is being started.</li>
         * <li>Running: The protocol service is running.</li>
         * <li>Updating: The protocol service is being updated.</li>
         * <li>Deleting: The protocol service is being deleted.</li>
         * <li>Stopping: The protocol service is being stopped.</li>
         * <li>Stopped: The protocol service is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The VSW ID associated with the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-123xxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID associated with the protocol service.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-123xxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeProtocolServiceResponseBodyProtocolServices build(java.util.Map<String, ?> map) throws Exception {
            DescribeProtocolServiceResponseBodyProtocolServices self = new DescribeProtocolServiceResponseBodyProtocolServices();
            return TeaModel.build(map, self);
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setInstanceBaseThroughput(Integer instanceBaseThroughput) {
            this.instanceBaseThroughput = instanceBaseThroughput;
            return this;
        }
        public Integer getInstanceBaseThroughput() {
            return this.instanceBaseThroughput;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setInstanceBurstThroughput(Integer instanceBurstThroughput) {
            this.instanceBurstThroughput = instanceBurstThroughput;
            return this;
        }
        public Integer getInstanceBurstThroughput() {
            return this.instanceBurstThroughput;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setInstanceRAM(Integer instanceRAM) {
            this.instanceRAM = instanceRAM;
            return this;
        }
        public Integer getInstanceRAM() {
            return this.instanceRAM;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setMountTargetCount(Integer mountTargetCount) {
            this.mountTargetCount = mountTargetCount;
            return this;
        }
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setProtocolServiceId(String protocolServiceId) {
            this.protocolServiceId = protocolServiceId;
            return this;
        }
        public String getProtocolServiceId() {
            return this.protocolServiceId;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setProtocolSpec(String protocolSpec) {
            this.protocolSpec = protocolSpec;
            return this;
        }
        public String getProtocolSpec() {
            return this.protocolSpec;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setProtocolThroughput(Integer protocolThroughput) {
            this.protocolThroughput = protocolThroughput;
            return this;
        }
        public Integer getProtocolThroughput() {
            return this.protocolThroughput;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeProtocolServiceResponseBodyProtocolServices setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
