// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanTransferAmountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AvailableAmount")
    public String availableAmount;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("CashAmount")
    public String cashAmount;

    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>2032121324</p>
     */
    @NameInMap("FundAccountEcid")
    public String fundAccountEcid;

    /**
     * <strong>example:</strong>
     * <p>12332112</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    /**
     * <strong>example:</strong>
     * <p>云某的账户</p>
     */
    @NameInMap("FundAccountName")
    public String fundAccountName;

    /**
     * <strong>example:</strong>
     * <p>154738212323</p>
     */
    @NameInMap("FundAccountOwnerAccountId")
    public Long fundAccountOwnerAccountId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxTransferableAmount")
    public String maxTransferableAmount;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>2684210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Site")
    public String site;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TransferAmount")
    public String transferAmount;

    public static GetFundAccountCanTransferAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanTransferAmountResponseBody self = new GetFundAccountCanTransferAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanTransferAmountResponseBody setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public GetFundAccountCanTransferAmountResponseBody setCashAmount(String cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }
    public String getCashAmount() {
        return this.cashAmount;
    }

    public GetFundAccountCanTransferAmountResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public GetFundAccountCanTransferAmountResponseBody setFundAccountEcid(String fundAccountEcid) {
        this.fundAccountEcid = fundAccountEcid;
        return this;
    }
    public String getFundAccountEcid() {
        return this.fundAccountEcid;
    }

    public GetFundAccountCanTransferAmountResponseBody setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public GetFundAccountCanTransferAmountResponseBody setFundAccountName(String fundAccountName) {
        this.fundAccountName = fundAccountName;
        return this;
    }
    public String getFundAccountName() {
        return this.fundAccountName;
    }

    public GetFundAccountCanTransferAmountResponseBody setFundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
        this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
        return this;
    }
    public Long getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    public GetFundAccountCanTransferAmountResponseBody setMaxTransferableAmount(String maxTransferableAmount) {
        this.maxTransferableAmount = maxTransferableAmount;
        return this;
    }
    public String getMaxTransferableAmount() {
        return this.maxTransferableAmount;
    }

    public GetFundAccountCanTransferAmountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountCanTransferAmountResponseBody setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetFundAccountCanTransferAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountCanTransferAmountResponseBody setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public GetFundAccountCanTransferAmountResponseBody setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }
    public String getTransferAmount() {
        return this.transferAmount;
    }

}
