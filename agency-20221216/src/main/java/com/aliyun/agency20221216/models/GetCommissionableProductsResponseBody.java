// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCommissionableProductsResponseBody extends TeaModel {
    /**
     * <p>The status code of the response. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetCommissionableProductsResponseBodyData> data;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2103a30617045934095083027d88c5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values: True and False. This parameter indicates only the success of the API call and does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The actual start month in the yyyymm format.</p>
         * 
         * <strong>example:</strong>
         * <p>“202502”</p>
         */
        @NameInMap("ActualStartMonth")
        public String actualStartMonth;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>“oceanbase_obpre_public_intl”</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>“ApsaraDB for OceanBase Pre”</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>Specifies whether the commodity is eligible for commission.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("EligibleForCommission")
        public String eligibleForCommission;

        /**
         * <p>Specifies whether the commodity is eligible for discounts.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("EligibleForDiscount")
        public String eligibleForDiscount;

        /**
         * <p>Specifies whether the commodity is counted towards performance.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("EligibleForPerformance")
        public String eligibleForPerformance;

        /**
         * <p>The actual end month in the yyyymm format.</p>
         * 
         * <strong>example:</strong>
         * <p>“202509”</p>
         */
        @NameInMap("EndMonth")
        public String endMonth;

        /**
         * <p>Specifies whether the commodity is a product line incentive commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("ProductCampaign")
        public String productCampaign;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>“oceanbase”</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>“ApsaraDB for OceanBase”</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>Specifies whether the product is a core product.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("SevenCoreProducts")
        public String sevenCoreProducts;

        /**
         * <p>The display status of the product.</p>
         * 
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

        public GetCommissionableProductsResponseBodyData setEligibleForPerformance(String eligibleForPerformance) {
            this.eligibleForPerformance = eligibleForPerformance;
            return this;
        }
        public String getEligibleForPerformance() {
            return this.eligibleForPerformance;
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
