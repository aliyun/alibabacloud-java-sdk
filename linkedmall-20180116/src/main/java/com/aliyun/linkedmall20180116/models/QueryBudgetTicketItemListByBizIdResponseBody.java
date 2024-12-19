// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBudgetTicketItemListByBizIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryBudgetTicketItemListByBizIdResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>26F4B2C7-931F-5AC5-8FCC-AE76C9B00D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryBudgetTicketItemListByBizIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBudgetTicketItemListByBizIdResponseBody self = new QueryBudgetTicketItemListByBizIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setModel(java.util.List<QueryBudgetTicketItemListByBizIdResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryBudgetTicketItemListByBizIdResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBudgetTicketItemListByBizIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryBudgetTicketItemListByBizIdResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Invalid")
        public Boolean invalid;

        /**
         * <strong>example:</strong>
         * <p>65******0310</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("PoCode")
        public String poCode;

        /**
         * <strong>example:</strong>
         * <p>68442******012</p>
         */
        @NameInMap("PromotionId")
        public String promotionId;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RemnantAmount")
        public Long remnantAmount;

        /**
         * <strong>example:</strong>
         * <p>c26be******86e5a61cc710cdb</p>
         */
        @NameInMap("SecurityCode")
        public String securityCode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SettlementPrice")
        public Long settlementPrice;

        /**
         * <strong>example:</strong>
         * <p>47******76529</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SubsidyAmount")
        public Long subsidyAmount;

        public static QueryBudgetTicketItemListByBizIdResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryBudgetTicketItemListByBizIdResponseBodyModel self = new QueryBudgetTicketItemListByBizIdResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setInvalid(Boolean invalid) {
            this.invalid = invalid;
            return this;
        }
        public Boolean getInvalid() {
            return this.invalid;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setPoCode(String poCode) {
            this.poCode = poCode;
            return this;
        }
        public String getPoCode() {
            return this.poCode;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setRemnantAmount(Long remnantAmount) {
            this.remnantAmount = remnantAmount;
            return this;
        }
        public Long getRemnantAmount() {
            return this.remnantAmount;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setSecurityCode(String securityCode) {
            this.securityCode = securityCode;
            return this;
        }
        public String getSecurityCode() {
            return this.securityCode;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryBudgetTicketItemListByBizIdResponseBodyModel setSubsidyAmount(Long subsidyAmount) {
            this.subsidyAmount = subsidyAmount;
            return this;
        }
        public Long getSubsidyAmount() {
            return this.subsidyAmount;
        }

    }

}
