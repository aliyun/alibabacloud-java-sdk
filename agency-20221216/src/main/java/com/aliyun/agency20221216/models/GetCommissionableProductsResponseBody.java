// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCommissionableProductsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCommissionableProductsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2103a30617045934095083027d88c5</p>
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
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetCommissionableProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommissionableProductsResponseBody self = new GetCommissionableProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommissionableProductsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCommissionableProductsResponseBody setData(java.util.List<GetCommissionableProductsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCommissionableProductsResponseBodyData> getData() {
        return this.data;
    }

    public GetCommissionableProductsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetCommissionableProductsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCommissionableProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommissionableProductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCommissionableProductsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetCommissionableProductsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>“202502”</p>
         */
        @NameInMap("ActualStartMonth")
        public String actualStartMonth;

        /**
         * <strong>example:</strong>
         * <p>“oceanbase_obpre_public_intl”</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>“ApsaraDB for OceanBase Pre”</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("EligibleForCommission")
        public String eligibleForCommission;

        /**
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("EligibleForDiscount")
        public String eligibleForDiscount;

        /**
         * <strong>example:</strong>
         * <p>“202509”</p>
         */
        @NameInMap("EndMonth")
        public String endMonth;

        /**
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("ProductCampaign")
        public String productCampaign;

        /**
         * <strong>example:</strong>
         * <p>“oceanbase”</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>“ApsaraDB for OceanBase”</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("SevenCoreProducts")
        public String sevenCoreProducts;

        /**
         * <strong>example:</strong>
         * <p>“ONLINE”</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetCommissionableProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCommissionableProductsResponseBodyData self = new GetCommissionableProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCommissionableProductsResponseBodyData setActualStartMonth(String actualStartMonth) {
            this.actualStartMonth = actualStartMonth;
            return this;
        }
        public String getActualStartMonth() {
            return this.actualStartMonth;
        }

        public GetCommissionableProductsResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetCommissionableProductsResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public GetCommissionableProductsResponseBodyData setEligibleForCommission(String eligibleForCommission) {
            this.eligibleForCommission = eligibleForCommission;
            return this;
        }
        public String getEligibleForCommission() {
            return this.eligibleForCommission;
        }

        public GetCommissionableProductsResponseBodyData setEligibleForDiscount(String eligibleForDiscount) {
            this.eligibleForDiscount = eligibleForDiscount;
            return this;
        }
        public String getEligibleForDiscount() {
            return this.eligibleForDiscount;
        }

        public GetCommissionableProductsResponseBodyData setEndMonth(String endMonth) {
            this.endMonth = endMonth;
            return this;
        }
        public String getEndMonth() {
            return this.endMonth;
        }

        public GetCommissionableProductsResponseBodyData setProductCampaign(String productCampaign) {
            this.productCampaign = productCampaign;
            return this;
        }
        public String getProductCampaign() {
            return this.productCampaign;
        }

        public GetCommissionableProductsResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public GetCommissionableProductsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetCommissionableProductsResponseBodyData setSevenCoreProducts(String sevenCoreProducts) {
            this.sevenCoreProducts = sevenCoreProducts;
            return this;
        }
        public String getSevenCoreProducts() {
            return this.sevenCoreProducts;
        }

        public GetCommissionableProductsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
