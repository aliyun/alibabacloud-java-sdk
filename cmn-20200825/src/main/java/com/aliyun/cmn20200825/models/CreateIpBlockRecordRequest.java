// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockRecordRequest extends TeaModel {
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
    public java.util.List<CreateIpBlockRecordRequestZoneLayer> zoneLayer;

    // 地址业务类型
    @NameInMap("BusinessType")
    public java.util.List<CreateIpBlockRecordRequestBusinessType> businessType;

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
    public java.util.List<String> ipBlockCode;

    public static CreateIpBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockRecordRequest self = new CreateIpBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpBlockRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIpBlockRecordRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateIpBlockRecordRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateIpBlockRecordRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public CreateIpBlockRecordRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateIpBlockRecordRequest setZoneLayer(java.util.List<CreateIpBlockRecordRequestZoneLayer> zoneLayer) {
        this.zoneLayer = zoneLayer;
        return this;
    }
    public java.util.List<CreateIpBlockRecordRequestZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    public CreateIpBlockRecordRequest setBusinessType(java.util.List<CreateIpBlockRecordRequestBusinessType> businessType) {
        this.businessType = businessType;
        return this;
    }
    public java.util.List<CreateIpBlockRecordRequestBusinessType> getBusinessType() {
        return this.businessType;
    }

    public CreateIpBlockRecordRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public CreateIpBlockRecordRequest setParentIpBlock(String parentIpBlock) {
        this.parentIpBlock = parentIpBlock;
        return this;
    }
    public String getParentIpBlock() {
        return this.parentIpBlock;
    }

    public CreateIpBlockRecordRequest setMask(Long mask) {
        this.mask = mask;
        return this;
    }
    public Long getMask() {
        return this.mask;
    }

    public CreateIpBlockRecordRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CreateIpBlockRecordRequest setIpBlockCode(java.util.List<String> ipBlockCode) {
        this.ipBlockCode = ipBlockCode;
        return this;
    }
    public java.util.List<String> getIpBlockCode() {
        return this.ipBlockCode;
    }

    public static class CreateIpBlockRecordRequestZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static CreateIpBlockRecordRequestZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            CreateIpBlockRecordRequestZoneLayer self = new CreateIpBlockRecordRequestZoneLayer();
            return TeaModel.build(map, self);
        }

        public CreateIpBlockRecordRequestZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIpBlockRecordRequestZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateIpBlockRecordRequestBusinessType extends TeaModel {
        // 地址业务类型名称
        @NameInMap("Name")
        public String name;

        // 地址业务类型数量
        @NameInMap("Number")
        public Long number;

        public static CreateIpBlockRecordRequestBusinessType build(java.util.Map<String, ?> map) throws Exception {
            CreateIpBlockRecordRequestBusinessType self = new CreateIpBlockRecordRequestBusinessType();
            return TeaModel.build(map, self);
        }

        public CreateIpBlockRecordRequestBusinessType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateIpBlockRecordRequestBusinessType setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

    }

}
