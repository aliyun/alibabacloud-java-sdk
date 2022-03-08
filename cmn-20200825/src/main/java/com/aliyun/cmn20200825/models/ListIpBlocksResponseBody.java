// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksResponseBody extends TeaModel {
    // 地址段对象
    @NameInMap("IpBlock")
    public java.util.List<ListIpBlocksResponseBodyIpBlock> ipBlock;

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksResponseBody self = new ListIpBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksResponseBody setIpBlock(java.util.List<ListIpBlocksResponseBodyIpBlock> ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public java.util.List<ListIpBlocksResponseBodyIpBlock> getIpBlock() {
        return this.ipBlock;
    }

    public ListIpBlocksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpBlocksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListIpBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpBlocksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpBlocksResponseBodyIpBlockTasksIpList extends TeaModel {
        // 设备ID
        @NameInMap("DevId")
        public String devId;

        // 设备名
        @NameInMap("DevName")
        public String devName;

        // Ip
        @NameInMap("Ip")
        public String ip;

        // 来源，SYSTEM表示系统校正
        @NameInMap("Origin")
        public String origin;

        // Ping
        @NameInMap("Ping")
        public String ping;

        public static ListIpBlocksResponseBodyIpBlockTasksIpList build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlockTasksIpList self = new ListIpBlocksResponseBodyIpBlockTasksIpList();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlockTasksIpList setDevId(String devId) {
            this.devId = devId;
            return this;
        }
        public String getDevId() {
            return this.devId;
        }

        public ListIpBlocksResponseBodyIpBlockTasksIpList setDevName(String devName) {
            this.devName = devName;
            return this;
        }
        public String getDevName() {
            return this.devName;
        }

        public ListIpBlocksResponseBodyIpBlockTasksIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListIpBlocksResponseBodyIpBlockTasksIpList setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ListIpBlocksResponseBodyIpBlockTasksIpList setPing(String ping) {
            this.ping = ping;
            return this;
        }
        public String getPing() {
            return this.ping;
        }

    }

    public static class ListIpBlocksResponseBodyIpBlockTasks extends TeaModel {
        // 探针
        @NameInMap("Domain")
        public String domain;

        // 创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 更新时间
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // Ip
        @NameInMap("Ip")
        public String ip;

        // IP列表
        @NameInMap("IpList")
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasksIpList> ipList;

        // 错误信息
        @NameInMap("Msg")
        public String msg;

        // 状态
        @NameInMap("Status")
        public String status;

        // 任务id
        @NameInMap("TaskId")
        public String taskId;

        // ip总数
        @NameInMap("TotalIpCount")
        public Long totalIpCount;

        public static ListIpBlocksResponseBodyIpBlockTasks build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlockTasks self = new ListIpBlocksResponseBodyIpBlockTasks();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlockTasks setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setIpList(java.util.List<ListIpBlocksResponseBodyIpBlockTasksIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasksIpList> getIpList() {
            return this.ipList;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListIpBlocksResponseBodyIpBlockTasks setTotalIpCount(Long totalIpCount) {
            this.totalIpCount = totalIpCount;
            return this;
        }
        public Long getTotalIpCount() {
            return this.totalIpCount;
        }

    }

    public static class ListIpBlocksResponseBodyIpBlockZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static ListIpBlocksResponseBodyIpBlockZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlockZoneLayer self = new ListIpBlocksResponseBodyIpBlockZoneLayer();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlockZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIpBlocksResponseBodyIpBlockZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpBlocksResponseBodyIpBlock extends TeaModel {
        // IP用途
        @NameInMap("Application")
        public String application;

        // 备份设备名称
        @NameInMap("BackupDeviceName")
        public String backupDeviceName;

        // 业务类型UID
        @NameInMap("BusinessTypeId")
        public String businessTypeId;

        // 业务类型名称
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        // 地址类别 IPV4
        @NameInMap("Category")
        public String category;

        // 备注
        @NameInMap("Description")
        public String description;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // IP段
        @NameInMap("IpBlockCode")
        public String ipBlockCode;

        // IP地址段UID
        @NameInMap("IpBlockId")
        public String ipBlockId;

        // 地址段子段列表
        @NameInMap("IpBlocks")
        public java.util.List<String> ipBlocks;

        // 是否锁定
        @NameInMap("IsLock")
        public Long isLock;

        // 限制园区类型
        @NameInMap("LimitZoneTypes")
        public String limitZoneTypes;

        // 公网地址类型 INC GUEST VIP
        @NameInMap("NetBusiness")
        public String netBusiness;

        // 公网私网标志 PUBLIC PRIVATE
        @NameInMap("NetType")
        public String netType;

        // IP归属
        @NameInMap("Ownership")
        public String ownership;

        // 父地址段UID
        @NameInMap("ParentId")
        public String parentId;

        // 状态： using available lock
        @NameInMap("Status")
        public String status;

        // 业务小类名称
        @NameInMap("SubBusinessTypeName")
        public String subBusinessTypeName;

        // 任务集
        @NameInMap("Tasks")
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasks> tasks;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> zoneLayer;

        // 园区名称
        @NameInMap("ZoneName")
        public String zoneName;

        public static ListIpBlocksResponseBodyIpBlock build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlock self = new ListIpBlocksResponseBodyIpBlock();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlock setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public ListIpBlocksResponseBodyIpBlock setBackupDeviceName(String backupDeviceName) {
            this.backupDeviceName = backupDeviceName;
            return this;
        }
        public String getBackupDeviceName() {
            return this.backupDeviceName;
        }

        public ListIpBlocksResponseBodyIpBlock setBusinessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }
        public String getBusinessTypeId() {
            return this.businessTypeId;
        }

        public ListIpBlocksResponseBodyIpBlock setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public ListIpBlocksResponseBodyIpBlock setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListIpBlocksResponseBodyIpBlock setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIpBlocksResponseBodyIpBlock setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlockCode(String ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }
        public String getIpBlockCode() {
            return this.ipBlockCode;
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlockId(String ipBlockId) {
            this.ipBlockId = ipBlockId;
            return this;
        }
        public String getIpBlockId() {
            return this.ipBlockId;
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlocks(java.util.List<String> ipBlocks) {
            this.ipBlocks = ipBlocks;
            return this;
        }
        public java.util.List<String> getIpBlocks() {
            return this.ipBlocks;
        }

        public ListIpBlocksResponseBodyIpBlock setIsLock(Long isLock) {
            this.isLock = isLock;
            return this;
        }
        public Long getIsLock() {
            return this.isLock;
        }

        public ListIpBlocksResponseBodyIpBlock setLimitZoneTypes(String limitZoneTypes) {
            this.limitZoneTypes = limitZoneTypes;
            return this;
        }
        public String getLimitZoneTypes() {
            return this.limitZoneTypes;
        }

        public ListIpBlocksResponseBodyIpBlock setNetBusiness(String netBusiness) {
            this.netBusiness = netBusiness;
            return this;
        }
        public String getNetBusiness() {
            return this.netBusiness;
        }

        public ListIpBlocksResponseBodyIpBlock setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListIpBlocksResponseBodyIpBlock setOwnership(String ownership) {
            this.ownership = ownership;
            return this;
        }
        public String getOwnership() {
            return this.ownership;
        }

        public ListIpBlocksResponseBodyIpBlock setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListIpBlocksResponseBodyIpBlock setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpBlocksResponseBodyIpBlock setSubBusinessTypeName(String subBusinessTypeName) {
            this.subBusinessTypeName = subBusinessTypeName;
            return this;
        }
        public String getSubBusinessTypeName() {
            return this.subBusinessTypeName;
        }

        public ListIpBlocksResponseBodyIpBlock setTasks(java.util.List<ListIpBlocksResponseBodyIpBlockTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasks> getTasks() {
            return this.tasks;
        }

        public ListIpBlocksResponseBodyIpBlock setZoneLayer(java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public ListIpBlocksResponseBodyIpBlock setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
