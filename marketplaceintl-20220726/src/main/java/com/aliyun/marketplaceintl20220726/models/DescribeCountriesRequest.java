// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeCountriesRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static DescribeCountriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountriesRequest self = new DescribeCountriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCountriesRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public DescribeCountriesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCountriesRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public DescribeCountriesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
