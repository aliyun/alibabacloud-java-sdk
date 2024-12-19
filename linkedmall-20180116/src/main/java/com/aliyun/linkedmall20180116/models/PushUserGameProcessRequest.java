// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class PushUserGameProcessRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("CurrentStepId")
    public String currentStepId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;gmtCreate\&quot;:\&quot;2022-01-01 00:00:00\&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6734******4397953</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22******343</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;orderNo\&quot;:\&quot;20211204211241160338-120\&quot;,\&quot;serialNumber\&quot;:\&quot;0\&quot;,\&quot;voucherId\&quot;:\&quot;202112040007300238170AD22N26\&quot;,\&quot;userId\&quot;:\&quot;2088312906117381\&quot;}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static PushUserGameProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUserGameProcessRequest self = new PushUserGameProcessRequest();
        return TeaModel.build(map, self);
    }

    public PushUserGameProcessRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public PushUserGameProcessRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushUserGameProcessRequest setCurrentStepId(String currentStepId) {
        this.currentStepId = currentStepId;
        return this;
    }
    public String getCurrentStepId() {
        return this.currentStepId;
    }

    public PushUserGameProcessRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public PushUserGameProcessRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public PushUserGameProcessRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public PushUserGameProcessRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
