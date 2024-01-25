// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListNodesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNodesResponseBodyData> data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesResponseBody self = new ListNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesResponseBody setData(java.util.List<ListNodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesResponseBodyData> getData() {
        return this.data;
    }

    public ListNodesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListNodesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListNodesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodesResponseBodyDataEcsNodeDtoList extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("CpuCount")
        public Integer cpuCount;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MemorySize")
        public Integer memorySize;

        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        @NameInMap("NodeGroupType")
        public String nodeGroupType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeResourceType")
        public String nodeResourceType;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("RunningTime")
        public Long runningTime;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SystemDiskCapacity")
        public Integer systemDiskCapacity;

        @NameInMap("SystemDiskCount")
        public Integer systemDiskCount;

        @NameInMap("SystemDiskType")
        public String systemDiskType;

        public static ListNodesResponseBodyDataEcsNodeDtoList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyDataEcsNodeDtoList self = new ListNodesResponseBodyDataEcsNodeDtoList();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }
        public String getNodeGroupType() {
            return this.nodeGroupType;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeResourceType(String nodeResourceType) {
            this.nodeResourceType = nodeResourceType;
            return this;
        }
        public String getNodeResourceType() {
            return this.nodeResourceType;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setSystemDiskCapacity(Integer systemDiskCapacity) {
            this.systemDiskCapacity = systemDiskCapacity;
            return this;
        }
        public Integer getSystemDiskCapacity() {
            return this.systemDiskCapacity;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setSystemDiskCount(Integer systemDiskCount) {
            this.systemDiskCount = systemDiskCount;
            return this;
        }
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        public ListNodesResponseBodyDataEcsNodeDtoList setSystemDiskType(String systemDiskType) {
            this.systemDiskType = systemDiskType;
            return this;
        }
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

    }

    public static class ListNodesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EcsNodeDtoList")
        public java.util.List<ListNodesResponseBodyDataEcsNodeDtoList> ecsNodeDtoList;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceConf")
        public java.util.Map<String, ?> instanceConf;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static ListNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesResponseBodyData self = new ListNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNodesResponseBodyData setEcsNodeDtoList(java.util.List<ListNodesResponseBodyDataEcsNodeDtoList> ecsNodeDtoList) {
            this.ecsNodeDtoList = ecsNodeDtoList;
            return this;
        }
        public java.util.List<ListNodesResponseBodyDataEcsNodeDtoList> getEcsNodeDtoList() {
            return this.ecsNodeDtoList;
        }

        public ListNodesResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListNodesResponseBodyData setInstanceConf(java.util.Map<String, ?> instanceConf) {
            this.instanceConf = instanceConf;
            return this;
        }
        public java.util.Map<String, ?> getInstanceConf() {
            return this.instanceConf;
        }

        public ListNodesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNodesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
