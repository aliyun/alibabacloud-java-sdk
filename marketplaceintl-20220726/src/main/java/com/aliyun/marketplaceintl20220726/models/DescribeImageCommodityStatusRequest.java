// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityStatusRequest extends TeaModel {
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

    public static DescribeImageCommodityStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityStatusRequest self = new DescribeImageCommodityStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityStatusRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeImageCommodityStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeImageCommodityStatusRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCommodityStatusRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeImageCommodityStatusRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
