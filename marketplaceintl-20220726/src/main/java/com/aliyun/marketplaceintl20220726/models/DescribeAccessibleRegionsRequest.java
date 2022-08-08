// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeAccessibleRegionsRequest extends TeaModel {
    @NameInMap("EncryptData")
    public String encryptData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static DescribeAccessibleRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleRegionsRequest self = new DescribeAccessibleRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleRegionsRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public DescribeAccessibleRegionsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessibleRegionsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
