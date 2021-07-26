// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一。只支持 ASCII 字符，且不能超过 64 个字符
    @NameInMap("ClientToken")
    public String clientToken;

    // 资源一级ID
    @NameInMap("IpBlockId")
    public String ipBlockId;

    // 业务类型UID
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 设备名称
    @NameInMap("DeviceName")
    public String deviceName;

    // 园区名称
    @NameInMap("ZoneName")
    public String zoneName;

    // 备份设备名称
    @NameInMap("BackupDeviceName")
    public String backupDeviceName;

    // 公网地址类型 INC GUEST VIP
    @NameInMap("NetBusiness")
    public String netBusiness;

    // IP归属
    @NameInMap("Ownership")
    public String ownership;

    // IP用途
    @NameInMap("Application")
    public String application;

    // 备注
    @NameInMap("Description")
    public String description;

    // 更新类型 update 更新 split 拆分
    @NameInMap("UpdateType")
    public String updateType;

    // 状态： using available lock
    @NameInMap("Status")
    public String status;

    public static UpdateIpBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockRequest self = new UpdateIpBlockRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIpBlockRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIpBlockRequest setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public UpdateIpBlockRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public UpdateIpBlockRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateIpBlockRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public UpdateIpBlockRequest setBackupDeviceName(String backupDeviceName) {
        this.backupDeviceName = backupDeviceName;
        return this;
    }
    public String getBackupDeviceName() {
        return this.backupDeviceName;
    }

    public UpdateIpBlockRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public UpdateIpBlockRequest setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public UpdateIpBlockRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public UpdateIpBlockRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIpBlockRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateIpBlockRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
