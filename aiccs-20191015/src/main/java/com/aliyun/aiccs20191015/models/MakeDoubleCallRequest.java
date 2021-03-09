// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 账号名称
    @NameInMap("AccountName")
    public String accountName;

    // 坐席手机号（需要通过坐席手机呼叫才需要填写）
    @NameInMap("ServicerPhone")
    public String servicerPhone;

    // 用户手机号
    @NameInMap("MemberPhone")
    public String memberPhone;

    // 外呼主叫号码
    @NameInMap("OutboundCallNumber")
    public String outboundCallNumber;

    // 业务携带数据（JsonString）
    @NameInMap("BizData")
    public String bizData;

    public static MakeDoubleCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeDoubleCallRequest self = new MakeDoubleCallRequest();
        return TeaModel.build(map, self);
    }

    public MakeDoubleCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MakeDoubleCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public MakeDoubleCallRequest setServicerPhone(String servicerPhone) {
        this.servicerPhone = servicerPhone;
        return this;
    }
    public String getServicerPhone() {
        return this.servicerPhone;
    }

    public MakeDoubleCallRequest setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
        return this;
    }
    public String getMemberPhone() {
        return this.memberPhone;
    }

    public MakeDoubleCallRequest setOutboundCallNumber(String outboundCallNumber) {
        this.outboundCallNumber = outboundCallNumber;
        return this;
    }
    public String getOutboundCallNumber() {
        return this.outboundCallNumber;
    }

    public MakeDoubleCallRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

}
