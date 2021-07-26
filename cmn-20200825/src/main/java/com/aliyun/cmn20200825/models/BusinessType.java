// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class BusinessType extends TeaModel {
    // 配置规范对象
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    // 业务类型名称
    @NameInMap("Name")
    public String name;

    // 业务类型缩写
    @NameInMap("Abbr")
    public String abbr;

    // 掩码
    @NameInMap("Mask")
    public String mask;

    // 网关地址位置，正数为正数序号，负数为倒数序号
    @NameInMap("Gateway")
    public Long gateway;

    // 是否复用 reuse/single
    @NameInMap("Sharing")
    public String sharing;

    // 分配方向，0表示正向，1表示反向
    @NameInMap("Direction")
    public Long direction;

    // 保留地址数目
    @NameInMap("ReserveNumber")
    public Long reserveNumber;

    // 业务类型大类
    @NameInMap("Type")
    public String type;

    // 绑定的园区类型
    @NameInMap("ZoneType")
    public String zoneType;

    // 有效时间
    @NameInMap("LeaseTime")
    public String leaseTime;

    // Vlan
    @NameInMap("Vlan")
    public String vlan;

    // 业务类型地址申请完对应的动作，DHCP表示需要触发DHCP变更
    @NameInMap("ActionFlag")
    public String actionFlag;

    public static BusinessType build(java.util.Map<String, ?> map) throws Exception {
        BusinessType self = new BusinessType();
        return TeaModel.build(map, self);
    }

    public BusinessType setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public BusinessType setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BusinessType setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public BusinessType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessType setAbbr(String abbr) {
        this.abbr = abbr;
        return this;
    }
    public String getAbbr() {
        return this.abbr;
    }

    public BusinessType setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public BusinessType setGateway(Long gateway) {
        this.gateway = gateway;
        return this;
    }
    public Long getGateway() {
        return this.gateway;
    }

    public BusinessType setSharing(String sharing) {
        this.sharing = sharing;
        return this;
    }
    public String getSharing() {
        return this.sharing;
    }

    public BusinessType setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public BusinessType setReserveNumber(Long reserveNumber) {
        this.reserveNumber = reserveNumber;
        return this;
    }
    public Long getReserveNumber() {
        return this.reserveNumber;
    }

    public BusinessType setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BusinessType setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public BusinessType setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }
    public String getLeaseTime() {
        return this.leaseTime;
    }

    public BusinessType setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

    public BusinessType setActionFlag(String actionFlag) {
        this.actionFlag = actionFlag;
        return this;
    }
    public String getActionFlag() {
        return this.actionFlag;
    }

}
