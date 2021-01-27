// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetCreditLabelActionRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("ClearCycle")
    public String clearCycle;

    @NameInMap("CreditAmount")
    public String creditAmount;

    @NameInMap("CurrencyCode")
    public String currencyCode;

    @NameInMap("DailyCycle")
    public String dailyCycle;

    @NameInMap("Description")
    public String description;

    @NameInMap("IsNeedAddSettleLabel")
    public String isNeedAddSettleLabel;

    @NameInMap("IsNeedAdjustCreditAccount")
    public String isNeedAdjustCreditAccount;

    @NameInMap("IsNeedSaveNotifyRule")
    public String isNeedSaveNotifyRule;

    @NameInMap("IsNeedSetCreditAmount")
    public String isNeedSetCreditAmount;

    @NameInMap("NeedNotice")
    public Boolean needNotice;

    @NameInMap("NewCreateMode")
    public Boolean newCreateMode;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SiteCode")
    public String siteCode;

    @NameInMap("Source")
    public String source;

    public static SetCreditLabelActionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLabelActionRequest self = new SetCreditLabelActionRequest();
        return TeaModel.build(map, self);
    }

    public SetCreditLabelActionRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SetCreditLabelActionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SetCreditLabelActionRequest setClearCycle(String clearCycle) {
        this.clearCycle = clearCycle;
        return this;
    }
    public String getClearCycle() {
        return this.clearCycle;
    }

    public SetCreditLabelActionRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public SetCreditLabelActionRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public SetCreditLabelActionRequest setDailyCycle(String dailyCycle) {
        this.dailyCycle = dailyCycle;
        return this;
    }
    public String getDailyCycle() {
        return this.dailyCycle;
    }

    public SetCreditLabelActionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetCreditLabelActionRequest setIsNeedAddSettleLabel(String isNeedAddSettleLabel) {
        this.isNeedAddSettleLabel = isNeedAddSettleLabel;
        return this;
    }
    public String getIsNeedAddSettleLabel() {
        return this.isNeedAddSettleLabel;
    }

    public SetCreditLabelActionRequest setIsNeedAdjustCreditAccount(String isNeedAdjustCreditAccount) {
        this.isNeedAdjustCreditAccount = isNeedAdjustCreditAccount;
        return this;
    }
    public String getIsNeedAdjustCreditAccount() {
        return this.isNeedAdjustCreditAccount;
    }

    public SetCreditLabelActionRequest setIsNeedSaveNotifyRule(String isNeedSaveNotifyRule) {
        this.isNeedSaveNotifyRule = isNeedSaveNotifyRule;
        return this;
    }
    public String getIsNeedSaveNotifyRule() {
        return this.isNeedSaveNotifyRule;
    }

    public SetCreditLabelActionRequest setIsNeedSetCreditAmount(String isNeedSetCreditAmount) {
        this.isNeedSetCreditAmount = isNeedSetCreditAmount;
        return this;
    }
    public String getIsNeedSetCreditAmount() {
        return this.isNeedSetCreditAmount;
    }

    public SetCreditLabelActionRequest setNeedNotice(Boolean needNotice) {
        this.needNotice = needNotice;
        return this;
    }
    public Boolean getNeedNotice() {
        return this.needNotice;
    }

    public SetCreditLabelActionRequest setNewCreateMode(Boolean newCreateMode) {
        this.newCreateMode = newCreateMode;
        return this;
    }
    public Boolean getNewCreateMode() {
        return this.newCreateMode;
    }

    public SetCreditLabelActionRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SetCreditLabelActionRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCreditLabelActionRequest setSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }
    public String getSiteCode() {
        return this.siteCode;
    }

    public SetCreditLabelActionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
