// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceStatusRequest extends TeaModel {
    @NameInMap("SecretId")
    public String secretId;

    public static DescribeCloudResourceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceStatusRequest self = new DescribeCloudResourceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceStatusRequest setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
