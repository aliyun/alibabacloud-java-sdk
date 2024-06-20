// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeAddressLabelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0xabds8292***dskkds</p>
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
     * <p>dso9322***dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    public static DescribeAddressLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressLabelsRequest self = new DescribeAddressLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddressLabelsRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeAddressLabelsRequest setCoin(String coin) {
        this.coin = coin;
        return this;
    }
    public String getCoin() {
        return this.coin;
    }

    public DescribeAddressLabelsRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

}
