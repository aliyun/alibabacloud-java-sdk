// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class MdbAgentInstanceVo extends TeaModel {
    @NameInMap("AccessUrl")
    public String accessUrl;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("EngineInstanceId")
    public String engineInstanceId;

    @NameInMap("EngineRegion")
    public String engineRegion;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("LastActiveTime")
    public String lastActiveTime;

    @NameInMap("LockTime")
    public String lockTime;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PublicDomain")
    public String publicDomain;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StatusDesc")
    public String statusDesc;

    @NameInMap("StatusMessage")
    public String statusMessage;

    public static MdbAgentInstanceVo build(java.util.Map<String, ?> map) throws Exception {
        MdbAgentInstanceVo self = new MdbAgentInstanceVo();
        return TeaModel.build(map, self);
    }

    public MdbAgentInstanceVo setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }
    public String getAccessUrl() {
        return this.accessUrl;
    }

    public MdbAgentInstanceVo setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public MdbAgentInstanceVo setEngineInstanceId(String engineInstanceId) {
        this.engineInstanceId = engineInstanceId;
        return this;
    }
    public String getEngineInstanceId() {
        return this.engineInstanceId;
    }

    public MdbAgentInstanceVo setEngineRegion(String engineRegion) {
        this.engineRegion = engineRegion;
        return this;
    }
    public String getEngineRegion() {
        return this.engineRegion;
    }

    public MdbAgentInstanceVo setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public MdbAgentInstanceVo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MdbAgentInstanceVo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MdbAgentInstanceVo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public MdbAgentInstanceVo setLastActiveTime(String lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }
    public String getLastActiveTime() {
        return this.lastActiveTime;
    }

    public MdbAgentInstanceVo setLockTime(String lockTime) {
        this.lockTime = lockTime;
        return this;
    }
    public String getLockTime() {
        return this.lockTime;
    }

    public MdbAgentInstanceVo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public MdbAgentInstanceVo setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }
    public String getPublicDomain() {
        return this.publicDomain;
    }

    public MdbAgentInstanceVo setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public MdbAgentInstanceVo setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public MdbAgentInstanceVo setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }
    public String getStatusMessage() {
        return this.statusMessage;
    }

}
