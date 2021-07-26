// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockRecordShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 工单名称
    @NameInMap("Title")
    public String title;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 工号
    @NameInMap("WorkNo")
    public String workNo;

    // 公网私网标志 PUBLIC PRIVATE
    @NameInMap("NetType")
    public String netType;

    // 园区层级
    @NameInMap("ZoneLayer")
    public String zoneLayerShrink;

    // 地址业务类型
    @NameInMap("BusinessType")
    public String businessTypeShrink;

    // 公网地址类型 INC GUEST VIP
    @NameInMap("NetBusiness")
    public String netBusiness;

    // 父段地址
    @NameInMap("ParentIpBlock")
    public String parentIpBlock;

    // 申请公网地址的掩码大小
    @NameInMap("Mask")
    public Long mask;

    // 工单类型 Apply 申请工单 Recycle 释放工单
    @NameInMap("RecordType")
    public String recordType;

    // 要释放的IP段
    @NameInMap("IpBlockCode")
    public String ipBlockCodeShrink;

    public static CreateIpBlockRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockRecordShrinkRequest self = new CreateIpBlockRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockRecordShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpBlockRecordShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpBlockRecordShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateIpBlockRecordShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateIpBlockRecordShrinkRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public CreateIpBlockRecordShrinkRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateIpBlockRecordShrinkRequest setZoneLayerShrink(String zoneLayerShrink) {
        this.zoneLayerShrink = zoneLayerShrink;
        return this;
    }
    public String getZoneLayerShrink() {
        return this.zoneLayerShrink;
    }

    public CreateIpBlockRecordShrinkRequest setBusinessTypeShrink(String businessTypeShrink) {
        this.businessTypeShrink = businessTypeShrink;
        return this;
    }
    public String getBusinessTypeShrink() {
        return this.businessTypeShrink;
    }

    public CreateIpBlockRecordShrinkRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public CreateIpBlockRecordShrinkRequest setParentIpBlock(String parentIpBlock) {
        this.parentIpBlock = parentIpBlock;
        return this;
    }
    public String getParentIpBlock() {
        return this.parentIpBlock;
    }

    public CreateIpBlockRecordShrinkRequest setMask(Long mask) {
        this.mask = mask;
        return this;
    }
    public Long getMask() {
        return this.mask;
    }

    public CreateIpBlockRecordShrinkRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CreateIpBlockRecordShrinkRequest setIpBlockCodeShrink(String ipBlockCodeShrink) {
        this.ipBlockCodeShrink = ipBlockCodeShrink;
        return this;
    }
    public String getIpBlockCodeShrink() {
        return this.ipBlockCodeShrink;
    }

}
