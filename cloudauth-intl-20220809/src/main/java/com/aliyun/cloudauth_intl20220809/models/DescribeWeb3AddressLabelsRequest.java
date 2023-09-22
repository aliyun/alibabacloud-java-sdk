// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3AddressLabelsRequest extends TeaModel {
    /**
     * <p>The address hash.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>This is the short name of blockchain。</p>
     * <p>[ ETH, MATIC, BNB ]</p>
     */
    @NameInMap("ChainShortName")
    public String chainShortName;

    /**
     * <p>A unique business ID for tracing purpose. For example，the sequence ID from the merchant\"s business-related database.</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    public static DescribeWeb3AddressLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3AddressLabelsRequest self = new DescribeWeb3AddressLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3AddressLabelsRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeWeb3AddressLabelsRequest setChainShortName(String chainShortName) {
        this.chainShortName = chainShortName;
        return this;
    }
    public String getChainShortName() {
        return this.chainShortName;
    }

    public DescribeWeb3AddressLabelsRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

}
