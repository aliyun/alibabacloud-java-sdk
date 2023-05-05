// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeMaliciousAddressRequest extends TeaModel {
    @NameInMap("Coin")
    public String coin;

    @NameInMap("End")
    public String end;

    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("Start")
    public String start;

    public static DescribeMaliciousAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaliciousAddressRequest self = new DescribeMaliciousAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMaliciousAddressRequest setCoin(String coin) {
        this.coin = coin;
        return this;
    }
    public String getCoin() {
        return this.coin;
    }

    public DescribeMaliciousAddressRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public DescribeMaliciousAddressRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DescribeMaliciousAddressRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
