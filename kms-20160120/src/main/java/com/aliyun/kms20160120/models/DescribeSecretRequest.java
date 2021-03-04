// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretRequest extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("FetchTags")
    public String fetchTags;

    public static DescribeSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretRequest self = new DescribeSecretRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecretRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public DescribeSecretRequest setFetchTags(String fetchTags) {
        this.fetchTags = fetchTags;
        return this;
    }
    public String getFetchTags() {
        return this.fetchTags;
    }

}
