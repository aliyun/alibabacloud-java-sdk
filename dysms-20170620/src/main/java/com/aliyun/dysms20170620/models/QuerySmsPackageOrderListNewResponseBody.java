// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsPackageOrderListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public QuerySmsPackageOrderListNewResponseBodyList list;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsPackageOrderListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsPackageOrderListNewResponseBody self = new QuerySmsPackageOrderListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsPackageOrderListNewResponseBody setList(QuerySmsPackageOrderListNewResponseBodyList list) {
        this.list = list;
        return this;
    }
    public QuerySmsPackageOrderListNewResponseBodyList getList() {
        return this.list;
    }

    public QuerySmsPackageOrderListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse extends TeaModel {
        @NameInMap("EffectDate")
        public String effectDate;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("PayPrice")
        public String payPrice;

        @NameInMap("State")
        public Integer state;

        public static QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse self = new QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse setEffectDate(String effectDate) {
            this.effectDate = effectDate;
            return this;
        }
        public String getEffectDate() {
            return this.effectDate;
        }

        public QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse setPayPrice(String payPrice) {
            this.payPrice = payPrice;
            return this;
        }
        public String getPayPrice() {
            return this.payPrice;
        }

        public QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

    }

    public static class QuerySmsPackageOrderListNewResponseBodyList extends TeaModel {
        @NameInMap("SmsPackageOrderResponse")
        public java.util.List<QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse> smsPackageOrderResponse;

        public static QuerySmsPackageOrderListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsPackageOrderListNewResponseBodyList self = new QuerySmsPackageOrderListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QuerySmsPackageOrderListNewResponseBodyList setSmsPackageOrderResponse(java.util.List<QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse> smsPackageOrderResponse) {
            this.smsPackageOrderResponse = smsPackageOrderResponse;
            return this;
        }
        public java.util.List<QuerySmsPackageOrderListNewResponseBodyListSmsPackageOrderResponse> getSmsPackageOrderResponse() {
            return this.smsPackageOrderResponse;
        }

    }

}
