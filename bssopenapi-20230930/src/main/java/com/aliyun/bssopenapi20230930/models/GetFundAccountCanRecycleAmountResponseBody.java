// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanRecycleAmountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("AvailableAmount")
    public String availableAmount;

    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>1232122132</p>
     */
    @NameInMap("RecycleFromFundAccountId")
    public String recycleFromFundAccountId;

    @NameInMap("RecycleToFundAccountList")
    public java.util.List<GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList> recycleToFundAccountList;

    /**
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TransferAmount")
    public String transferAmount;

    public static GetFundAccountCanRecycleAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanRecycleAmountResponseBody self = new GetFundAccountCanRecycleAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanRecycleAmountResponseBody setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public GetFundAccountCanRecycleAmountResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public GetFundAccountCanRecycleAmountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountCanRecycleAmountResponseBody setRecycleFromFundAccountId(String recycleFromFundAccountId) {
        this.recycleFromFundAccountId = recycleFromFundAccountId;
        return this;
    }
    public String getRecycleFromFundAccountId() {
        return this.recycleFromFundAccountId;
    }

    public GetFundAccountCanRecycleAmountResponseBody setRecycleToFundAccountList(java.util.List<GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList> recycleToFundAccountList) {
        this.recycleToFundAccountList = recycleToFundAccountList;
        return this;
    }
    public java.util.List<GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList> getRecycleToFundAccountList() {
        return this.recycleToFundAccountList;
    }

    public GetFundAccountCanRecycleAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountCanRecycleAmountResponseBody setTransferAmount(String transferAmount) {
        this.transferAmount = transferAmount;
        return this;
    }
    public String getTransferAmount() {
        return this.transferAmount;
    }

    public static class GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>122323121</p>
         */
        @NameInMap("FundAccountId")
        public String fundAccountId;

        /**
         * <strong>example:</strong>
         * <p>云某的账户</p>
         */
        @NameInMap("FundAccountName")
        public String fundAccountName;

        /**
         * <strong>example:</strong>
         * <p>183221321</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public String fundAccountOwnerAccountId;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxRecyclableAmount")
        public String maxRecyclableAmount;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("OriginalTransferRemainAmount")
        public String originalTransferRemainAmount;

        public static GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList build(java.util.Map<String, ?> map) throws Exception {
            GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList self = new GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList();
            return TeaModel.build(map, self);
        }

        public GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList setFundAccountId(String fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        public GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList setFundAccountName(String fundAccountName) {
            this.fundAccountName = fundAccountName;
            return this;
        }
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        public GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList setFundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        public GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList setMaxRecyclableAmount(String maxRecyclableAmount) {
            this.maxRecyclableAmount = maxRecyclableAmount;
            return this;
        }
        public String getMaxRecyclableAmount() {
            return this.maxRecyclableAmount;
        }

        public GetFundAccountCanRecycleAmountResponseBodyRecycleToFundAccountList setOriginalTransferRemainAmount(String originalTransferRemainAmount) {
            this.originalTransferRemainAmount = originalTransferRemainAmount;
            return this;
        }
        public String getOriginalTransferRemainAmount() {
            return this.originalTransferRemainAmount;
        }

    }

}
