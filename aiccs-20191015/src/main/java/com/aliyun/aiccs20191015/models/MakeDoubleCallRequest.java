// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallRequest extends TeaModel {
    /**
     * <p>Account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Business data carried in the request. The value must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bizId&quot;: 123456}</p>
     */
    @NameInMap("BizData")
    public String bizData;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>User\&quot;s phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1502123****</p>
     */
    @NameInMap("MemberPhone")
    public String memberPhone;

    /**
     * <p>Outbound caller number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571000****</p>
     */
    @NameInMap("OutboundCallNumber")
    public String outboundCallNumber;

    /**
     * <p>Agent\&quot;s phone number.  </p>
     * <blockquote>
     * <p>This parameter is required only if the call needs to be placed through the agent\&quot;s phone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>150****1234</p>
     */
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
