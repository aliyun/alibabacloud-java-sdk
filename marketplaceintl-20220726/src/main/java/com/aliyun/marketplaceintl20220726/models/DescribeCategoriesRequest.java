// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCategoriesRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static DescribeCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoriesRequest self = new DescribeCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCategoriesRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeCategoriesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCategoriesRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeCategoriesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
