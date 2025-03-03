// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountTransferRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cash</p>
     */
    @NameInMap("FinanceType")
    public String financeType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123212323</p>
     */
    @NameInMap("FromFundAccountId")
    public Long fromFundAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>转账的备注</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11112231</p>
     */
    @NameInMap("ToFundAccountId")
    public Long toFundAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grant</p>
     */
    @NameInMap("TransferType")
    public String transferType;

    public static CreateFundAccountTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountTransferRequest self = new CreateFundAccountTransferRequest();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountTransferRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateFundAccountTransferRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateFundAccountTransferRequest setFinanceType(String financeType) {
        this.financeType = financeType;
        return this;
    }
    public String getFinanceType() {
        return this.financeType;
    }

    public CreateFundAccountTransferRequest setFromFundAccountId(Long fromFundAccountId) {
        this.fromFundAccountId = fromFundAccountId;
        return this;
    }
    public Long getFromFundAccountId() {
        return this.fromFundAccountId;
    }

    public CreateFundAccountTransferRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateFundAccountTransferRequest setToFundAccountId(Long toFundAccountId) {
        this.toFundAccountId = toFundAccountId;
        return this;
    }
    public Long getToFundAccountId() {
        return this.toFundAccountId;
    }

    public CreateFundAccountTransferRequest setTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }
    public String getTransferType() {
        return this.transferType;
    }

}
