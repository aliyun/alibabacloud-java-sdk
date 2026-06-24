// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CreateCloseoutOrderResponseBody extends TeaModel {
    @NameInMap("Module")
    public CreateCloseoutOrderResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloseoutOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloseoutOrderResponseBody self = new CreateCloseoutOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloseoutOrderResponseBody setModule(CreateCloseoutOrderResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateCloseoutOrderResponseBodyModule getModule() {
        return this.module;
    }

    public CreateCloseoutOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCloseoutOrderResponseBodyModule extends TeaModel {
        @NameInMap("BizIds")
        public java.util.Map<String, String> bizIds;

        @NameInMap("BuyerBlockTrade")
        public java.util.List<String> buyerBlockTrade;

        @NameInMap("DomainBlockTrade")
        public java.util.List<String> domainBlockTrade;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainTradeRiskWarn")
        public java.util.List<String> domainTradeRiskWarn;

        @NameInMap("Extend")
        public java.util.Map<String, String> extend;

        @NameInMap("IgnoredDomains")
        public java.util.List<java.util.Map<String, String>> ignoredDomains;

        @NameInMap("NeedPay")
        public Boolean needPay;

        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("OrderSumMoney")
        public Double orderSumMoney;

        @NameInMap("OutOrderNo")
        public String outOrderNo;

        @NameInMap("PayMoney")
        public Double payMoney;

        @NameInMap("PayUrl")
        public String payUrl;

        @NameInMap("RealNameTemplate")
        public java.util.List<Long> realNameTemplate;

        @NameInMap("RequestId")
        public String requestId;

        public static CreateCloseoutOrderResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateCloseoutOrderResponseBodyModule self = new CreateCloseoutOrderResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateCloseoutOrderResponseBodyModule setBizIds(java.util.Map<String, String> bizIds) {
            this.bizIds = bizIds;
            return this;
        }
        public java.util.Map<String, String> getBizIds() {
            return this.bizIds;
        }

        public CreateCloseoutOrderResponseBodyModule setBuyerBlockTrade(java.util.List<String> buyerBlockTrade) {
            this.buyerBlockTrade = buyerBlockTrade;
            return this;
        }
        public java.util.List<String> getBuyerBlockTrade() {
            return this.buyerBlockTrade;
        }

        public CreateCloseoutOrderResponseBodyModule setDomainBlockTrade(java.util.List<String> domainBlockTrade) {
            this.domainBlockTrade = domainBlockTrade;
            return this;
        }
        public java.util.List<String> getDomainBlockTrade() {
            return this.domainBlockTrade;
        }

        public CreateCloseoutOrderResponseBodyModule setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateCloseoutOrderResponseBodyModule setDomainTradeRiskWarn(java.util.List<String> domainTradeRiskWarn) {
            this.domainTradeRiskWarn = domainTradeRiskWarn;
            return this;
        }
        public java.util.List<String> getDomainTradeRiskWarn() {
            return this.domainTradeRiskWarn;
        }

        public CreateCloseoutOrderResponseBodyModule setExtend(java.util.Map<String, String> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, String> getExtend() {
            return this.extend;
        }

        public CreateCloseoutOrderResponseBodyModule setIgnoredDomains(java.util.List<java.util.Map<String, String>> ignoredDomains) {
            this.ignoredDomains = ignoredDomains;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getIgnoredDomains() {
            return this.ignoredDomains;
        }

        public CreateCloseoutOrderResponseBodyModule setNeedPay(Boolean needPay) {
            this.needPay = needPay;
            return this;
        }
        public Boolean getNeedPay() {
            return this.needPay;
        }

        public CreateCloseoutOrderResponseBodyModule setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public CreateCloseoutOrderResponseBodyModule setOrderSumMoney(Double orderSumMoney) {
            this.orderSumMoney = orderSumMoney;
            return this;
        }
        public Double getOrderSumMoney() {
            return this.orderSumMoney;
        }

        public CreateCloseoutOrderResponseBodyModule setOutOrderNo(String outOrderNo) {
            this.outOrderNo = outOrderNo;
            return this;
        }
        public String getOutOrderNo() {
            return this.outOrderNo;
        }

        public CreateCloseoutOrderResponseBodyModule setPayMoney(Double payMoney) {
            this.payMoney = payMoney;
            return this;
        }
        public Double getPayMoney() {
            return this.payMoney;
        }

        public CreateCloseoutOrderResponseBodyModule setPayUrl(String payUrl) {
            this.payUrl = payUrl;
            return this;
        }
        public String getPayUrl() {
            return this.payUrl;
        }

        public CreateCloseoutOrderResponseBodyModule setRealNameTemplate(java.util.List<Long> realNameTemplate) {
            this.realNameTemplate = realNameTemplate;
            return this;
        }
        public java.util.List<Long> getRealNameTemplate() {
            return this.realNameTemplate;
        }

        public CreateCloseoutOrderResponseBodyModule setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
