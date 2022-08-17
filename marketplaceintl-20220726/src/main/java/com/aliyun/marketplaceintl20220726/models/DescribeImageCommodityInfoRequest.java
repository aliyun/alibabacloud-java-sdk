// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityInfoRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static DescribeImageCommodityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityInfoRequest self = new DescribeImageCommodityInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityInfoRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeImageCommodityInfoRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeImageCommodityInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCommodityInfoRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeImageCommodityInfoRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
