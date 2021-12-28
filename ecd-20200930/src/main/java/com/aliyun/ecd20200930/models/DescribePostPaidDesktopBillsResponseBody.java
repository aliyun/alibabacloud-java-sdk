// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePostPaidDesktopBillsResponseBody extends TeaModel {
    @NameInMap("Bills")
    public java.util.List<DescribePostPaidDesktopBillsResponseBodyBills> bills;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PostPaidDesktopsBillsUrl")
    public String postPaidDesktopsBillsUrl;

    @NameInMap("PostPaidDesktopsCount")
    public Integer postPaidDesktopsCount;

    @NameInMap("PostPaidDesktopsTotalAmount")
    public Float postPaidDesktopsTotalAmount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePostPaidDesktopBillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePostPaidDesktopBillsResponseBody self = new DescribePostPaidDesktopBillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePostPaidDesktopBillsResponseBody setBills(java.util.List<DescribePostPaidDesktopBillsResponseBodyBills> bills) {
        this.bills = bills;
        return this;
    }
    public java.util.List<DescribePostPaidDesktopBillsResponseBodyBills> getBills() {
        return this.bills;
    }

    public DescribePostPaidDesktopBillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePostPaidDesktopBillsResponseBody setPostPaidDesktopsBillsUrl(String postPaidDesktopsBillsUrl) {
        this.postPaidDesktopsBillsUrl = postPaidDesktopsBillsUrl;
        return this;
    }
    public String getPostPaidDesktopsBillsUrl() {
        return this.postPaidDesktopsBillsUrl;
    }

    public DescribePostPaidDesktopBillsResponseBody setPostPaidDesktopsCount(Integer postPaidDesktopsCount) {
        this.postPaidDesktopsCount = postPaidDesktopsCount;
        return this;
    }
    public Integer getPostPaidDesktopsCount() {
        return this.postPaidDesktopsCount;
    }

    public DescribePostPaidDesktopBillsResponseBody setPostPaidDesktopsTotalAmount(Float postPaidDesktopsTotalAmount) {
        this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
        return this;
    }
    public Float getPostPaidDesktopsTotalAmount() {
        return this.postPaidDesktopsTotalAmount;
    }

    public DescribePostPaidDesktopBillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePostPaidDesktopBillsResponseBodyBills extends TeaModel {
        @NameInMap("BillEndTime")
        public String billEndTime;

        @NameInMap("BillId")
        public String billId;

        @NameInMap("BillStartTime")
        public String billStartTime;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("CashPayment")
        public String cashPayment;

        @NameInMap("ChargeItem")
        public String chargeItem;

        @NameInMap("ConsumeTime")
        public String consumeTime;

        @NameInMap("ConsumeType")
        public String consumeType;

        @NameInMap("DiscountPrice")
        public String discountPrice;

        @NameInMap("GoldNote")
        public String goldNote;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("Payment")
        public String payment;

        @NameInMap("Price")
        public String price;

        @NameInMap("PriceUnit")
        public String priceUnit;

        @NameInMap("Product")
        public String product;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("UsageUnit")
        public String usageUnit;

        public static DescribePostPaidDesktopBillsResponseBodyBills build(java.util.Map<String, ?> map) throws Exception {
            DescribePostPaidDesktopBillsResponseBodyBills self = new DescribePostPaidDesktopBillsResponseBodyBills();
            return TeaModel.build(map, self);
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setBillEndTime(String billEndTime) {
            this.billEndTime = billEndTime;
            return this;
        }
        public String getBillEndTime() {
            return this.billEndTime;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setBillId(String billId) {
            this.billId = billId;
            return this;
        }
        public String getBillId() {
            return this.billId;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setBillStartTime(String billStartTime) {
            this.billStartTime = billStartTime;
            return this;
        }
        public String getBillStartTime() {
            return this.billStartTime;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setCashPayment(String cashPayment) {
            this.cashPayment = cashPayment;
            return this;
        }
        public String getCashPayment() {
            return this.cashPayment;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setChargeItem(String chargeItem) {
            this.chargeItem = chargeItem;
            return this;
        }
        public String getChargeItem() {
            return this.chargeItem;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setConsumeTime(String consumeTime) {
            this.consumeTime = consumeTime;
            return this;
        }
        public String getConsumeTime() {
            return this.consumeTime;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setGoldNote(String goldNote) {
            this.goldNote = goldNote;
            return this;
        }
        public String getGoldNote() {
            return this.goldNote;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setPayment(String payment) {
            this.payment = payment;
            return this;
        }
        public String getPayment() {
            return this.payment;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setPriceUnit(String priceUnit) {
            this.priceUnit = priceUnit;
            return this;
        }
        public String getPriceUnit() {
            return this.priceUnit;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribePostPaidDesktopBillsResponseBodyBills setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

    }

}
