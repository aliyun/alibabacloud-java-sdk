// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeImageCommodityStatusRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("EncryptData")
    public String encryptData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static DescribeImageCommodityStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCommodityStatusRequest self = new DescribeImageCommodityStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageCommodityStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeImageCommodityStatusRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public DescribeImageCommodityStatusRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageCommodityStatusRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
