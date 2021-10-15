// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("CpCode")
    @Validation(required = true)
    public String cpCode;

    @NameInMap("DisputeId")
    @Validation(required = true)
    public Long disputeId;

    @NameInMap("LogisticsNo")
    @Validation(required = true)
    public String logisticsNo;

    @NameInMap("SubLmOrderId")
    @Validation(required = true)
    public String subLmOrderId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static SubmitReturnGoodLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsRequest self = new SubmitReturnGoodLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public SubmitReturnGoodLogisticsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitReturnGoodLogisticsRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public SubmitReturnGoodLogisticsRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public SubmitReturnGoodLogisticsRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public SubmitReturnGoodLogisticsRequest setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public SubmitReturnGoodLogisticsRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public SubmitReturnGoodLogisticsRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public SubmitReturnGoodLogisticsRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
