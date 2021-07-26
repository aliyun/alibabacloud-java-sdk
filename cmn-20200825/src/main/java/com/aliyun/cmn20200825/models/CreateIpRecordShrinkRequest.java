// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpRecordShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源名称
    @NameInMap("IpRecordName")
    public String ipRecordName;

    // 业务类型uuid
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 设备列表
    @NameInMap("Device")
    public String deviceShrink;

    // 工单类型 Apply 申请工单 Recycle 释放工单
    @NameInMap("RecordType")
    public String recordType;

    // IP地址列表
    @NameInMap("IpCode")
    public String ipCodeShrink;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateIpRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpRecordShrinkRequest self = new CreateIpRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpRecordShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpRecordShrinkRequest setIpRecordName(String ipRecordName) {
        this.ipRecordName = ipRecordName;
        return this;
    }
    public String getIpRecordName() {
        return this.ipRecordName;
    }

    public CreateIpRecordShrinkRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public CreateIpRecordShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateIpRecordShrinkRequest setDeviceShrink(String deviceShrink) {
        this.deviceShrink = deviceShrink;
        return this;
    }
    public String getDeviceShrink() {
        return this.deviceShrink;
    }

    public CreateIpRecordShrinkRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CreateIpRecordShrinkRequest setIpCodeShrink(String ipCodeShrink) {
        this.ipCodeShrink = ipCodeShrink;
        return this;
    }
    public String getIpCodeShrink() {
        return this.ipCodeShrink;
    }

    public CreateIpRecordShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
