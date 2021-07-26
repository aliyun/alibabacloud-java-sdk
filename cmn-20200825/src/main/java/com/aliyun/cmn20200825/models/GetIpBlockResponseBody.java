// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 园区类型对象
    @NameInMap("IpBlock")
    public GetIpBlockResponseBodyIpBlock ipBlock;

    public static GetIpBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockResponseBody self = new GetIpBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIpBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIpBlockResponseBody setIpBlock(GetIpBlockResponseBodyIpBlock ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public GetIpBlockResponseBodyIpBlock getIpBlock() {
        return this.ipBlock;
    }

    public static class GetIpBlockResponseBodyIpBlockZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static GetIpBlockResponseBodyIpBlockZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            GetIpBlockResponseBodyIpBlockZoneLayer self = new GetIpBlockResponseBodyIpBlockZoneLayer();
            return TeaModel.build(map, self);
        }

        public GetIpBlockResponseBodyIpBlockZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIpBlockResponseBodyIpBlockZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetIpBlockResponseBodyIpBlock extends TeaModel {
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
        public java.util.List<GetIpBlockResponseBodyIpBlockZoneLayer> zoneLayer;

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

        public static GetIpBlockResponseBodyIpBlock build(java.util.Map<String, ?> map) throws Exception {
            GetIpBlockResponseBodyIpBlock self = new GetIpBlockResponseBodyIpBlock();
            return TeaModel.build(map, self);
        }

        public GetIpBlockResponseBodyIpBlock setIpBlockId(String ipBlockId) {
            this.ipBlockId = ipBlockId;
            return this;
        }
        public String getIpBlockId() {
            return this.ipBlockId;
        }

        public GetIpBlockResponseBodyIpBlock setIpBlockCode(String ipBlockCode) {
            this.ipBlockCode = ipBlockCode;
            return this;
        }
        public String getIpBlockCode() {
            return this.ipBlockCode;
        }

        public GetIpBlockResponseBodyIpBlock setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetIpBlockResponseBodyIpBlock setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetIpBlockResponseBodyIpBlock setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIpBlockResponseBodyIpBlock setOwnership(String ownership) {
            this.ownership = ownership;
            return this;
        }
        public String getOwnership() {
            return this.ownership;
        }

        public GetIpBlockResponseBodyIpBlock setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetIpBlockResponseBodyIpBlock setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIpBlockResponseBodyIpBlock setBackupDeviceName(String backupDeviceName) {
            this.backupDeviceName = backupDeviceName;
            return this;
        }
        public String getBackupDeviceName() {
            return this.backupDeviceName;
        }

        public GetIpBlockResponseBodyIpBlock setZoneLayer(java.util.List<GetIpBlockResponseBodyIpBlockZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }
        public java.util.List<GetIpBlockResponseBodyIpBlockZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public GetIpBlockResponseBodyIpBlock setBusinessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }
        public String getBusinessTypeId() {
            return this.businessTypeId;
        }

        public GetIpBlockResponseBodyIpBlock setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public GetIpBlockResponseBodyIpBlock setNetBusiness(String netBusiness) {
            this.netBusiness = netBusiness;
            return this;
        }
        public String getNetBusiness() {
            return this.netBusiness;
        }

        public GetIpBlockResponseBodyIpBlock setApplication(String application) {
            this.application = application;
            return this;
        }
        public String getApplication() {
            return this.application;
        }

        public GetIpBlockResponseBodyIpBlock setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetIpBlockResponseBodyIpBlock setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
