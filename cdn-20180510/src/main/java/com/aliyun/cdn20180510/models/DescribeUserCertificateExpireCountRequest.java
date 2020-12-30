// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateExpireCountRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeUserCertificateExpireCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateExpireCountRequest self = new DescribeUserCertificateExpireCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateExpireCountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
