// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetCreditLabelActionRequest extends TeaModel {
    /**
     * <p>The type of the action. Valid values: SET: adds the pay-as-you-go tag. CANCEL: removes the pay-as-you-go tag.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The cycle in which the account is notified of payment. **You do not need to specify this parameter.</p>
     */
    @NameInMap("ClearCycle")
    public String clearCycle;

    /**
     * <p>The credit line of the account.</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>The code of currency that is used. Valid values: USD and CNY.</p>
     */
    @NameInMap("CurrencyCode")
    public String currencyCode;

    /**
     * <p>The cycle in which payment can be deferred. **You do not need to specify this parameter.</p>
     */
    @NameInMap("DailyCycle")
    public String dailyCycle;

    /**
     * <p>The description of the action.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to add the post-settlement tag. **You do not need to specify this parameter.</p>
     */
    @NameInMap("IsNeedAddSettleLabel")
    public String isNeedAddSettleLabel;

    /**
     * <p>Specifies whether to synchronize the monthly settlement tag. **You do not need to specify this parameter.</p>
     */
    @NameInMap("IsNeedAdjustCreditAccount")
    public String isNeedAdjustCreditAccount;

    /**
     * <p>Specifies whether to save the notification rule. **You do not need to specify this parameter.</p>
     */
    @NameInMap("IsNeedSaveNotifyRule")
    public String isNeedSaveNotifyRule;

    /**
     * <p>Specifies whether to set a credit line. **You do not need to specify this parameter.</p>
     */
    @NameInMap("IsNeedSetCreditAmount")
    public String isNeedSetCreditAmount;

    /**
     * <p>Specifies whether to notify the account of an identity change. **You do not need to specify this parameter.</p>
     */
    @NameInMap("NeedNotice")
    public Boolean needNotice;

    /**
     * <p>Specifies whether to call another operation to create a credit ledger. **You do not need to specify this parameter.</p>
     */
    @NameInMap("NewCreateMode")
    public Boolean newCreateMode;

    /**
     * <p>The operator who performs the action.</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The code of the site. **You do not need to specify this parameter.</p>
     */
    @NameInMap("SiteCode")
    public String siteCode;

    /**
     * <p>The source of the action.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("Uid")
    public String uid;

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

    public SetCreditLabelActionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
