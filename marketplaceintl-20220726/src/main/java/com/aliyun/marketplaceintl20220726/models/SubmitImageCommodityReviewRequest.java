// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class SubmitImageCommodityReviewRequest extends TeaModel {
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

    public static SubmitImageCommodityReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageCommodityReviewRequest self = new SubmitImageCommodityReviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImageCommodityReviewRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public SubmitImageCommodityReviewRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public SubmitImageCommodityReviewRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageCommodityReviewRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public SubmitImageCommodityReviewRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
