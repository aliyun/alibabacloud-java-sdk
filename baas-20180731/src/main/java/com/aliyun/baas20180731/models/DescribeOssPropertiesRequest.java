// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOssPropertiesRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeOssPropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssPropertiesRequest self = new DescribeOssPropertiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssPropertiesRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
