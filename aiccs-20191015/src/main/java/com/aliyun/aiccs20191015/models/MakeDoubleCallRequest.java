// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("BizData")
    public String bizData;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberPhone")
    public String memberPhone;

    @NameInMap("OutboundCallNumber")
    public String outboundCallNumber;

    @NameInMap("ServicerPhone")
    public String servicerPhone;

    public static MakeDoubleCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeDoubleCallRequest self = new MakeDoubleCallRequest();
        return TeaModel.build(map, self);
    }

    public MakeDoubleCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public MakeDoubleCallRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public MakeDoubleCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public MakeDoubleCallRequest setServicerPhone(String servicerPhone) {
        this.servicerPhone = servicerPhone;
        return this;
    }
    public String getServicerPhone() {
        return this.servicerPhone;
    }

}
