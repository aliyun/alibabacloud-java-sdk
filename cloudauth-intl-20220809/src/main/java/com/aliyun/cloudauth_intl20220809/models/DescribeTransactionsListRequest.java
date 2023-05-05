// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeTransactionsListRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Coin")
    public String coin;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("Page")
    public Long page;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("Type")
    public String type;

    public static DescribeTransactionsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionsListRequest self = new DescribeTransactionsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionsListRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeTransactionsListRequest setCoin(String coin) {
        this.coin = coin;
        return this;
    }
    public String getCoin() {
        return this.coin;
    }

    public DescribeTransactionsListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeTransactionsListRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DescribeTransactionsListRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeTransactionsListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeTransactionsListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
