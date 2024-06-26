// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAuthorityRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeQRCodeAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAuthorityRequest self = new DescribeQRCodeAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAuthorityRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
