// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class BusinessType extends TeaModel {
    @NameInMap("Abbr")
    public String abbr;

    @NameInMap("ActionFlag")
    public String actionFlag;

    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Direction")
    public Long direction;

    @NameInMap("Gateway")
    public Long gateway;

    @NameInMap("LeaseTime")
    public String leaseTime;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("Name")
    public String name;

    @NameInMap("ReserveNumber")
    public Long reserveNumber;

    @NameInMap("Sharing")
    public String sharing;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Vlan")
    public String vlan;

    @NameInMap("ZoneType")
    public String zoneType;

    public static BusinessType build(java.util.Map<String, ?> map) throws Exception {
        BusinessType self = new BusinessType();
        return TeaModel.build(map, self);
    }

    public BusinessType setAbbr(String abbr) {
        this.abbr = abbr;
        return this;
    }
    public String getAbbr() {
        return this.abbr;
    }

    public BusinessType setActionFlag(String actionFlag) {
        this.actionFlag = actionFlag;
        return this;
    }
    public String getActionFlag() {
        return this.actionFlag;
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

    public BusinessType setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public BusinessType setGateway(Long gateway) {
        this.gateway = gateway;
        return this;
    }
    public Long getGateway() {
        return this.gateway;
    }

    public BusinessType setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }
    public String getLeaseTime() {
        return this.leaseTime;
    }

    public BusinessType setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public BusinessType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessType setReserveNumber(Long reserveNumber) {
        this.reserveNumber = reserveNumber;
        return this;
    }
    public Long getReserveNumber() {
        return this.reserveNumber;
    }

    public BusinessType setSharing(String sharing) {
        this.sharing = sharing;
        return this;
    }
    public String getSharing() {
        return this.sharing;
    }

    public BusinessType setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BusinessType setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public BusinessType setVlan(String vlan) {
        this.vlan = vlan;
        return this;
    }
    public String getVlan() {
        return this.vlan;
    }

    public BusinessType setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
