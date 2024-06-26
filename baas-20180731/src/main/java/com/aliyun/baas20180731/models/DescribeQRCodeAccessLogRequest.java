// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeQRCodeAccessLogRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeQRCodeAccessLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeQRCodeAccessLogRequest self = new DescribeQRCodeAccessLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeQRCodeAccessLogRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
