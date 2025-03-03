// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanAllocateCreditAmountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2032123221</p>
     */
    @NameInMap("Ecid")
    public String ecid;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("EcidAllocatedCreditAmount")
    public String ecidAllocatedCreditAmount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("EcidCreditAmount")
    public String ecidCreditAmount;

    /**
     * <strong>example:</strong>
     * <p>202321232</p>
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
     * <p>云某的名称</p>
     */
    @NameInMap("FundAccountName")
    public String fundAccountName;

    /**
     * <strong>example:</strong>
     * <p>123433121</p>
     */
    @NameInMap("FundAccountOwnerAccountId")
    public Long fundAccountOwnerAccountId;

    /**
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("MaxCanAllocateCreditAmount")
    public String maxCanAllocateCreditAmount;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MinCanAllocateCreditAmount")
    public String minCanAllocateCreditAmount;

    /**
     * <strong>example:</strong>
     * <p>2684210001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>CC706AAC-75A6-55B5-9AB7-7D171C6C7655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Site")
    public String site;

    public static GetFundAccountCanAllocateCreditAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanAllocateCreditAmountResponseBody self = new GetFundAccountCanAllocateCreditAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setEcid(String ecid) {
        this.ecid = ecid;
        return this;
    }
    public String getEcid() {
        return this.ecid;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setEcidAllocatedCreditAmount(String ecidAllocatedCreditAmount) {
        this.ecidAllocatedCreditAmount = ecidAllocatedCreditAmount;
        return this;
    }
    public String getEcidAllocatedCreditAmount() {
        return this.ecidAllocatedCreditAmount;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setEcidCreditAmount(String ecidCreditAmount) {
        this.ecidCreditAmount = ecidCreditAmount;
        return this;
    }
    public String getEcidCreditAmount() {
        return this.ecidCreditAmount;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setFundAccountEcid(String fundAccountEcid) {
        this.fundAccountEcid = fundAccountEcid;
        return this;
    }
    public String getFundAccountEcid() {
        return this.fundAccountEcid;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setFundAccountName(String fundAccountName) {
        this.fundAccountName = fundAccountName;
        return this;
    }
    public String getFundAccountName() {
        return this.fundAccountName;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setFundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
        this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
        return this;
    }
    public Long getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setMaxCanAllocateCreditAmount(String maxCanAllocateCreditAmount) {
        this.maxCanAllocateCreditAmount = maxCanAllocateCreditAmount;
        return this;
    }
    public String getMaxCanAllocateCreditAmount() {
        return this.maxCanAllocateCreditAmount;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setMinCanAllocateCreditAmount(String minCanAllocateCreditAmount) {
        this.minCanAllocateCreditAmount = minCanAllocateCreditAmount;
        return this;
    }
    public String getMinCanAllocateCreditAmount() {
        return this.minCanAllocateCreditAmount;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountCanAllocateCreditAmountResponseBody setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
