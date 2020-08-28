// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryInstanceGaapCostResponseData data;

    public static QueryInstanceGaapCostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponse self = new QueryInstanceGaapCostResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryInstanceGaapCostResponseDataModulesModule extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("AccountingUnit")
        @Validation(required = true)
        public String accountingUnit;

        @NameInMap("PayerAccount")
        @Validation(required = true)
        public String payerAccount;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        @NameInMap("OrderType")
        @Validation(required = true)
        public String orderType;

        @NameInMap("PayTime")
        @Validation(required = true)
        public String payTime;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public String pretaxGrossAmount;

        @NameInMap("PricingDiscount")
        @Validation(required = true)
        public String pricingDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public String deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public String pretaxAmount;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public String pretaxAmountLocal;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public String deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public String deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public String paymentAmount;

        @NameInMap("GaapPretaxGrossAmount")
        @Validation(required = true)
        public String gaapPretaxGrossAmount;

        @NameInMap("GaapPricingDiscount")
        @Validation(required = true)
        public String gaapPricingDiscount;

        @NameInMap("GaapDeductedByCoupons")
        @Validation(required = true)
        public String gaapDeductedByCoupons;

        @NameInMap("GaapPretaxAmount")
        @Validation(required = true)
        public String gaapPretaxAmount;

        @NameInMap("GaapPretaxAmountLocal")
        @Validation(required = true)
        public String gaapPretaxAmountLocal;

        @NameInMap("GaapDeductedByCashCoupons")
        @Validation(required = true)
        public String gaapDeductedByCashCoupons;

        @NameInMap("GaapDeductedByPrepaidCard")
        @Validation(required = true)
        public String gaapDeductedByPrepaidCard;

        @NameInMap("GaapPaymentAmount")
        @Validation(required = true)
        public String gaapPaymentAmount;

        @NameInMap("MonthGaapPretaxGrossAmount")
        @Validation(required = true)
        public String monthGaapPretaxGrossAmount;

        @NameInMap("MonthGaapPricingDiscount")
        @Validation(required = true)
        public String monthGaapPricingDiscount;

        @NameInMap("MonthGaapDeductedByCoupons")
        @Validation(required = true)
        public String monthGaapDeductedByCoupons;

        @NameInMap("MonthGaapPretaxAmount")
        @Validation(required = true)
        public String monthGaapPretaxAmount;

        @NameInMap("MonthGaapPretaxAmountLocal")
        @Validation(required = true)
        public String monthGaapPretaxAmountLocal;

        @NameInMap("MonthGaapDeductedByCashCoupons")
        @Validation(required = true)
        public String monthGaapDeductedByCashCoupons;

        @NameInMap("MonthGaapDeductedByPrepaidCard")
        @Validation(required = true)
        public String monthGaapDeductedByPrepaidCard;

        @NameInMap("MonthGaapPaymentAmount")
        @Validation(required = true)
        public String monthGaapPaymentAmount;

        @NameInMap("UnallocatedPaymentAmount")
        @Validation(required = true)
        public String unallocatedPaymentAmount;

        @NameInMap("UsageStartDate")
        @Validation(required = true)
        public String usageStartDate;

        @NameInMap("UsageEndDate")
        @Validation(required = true)
        public String usageEndDate;

        @NameInMap("BillType")
        @Validation(required = true)
        public String billType;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("SubOrderId")
        @Validation(required = true)
        public String subOrderId;

        @NameInMap("UnallocatedPretaxGrossAmount")
        @Validation(required = true)
        public String unallocatedPretaxGrossAmount;

        @NameInMap("UnallocatedPricingDiscount")
        @Validation(required = true)
        public String unallocatedPricingDiscount;

        @NameInMap("UnallocatedDeductedByCoupons")
        @Validation(required = true)
        public String unallocatedDeductedByCoupons;

        @NameInMap("UnallocatedPretaxAmount")
        @Validation(required = true)
        public String unallocatedPretaxAmount;

        @NameInMap("UnallocatedPretaxAmountLocal")
        @Validation(required = true)
        public String unallocatedPretaxAmountLocal;

        @NameInMap("UnallocatedDeductedByCashCoupons")
        @Validation(required = true)
        public String unallocatedDeductedByCashCoupons;

        @NameInMap("UnallocatedDeductedByPrepaidCard")
        @Validation(required = true)
        public String unallocatedDeductedByPrepaidCard;

        public static QueryInstanceGaapCostResponseDataModulesModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseDataModulesModule self = new QueryInstanceGaapCostResponseDataModulesModule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryInstanceGaapCostResponseDataModules extends TeaModel {
        @NameInMap("Module")
        @Validation(required = true)
        public java.util.List<QueryInstanceGaapCostResponseDataModulesModule> module;

        public static QueryInstanceGaapCostResponseDataModules build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseDataModules self = new QueryInstanceGaapCostResponseDataModules();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryInstanceGaapCostResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Modules")
        @Validation(required = true)
        public QueryInstanceGaapCostResponseDataModules modules;

        public static QueryInstanceGaapCostResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceGaapCostResponseData self = new QueryInstanceGaapCostResponseData();
            return TeaModel.build(map, self);
        }

    }

}
