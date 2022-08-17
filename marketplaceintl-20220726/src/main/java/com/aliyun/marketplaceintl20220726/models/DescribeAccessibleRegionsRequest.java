// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeAccessibleRegionsRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static DescribeAccessibleRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleRegionsRequest self = new DescribeAccessibleRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleRegionsRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeAccessibleRegionsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessibleRegionsRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeAccessibleRegionsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
