// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 地址段对象
    @NameInMap("IpBlock")
    public java.util.List<ListIpBlocksResponseBodyIpBlock> ipBlock;

    public static ListIpBlocksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksResponseBody self = new ListIpBlocksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListIpBlocksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpBlocksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListIpBlocksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpBlocksResponseBody setIpBlock(java.util.List<ListIpBlocksResponseBodyIpBlock> ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public java.util.List<ListIpBlocksResponseBodyIpBlock> getIpBlock() {
        return this.ipBlock;
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
        // IP地址段UID
        @NameInMap("IpBlockId")
        public String ipBlockId;

        // IP段
        @NameInMap("IpBlockCode")
        public String ipBlockCode;

        // 父地址段UID
        @NameInMap("ParentId")
        public String parentId;

        // 公网私网标志 PUBLIC PRIVATE
        @NameInMap("NetType")
        public String netType;

        // 状态： using available lock
        @NameInMap("Status")
        public String status;

        // IP归属
        @NameInMap("Ownership")
        public String ownership;

        // 地址类别 IPV4
        @NameInMap("Category")
        public String category;

        // 备注
        @NameInMap("Description")
        public String description;

        // 备份设备名称
        @NameInMap("BackupDeviceName")
        public String backupDeviceName;

        // 园区层级
        @NameInMap("ZoneLayer")
        public java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> zoneLayer;

        // 业务类型UID
        @NameInMap("BusinessTypeId")
        public String businessTypeId;

        // 业务类型名称
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        // 公网地址类型 INC GUEST VIP
        @NameInMap("NetBusiness")
        public String netBusiness;

        // IP用途
        @NameInMap("Application")
        public String application;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 园区名称
        @NameInMap("ZoneName")
        public String zoneName;

        // 地址段子段列表
        @NameInMap("IpBlocks")
        public java.util.List<String> ipBlocks;

        public static ListIpBlocksResponseBodyIpBlock build(java.util.Map<String, ?> map) throws Exception {
            ListIpBlocksResponseBodyIpBlock self = new ListIpBlocksResponseBodyIpBlock();
            return TeaModel.build(map, self);
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlockId(String ipBlockId) {
            this.ipBlockId = ipBlockId;
            return this;
        }
        public String getIpBlockId() {
            return this.ipBlockId;
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlockCode(String ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }
        public String getIpBlockCode() {
            return this.ipBlockCode;
        }

        public ListIpBlocksResponseBodyIpBlock setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListIpBlocksResponseBodyIpBlock setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListIpBlocksResponseBodyIpBlock setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpBlocksResponseBodyIpBlock setOwnership(String ownership) {
            this.ownership = ownership;
            return this;
        }
        public String getOwnership() {
            return this.ownership;
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

        public ListIpBlocksResponseBodyIpBlock setBackupDeviceName(String backupDeviceName) {
            this.backupDeviceName = backupDeviceName;
            return this;
        }
        public String getBackupDeviceName() {
            return this.backupDeviceName;
        }

        public ListIpBlocksResponseBodyIpBlock setZoneLayer(java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<ListIpBlocksResponseBodyIpBlockZoneLayer> getZoneLayer() {
            return this.zoneLayer;
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

        public ListIpBlocksResponseBodyIpBlock setNetBusiness(String netBusiness) {
            this.netBusiness = netBusiness;
            return this;
        }
        public String getNetBusiness() {
            return this.netBusiness;
        }

        public ListIpBlocksResponseBodyIpBlock setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public ListIpBlocksResponseBodyIpBlock setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListIpBlocksResponseBodyIpBlock setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

        public ListIpBlocksResponseBodyIpBlock setIpBlocks(java.util.List<String> ipBlocks) {
            this.ipBlocks = ipBlocks;
            return this;
        }
        public java.util.List<String> getIpBlocks() {
            return this.ipBlocks;
        }

    }

}
