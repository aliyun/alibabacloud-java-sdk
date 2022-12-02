// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksResponseBody extends TeaModel {
    @NameInMap("IpBlock")
    public java.util.List<ListIpBlocksResponseBodyIpBlock> ipBlock;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DevId")
        public String devId;

        @NameInMap("DevName")
        public String devName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Origin")
        public String origin;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpList")
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasksIpList> ipList;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Abbr")
        public String abbr;

        @NameInMap("Application")
        public String application;

        @NameInMap("BackupDeviceName")
        public String backupDeviceName;

        @NameInMap("BusinessTypeId")
        public String businessTypeId;

        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IpBlockCode")
        public String ipBlockCode;

        @NameInMap("IpBlockId")
        public String ipBlockId;

        @NameInMap("IpBlocks")
        public java.util.List<String> ipBlocks;

        @NameInMap("IsLock")
        public Long isLock;

        @NameInMap("LimitZoneTypes")
        public String limitZoneTypes;

        @NameInMap("NetBusiness")
        public String netBusiness;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Ownership")
        public String ownership;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("QueryIpList")
        public java.util.List<String> queryIpList;

        @NameInMap("SplitRate")
        public Double splitRate;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubBusinessTypeName")
        public String subBusinessTypeName;

        @NameInMap("Tasks")
        public java.util.List<ListIpBlocksResponseBodyIpBlockTasks> tasks;

        @NameInMap("ZoneLayer")
        public java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> zoneLayer;

        @NameInMap("ZoneName")
        public String zoneName;

        public static ListIpBlocksResponseBodyIpBlock build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlock self = new ListIpBlocksResponseBodyIpBlock();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlock setAbbr(String abbr) {
            this.abbr = abbr;
            return this;
        }
        public String getAbbr() {
            return this.abbr;
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

        public ListIpBlocksResponseBodyIpBlock setQueryIpList(java.util.List<String> queryIpList) {
            this.queryIpList = queryIpList;
            return this;
        }
        public java.util.List<String> getQueryIpList() {
            return this.queryIpList;
        }

        public ListIpBlocksResponseBodyIpBlock setSplitRate(Double splitRate) {
            this.splitRate = splitRate;
            return this;
        }
        public Double getSplitRate() {
            return this.splitRate;
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
