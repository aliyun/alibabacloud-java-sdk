// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeTransactionsListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0xabds***djskjds</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("Coin")
    public String coin;

    /**
     * <strong>example:</strong>
     * <p>1682235649</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>1682232649</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <strong>example:</strong>
     * <p>in</p>
     */
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
